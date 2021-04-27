package structural.decorator;

public class App {
    public static void main(String[] args) {
        String text = "Hello world!!!";

        DataSourceDecorator decorator = new EncryptionDecorator(new CompressionDecorator(new BaseDataSource("test.txt")));

        // encrypt and compress text and save into test.txt
        decorator.write(text);

        // to check decorator
        BaseDataSource baseDataSource = new BaseDataSource("test.txt");
        System.out.println("Encrypted and compressed text: " + baseDataSource.read());

        System.out.println("Decrypted and decompressed text: " + decorator.read());
    }
}