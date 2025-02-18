import tools.aqua.concolic.Verifier;

public class Example5 {
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;

    public static void main(String[] args) {
        a = Verifier.nondetInt();
        b = Verifier.nondetInt();
        c = Verifier.nondetInt();
        d = Verifier.nondetInt();
        e = Verifier.nondetInt();

        if(a < 3 && b < 2 && c < 1 && d> 12 && e > 100) {
            System.out.println("This worked");
        } else if(a <2 && b < 3) {
            System.out.println("This worked too");
        } else {
            System.out.println("Last cased");
        }
    }

}