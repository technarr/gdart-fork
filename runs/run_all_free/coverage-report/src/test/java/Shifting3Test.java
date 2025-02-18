import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class Shifting3Test {

    @Test
    void test_valuationNr_0() {
        Shifting3.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2147483647);
            Shifting3.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(37);
            Shifting3.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(64);
            Shifting3.main(new String[] {});
        }
    }
}
