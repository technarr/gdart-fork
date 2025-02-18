import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class FloatClassTest {

    @Test
    void test_valuationNr_0() {
        FloatClass.main(new String[] {});
    }
}
