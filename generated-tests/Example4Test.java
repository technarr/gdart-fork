package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import com.example.Example4;
import tools.aqua.concolic.Verifier;

class Example4Test {

    @Test
    void test_valuationNr_0() {
        Example4.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 4);
            Example4.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 8);
            Example4.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(8);
            Example4.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_4() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(8, 8);
            Example4.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_5() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(6, 6);
            mockedVerifier.when(Verifier::nondetString).thenReturn("a");
            Example4.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_6() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(2147483638, 9);
            Example4.main(new String[] {});
        }
    }
}
