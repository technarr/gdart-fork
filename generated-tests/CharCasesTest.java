package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class CharCasesTest {

    @Test
    void test_valuationNr_0() {
        CharCases.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            CharCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetShort).thenReturn((short) 1);
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            CharCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetShort).thenReturn((short) 256);
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            CharCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetShort).thenReturn((short) -1);
        }
    }
}
