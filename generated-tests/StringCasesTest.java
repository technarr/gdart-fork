package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class StringCasesTest {

    @Test
    void test_valuationNr_0() {
        StringCases.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            StringCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetString).thenReturn("A");
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            StringCases.main(new String[] {});
            mockedVerifier.when(Verifier::nondetString).thenReturn("a");
        }
    }
}
