import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class Shifting3Test {

    @Test
    void test_valuationNr_0() {
        Shifting3.main(new String[] {});
    }
}
