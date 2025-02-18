import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class OverapproximationString01Test {

    @Test
    void test_valuationNr_0() {
        OverapproximationString01.main(new String[] {});
    }
}
