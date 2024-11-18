package Batman;

/**
 * Class cl3 that extends cl1 and implements interface if3.
 */
public class cl3 extends cl1 implements if3 {

    /**
     * Implementation of meth3 from interface if3.
     */
    public void meth3() {
        System.out.println("Cl3: meth3");
    }

    /**
     * Overrides meth1 from cl1.
     */
    public void meth1() {
        System.out.println("Cl3: meth1");
    }
}