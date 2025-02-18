import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class Example5Test {

    @Test
    void test_valuationNr_0() {
        Example5.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2, -2147483645, 0, -2147483635);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2, -2147483645, 0, 13);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483646, -2147483645, 0, 13, -2147483547);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_4() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483646, -2147483645, 0, 13, 101);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_5() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483646, -2147483645, 2147483647);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_6() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2, -2147483645, 2147483647);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_7() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2, 2147483646);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_8() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483646, 2147483646);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_9() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483646, 2);
            Example5.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_10() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2147483646);
            Example5.main(new String[] {});
        }
    }
}
