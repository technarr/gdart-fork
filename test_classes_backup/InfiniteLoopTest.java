import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class InfiniteLoopTest {

    @Test
    void test_valuationNr_0() {
        InfiniteLoop.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2147483647);
            InfiniteLoop.main(new String[] {});
        }
    }
}
