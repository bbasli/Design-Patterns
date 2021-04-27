package structural.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        super.write(compress(data));
    }

    @Override
    public String read() {
        return decompress(super.read());
    }

    private String compress(String data) {
        byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(
                    byteArrayOutputStream, new Deflater(5)
            );
            deflaterOutputStream.write(dataBytes);
            deflaterOutputStream.close();
            byteArrayOutputStream.close();

            return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            System.out.println("Compression IOException: " + e.getMessage());
        }
        return "";
    }

    private String decompress(String data) {
        byte[] dataBytes = Base64.getDecoder().decode(data);
        try {
            InputStream inputStream = new ByteArrayInputStream(dataBytes);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            int i;
            while ((i = inflaterInputStream.read()) != -1)
                byteArrayOutputStream.write(i);

            inputStream.close();
            inflaterInputStream.close();
            byteArrayOutputStream.close();

            return new String(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            System.out.println("Decompression IOException: " + e.getMessage());
        }
        return "";
    }
}
