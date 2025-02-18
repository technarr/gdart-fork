package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class ByteCasesTest {

    @Test
    void test_valuationNr_0() {
        ByteCases.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            ByteCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetByte).thenReturn((byte) -127);
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            ByteCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetByte).thenReturn((byte) 127);
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            ByteCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetByte).thenReturn((byte) -128);
        }
    }
}
