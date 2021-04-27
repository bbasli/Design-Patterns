package structural.composite;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> files = new ArrayList<>();
    private String foldername;

    public Composite(String s) {
        this.foldername = s;
    }

    public void add(Component c) {
        files.add(c);
    }

    public int size() {
        int size = 0;
        for (Component c : files)
            size += c.size();
        return size;
    }
}
