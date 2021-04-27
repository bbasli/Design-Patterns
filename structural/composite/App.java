package structural.composite;

public class App {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component usr = new Composite("usr");

        root.add(usr);
        Component text1 = new Leaf("text1.txt", 100);
        root.add(text1);

        Component text2 = new Leaf("text2.txt", 150);
        Component text3 = new Leaf("text3.txt", 200);
        usr.add(text2);
        usr.add(text3);

        System.out.println("root directory size: " + root.size());
        System.out.println("usr directory size: " + usr.size());

    }
}
