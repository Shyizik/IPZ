/**
 * Main class to demonstrate graph traversal using DFS and BFS.
 * @author Yukhymchuk Bohdan
 */
public class TestMain {
    /**
     * Entry point of the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        GraphFactory A = new GraphFactory();
        Graph B = A.generaterandgraph();
        Iterator D = new Iterator(B);
        System.out.println("list of all nodes: " + B.allnodes + "\n");
        for (int i = 0; i < B.allnodes.size(); i++) {
            System.out.println(B.allnodes.get(i) + " I am visited! -" + B.allnodes.get(i).visited + "\n");
        }
        System.out.println("Deep picking! ");
        D.DFS();
        for (int i = 0; i < B.allnodes.size(); i++) {
            System.out.println(B.allnodes.get(i) + " I am visited! -" + B.allnodes.get(i).visited + "\n");
        }
        for (int i = 0; i < B.allnodes.size(); i++) {
            B.allnodes.get(i).visited = false;
        }
        System.out.println("Breadth picking! ");
        D.BFS();
        for (int i = 0; i < B.allnodes.size(); i++) {
            System.out.println(B.allnodes.get(i) + " I am visited! -" + B.allnodes.get(i).visited + "\n");
        }
    }
}
