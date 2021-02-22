package structural.decorator;

public class App {
    public static void main(String[] args) {
        Text text = new Text();
        Decorator d = new ToUpperCaseDecorator(new ReplaceSpaceWithStar(text));
        System.out.println(d.format("abc 123"));
    }
}
