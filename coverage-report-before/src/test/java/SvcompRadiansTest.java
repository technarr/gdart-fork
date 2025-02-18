import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class SvcompRadiansTest {

    @Test
    void test_valuationNr_0() {
        SvcompRadians.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetDouble).thenReturn(Double.NaN);
            SvcompRadians.main(new String[] {});
        }
    }
}
