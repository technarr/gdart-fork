package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class SvcompFloatTest {

    @Test
    void test_valuationNr_0() {
        SvcompFloat.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetFloat).thenReturn(Infinity, -0.000000); //TODO
            SvcompFloat.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetFloat).thenReturn(1.000122, 3.000011);
            SvcompFloat.main(new String[] {});
        }
    }
}
