package structural.decorator;

public class DataSourceDecorator extends DataSource {
    private DataSource dataSource;

    public DataSourceDecorator(DataSource ds) {
        this.dataSource = ds;
    }

    @Override
    public void write(String data) {
        dataSource.write(data);
    }

    @Override
    public String read() {
        return dataSource.read();
    }
}
