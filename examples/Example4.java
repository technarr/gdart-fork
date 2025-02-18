import tools.aqua.concolic.Verifier;


public class Example4 {
    private static int a;
    private static int b;
    private static String d;

    public static void main(String[] args) {
        a = Verifier.nondetInt();
        b = Verifier.nondetInt();
        d = Verifier.nondetString();
        int c = 0;

        if (a < 5 && b < 3) {
            c = a;
        } else if (b < 5) {
            c = b;
        } else if (a == b && "a".equals(d)) {
            c = a;
        } else {
            assert false;
        }
    }

}