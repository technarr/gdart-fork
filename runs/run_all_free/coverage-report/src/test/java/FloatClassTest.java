import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class FloatClassTest {

    @Test
    void test_valuationNr_0() {
        FloatClass.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetFloat).thenReturn(Float.NEGATIVE_INFINITY, -1.000000F);
            FloatClass.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetFloat).thenReturn(-0.000000F, Float.NaN);
            FloatClass.main(new String[] {});
        }
    }
}
