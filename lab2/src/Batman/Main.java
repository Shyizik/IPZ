package Batman;
/**
 * Main class to demonstrate the usage of cl1, cl2, and cl3 classes.
 */
public class Main {
    /**
     * The main method is the entry point of the program.
     * It creates instances of cl1, cl2, and cl3 classes and calls their methods.
     *
     * @author Bohdan Yukhymchuk
     */
    public static void main(String[] args) {
        cl1 cl1 = new cl1();
        cl2 cl2 = new cl2();
        cl3 cl3 = new cl3();

        cl1.meth1();
        cl2.meth2();
        cl2.meth1();
        cl3.meth3();
        cl3.meth1();
    }
}
