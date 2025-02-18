import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class FloatCasesTest {

    @Test
    void test_valuationNr_0() {
        FloatCases.main(new String[] {});
    }
}
