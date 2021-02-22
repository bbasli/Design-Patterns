package structural.decorator;

public class ToUpperCaseDecorator extends TextDecorator {

    public ToUpperCaseDecorator(Decorator d) {
        super(d);
    }

    @Override
    public String format(String s) {
        return super.format(toUpperCase(s));
    }

    public String toUpperCase(String text) {
        return text.toUpperCase();
    }
}
