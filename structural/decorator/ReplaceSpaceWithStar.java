package structural.decorator;

public class ReplaceSpaceWithStar extends TextDecorator {

    public ReplaceSpaceWithStar(Decorator d) {
        super(d);
    }

    @Override
    public String format(String text) {
        return super.format(splitBySpace(text));
    }

    public String splitBySpace(String text) {
        return text.replace(" ", "***");
    }
}
