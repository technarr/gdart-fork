import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class Addition01Test {

    @Test
    void test_valuationNr_0() {
        Addition01.main(new String[] {});
    }
}
