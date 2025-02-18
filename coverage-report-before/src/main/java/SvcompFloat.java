
import tools.aqua.concolic.Verifier;

public class SvcompFloat {

    public static void main(String[] args) {
        float a = Verifier.nondetFloat();
        float b = Verifier.nondetFloat();
        assert (a + b != a || b == 0.0);
    }
}