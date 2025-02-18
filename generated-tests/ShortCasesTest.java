package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class ShortCasesTest {

    @Test
    void test_valuationNr_0() {
        ShortCases.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            ShortCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetShort).thenReturn((short) -32766);
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            ShortCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetShort).thenReturn((short) 32767);
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            ShortCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetShort).thenReturn((short) -32768);
        }
    }
}
