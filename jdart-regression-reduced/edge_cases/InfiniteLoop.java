import tools.aqua.concolic.Verifier;

public class InfiniteLoop {
    private InfiniteLoop(){}

    private static int i;
    public static void main(String[] args) {
        i = Verifier.nondetInt();
        if (i == Integer.MAX_VALUE -1) {
            while (true) {
                try {
                    i = Math.addExact(i, 1);
                } catch (ArithmeticException e) {
                    break;
                }
            }
        }
    }
}