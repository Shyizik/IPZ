import java.util.ArrayList;

/**
 * Represents a graph with nodes and edges.
 * @author Yukhymchuk Bohdan
 */
public class Graph {
    public Node top;
    public ArrayList<EndNode> allnodes = new ArrayList<>();

    /**
     * Constructs a graph with predefined structure.
     */
    public Graph() {
        ArrayList<EndNode> a = new ArrayList<>();
        ArrayList<EndNode> b = new ArrayList<>();
        ArrayList<EndNode> c = new ArrayList<>();
        ArrayList<EndNode> d = new ArrayList<>();
        ArrayList<EndNode> d1 = new ArrayList<>();

        d.add(new EndNode());
        d.add(new EndNode());
        d.add(new EndNode());
        d1.add(new EndNode());
        d1.add(new EndNode());

        c.add(new Node(43, d));
        c.add(new Node(34, d1));
        c.add(new EndNode());
        b.add(new Node(23, c));
        b.add(new EndNode());

        a.add(new EndNode());
        a.add(new EndNode());
        a.add(new Node(21, b));
        a.add(new EndNode());
        a.add(new EndNode());

        this.top = new Node(1, a);
        allnodes.add(this.top);
        allnodes.addAll(a);
        allnodes.addAll(b);
        allnodes.addAll(c);
        allnodes.addAll(d);
        allnodes.addAll(d1);
    }
}
