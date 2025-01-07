import java.util.ArrayList;

/**
 * Represents a node in the graph with a list of neighboring nodes.
 * @author Yukhymchuk Bohdan
 */
public class Node extends EndNode {
    public int name;
    public ArrayList<EndNode> neighbours;

    /**
     * Constructor to create a node with no neighbors.
     * @param i Node identifier
     */
    public Node(int i) {
        super();
        this.name = i;
    }

    /**
     * Constructor to create a node with specified neighbors.
     * @param i Node identifier
     * @param neighbours List of neighboring nodes
     */
    public Node(int i, ArrayList<EndNode> neighbours) {
        this.name = i;
        this.neighbours = neighbours;
    }

    /**
     * Returns the name of the node and its neighbors.
     * @return Name of the node
     */
    public int getnodedata() {
        System.out.println("The name of Node: " + name + "\n The neighbours: " + neighbours);
        return name;
    }

    /**
     * Returns the list of neighboring nodes.
     * @return List of neighbors
     */
    public ArrayList<EndNode> getneighbours() {
        return neighbours;
    }
}
