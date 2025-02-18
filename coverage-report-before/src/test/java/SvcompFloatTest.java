import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class SvcompFloatTest {

    @Test
    void test_valuationNr_0() {
        SvcompFloat.main(new String[] {});
    }
}
