import tools.aqua.concolic.Verifier;

public class DeadCode {
    public static void main(String[] args) {
        int x = Verifier.nondetInt();
        int y = Verifier.nondetInt();

        // The following if-condition cannot be true
        if (x != y && x == y) {
            System.out.println("This code is never reached.");
        } else {
            System.out.println("Condition was false.");
        }

        System.out.println("End of program.");
    }
}