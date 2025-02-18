import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class BooleanCasesTest {

    @Test
    void test_valuationNr_0() {
        BooleanCases.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetBoolean).thenReturn(true);
            BooleanCases.main(new String[] {});
        }
    }
}
