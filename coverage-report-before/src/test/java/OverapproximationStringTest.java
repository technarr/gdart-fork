import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class OverapproximationStringTest {

    @Test
    void test_valuationNr_0() {
        OverapproximationString.main(new String[] {});
    }
}
