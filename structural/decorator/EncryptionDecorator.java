package structural.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    public String encode(String data) {
        byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
        for (byte b : dataBytes)
            b += 5;
        return Base64.getEncoder().encodeToString(dataBytes);
    }

    public String decode(String data) {
        byte[] dataBytes = Base64.getDecoder().decode(data);
        for (byte b : dataBytes)
            b -= (byte) 5;
        return new String(dataBytes);
    }
}
