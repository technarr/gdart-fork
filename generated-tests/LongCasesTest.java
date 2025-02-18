package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class LongCasesTest {

    @Test
    void test_valuationNr_0() {
        LongCases.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            LongCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetLong).thenReturn(2L);
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            LongCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetLong).thenReturn(9223372036854775807L);
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            LongCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetLong).thenReturn(-9223372036854775808L);
        }
    }
}
