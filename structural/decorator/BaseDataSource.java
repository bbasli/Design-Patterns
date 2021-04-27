package structural.decorator;

import java.io.*;
import java.util.Scanner;

public class BaseDataSource extends DataSource {
    private String filename;

    public BaseDataSource(String s) {
        this.filename = s;
    }

    @Override
    public void write(String data) {
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream(filename));
            outputStream.println(data);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("BaseDecorator IOException, " + e.getMessage());
        }
    }

    @Override
    public String read() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(filename));
            String data = "";
            while (scanner.hasNext())
                data += scanner.next();

            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
