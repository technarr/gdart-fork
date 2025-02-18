import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class Example2Test {

    @Test
    void test_valuationNr_0() {
        Example2.main(new String[] {});
    }
}
