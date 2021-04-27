package structural.composite;

public class Component {
    public int size() {
        return 0;
    }

    public void add(Component c) {
        System.out.println("Error: Component can not add!");
    }
}
