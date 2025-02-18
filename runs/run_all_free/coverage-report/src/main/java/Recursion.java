import tools.aqua.concolic.Verifier;

public class Recursion {
    public static int recursiveFunction(int n) {
        if (n <= 0) {
            return 1;
        }
        return recursiveFunction(n - 1);
    }

    public static void main(String[] args) {
        int n = Verifier.nondetInt();
        if (n<5) {
            recursiveFunction(n);
        }
    }
}
