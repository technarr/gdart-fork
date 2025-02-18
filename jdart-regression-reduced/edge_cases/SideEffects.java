import tools.aqua.concolic.Verifier;

public class SideEffects {
    private static int state = 0;

    public static void main(String[] args) {
        int x = Verifier.nondetInt();

        if (x > 10) {
            state = 1;
        } else {
            state = -1;
        }

        System.out.println("State: " + state);
    }
}