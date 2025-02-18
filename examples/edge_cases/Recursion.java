import tools.aqua.concolic.Verifier;

public class Recursion {
    public static int recursiveFunction(int n) {
        if (n == 0) { // oder hier anderen check
            return 1;
        }
        return recursiveFunction(n - 1); // Recursive call
        //TODO: overflow passiert; mit +1 etc. probieren; weil mit negativer Zahl angefangen wird
    }

    public static void main(String[] args) {
        int n = Verifier.nondetInt();
        recursiveFunction(n);
    }
}
