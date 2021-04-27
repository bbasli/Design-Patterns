package structural.composite;

public class Leaf extends Component {
    private String filename;
    private int size;

    public Leaf(String s, int i) {
        this.filename = s;
        this.size = i;
    }

    public int size() {
        return size;
    }
}
