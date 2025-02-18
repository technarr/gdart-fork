import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class BoundCheck200Test {

    @Test
    void test_valuationNr_0() {
        BoundCheck200.main(new String[] {});
    }
}
