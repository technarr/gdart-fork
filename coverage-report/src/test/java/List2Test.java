import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class List2Test {

    @Test
    void test_valuationNr_0() {
        List2.main(new String[] {});
    }
}
