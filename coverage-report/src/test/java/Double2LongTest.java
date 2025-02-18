import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class Double2LongTest {

    @Test
    void test_valuationNr_0() {
        Double2Long.main(new String[] {});
    }
}
