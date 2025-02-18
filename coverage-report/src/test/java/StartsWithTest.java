import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class StartsWithTest {

    @Test
    void test_valuationNr_0() {
        StartsWith.main(new String[] {});
    }
}
