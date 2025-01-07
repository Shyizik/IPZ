import java.util.LinkedList;

/**
 * Implements DFS and BFS traversal for a graph.
 * @author Yukhymchuk Bohdan
 */
public class Iterator {
    EndNode ptr;
    Graph thisgraph;

    /**
     * Constructor to initialize the iterator with a graph.
     * @param gr Graph to be traversed
     */
    public Iterator(Graph gr) {
        thisgraph = gr;
        ptr = thisgraph.top;
    }

    /**
     * Returns the first node of the graph.
     * @return First node of the graph
     */
    public Node first() {
        return thisgraph.top;
    }

    /**
     * Performs a Depth-First Search starting from the given node.
     * @param nd Starting node
     */
    public void DFS(EndNode nd) {
        nd.visited = true;
        if (nd instanceof Node) {
            for (EndNode neighbour : ((Node) nd).neighbours) {
                if (!neighbour.visited) {
                    this.DFS(neighbour);
                }
            }
        }
    }

    /**
     * Performs a Depth-First Search on all nodes in the graph.
     */
    public void DFS() {
        for (EndNode node : thisgraph.allnodes) {
            node.visited = false;
        }
        for (EndNode node : thisgraph.allnodes) {
            this.DFS(node);
        }
    }

    /**
     * Performs a Breadth-First Search starting from the first node.
     */
    public void BFS() {
        LinkedList<EndNode> queue = new LinkedList<>();
        ptr.visited = true;
        queue.add(ptr);
        while (!queue.isEmpty()) {
            ptr = queue.poll();
            if (ptr instanceof Node) {
                for (EndNode neighbour : ((Node) ptr).neighbours) {
                    if (!neighbour.visited) {
                        neighbour.visited = true;
                        queue.add(neighbour);
                    }
                }
            }
        }
    }

    /**
     * Returns the current node in the traversal.
     * @return Current node
     */
    public EndNode currentitem() {
        return ptr;
    }
}
