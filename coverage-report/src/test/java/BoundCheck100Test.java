import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class BoundCheck100Test {

    @Test
    void test_valuationNr_0() {
        BoundCheck100.main(new String[] {});
    }
}
