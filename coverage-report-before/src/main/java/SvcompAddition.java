import tools.aqua.concolic.Verifier;


public class SvcompAddition {

    public static int addition(
            int m,
            int n,
            int c
    ) {
        if (n == 0) {
            return m;
        }

        if (c >= 150) {
            assert false;
        }

        if (n > 0) {
            return addition(m + 1, n - 1, ++c);
        } else {
            return addition(m - 1, n + 1, ++c);
        }
    }

    public static void main(String[] args) {
        int m = Verifier.nondetInt();
        if (m < 0 || m >= 10000) {
            return;
        }
        int n = Verifier.nondetInt();
        if (n < 0 || n >= 10000) {
            return;
        }
        int c = 0;
        int result = addition(m, n, c);
        assert (result == m + n);
    }
}