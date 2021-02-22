package structural.decorator;

public class TextDecorator extends Decorator {
    private Decorator decorator;

    public TextDecorator(Decorator d) {
        this.decorator = d;
    }

    public String format(String text) {
        return this.decorator.format(text);
    }
}
