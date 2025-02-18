package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class IntegerCasesTest {

    @Test
    void test_valuationNr_0() {
        IntegerCases.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            IntegerCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1);
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            IntegerCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2147483647);
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            IntegerCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483648);
        }
    }
}
