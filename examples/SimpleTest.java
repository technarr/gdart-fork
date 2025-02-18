import tools.aqua.concolic.Verifier;

public class SimpleTest {
    public static void main(String[] args) {
        int x = Verifier.nondetInt();
        if (x < 0) {
            assert false;  // intentionally fail for negative values
        } else {
            System.out.println("x is non-negative: " + x);
        }
    }
}