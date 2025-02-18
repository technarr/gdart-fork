import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class SvcompListTest {

    @Test
    void test_valuationNr_0() {
        SvcompList.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_4() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_5() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_6() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_7() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_8() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_9() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_10() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_11() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_12() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_13() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_14() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_15() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_16() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_17() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_18() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_19() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_20() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_21() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_22() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_23() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_24() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_25() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_26() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_27() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_28() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_29() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_30() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_31() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_32() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_33() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_34() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_35() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_36() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_37() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_38() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_39() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_40() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_41() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_42() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_43() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_44() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_45() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_46() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_47() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_48() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_49() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_50() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_51() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_52() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_53() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_54() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_55() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_56() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_57() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_58() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_59() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_60() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_61() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_62() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_63() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, -2147483647, 1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_64() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_65() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_66() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_67() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_68() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_69() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_70() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_71() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_72() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_73() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_74() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_75() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_76() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_77() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_78() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_79() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_80() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_81() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_82() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_83() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_84() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_85() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_86() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_87() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_88() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_89() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_90() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_91() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_92() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_93() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_94() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_95() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_96() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_97() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_98() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_99() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_100() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_101() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_102() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_103() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_104() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_105() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_106() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_107() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_108() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_109() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_110() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_111() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_112() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_113() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_114() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_115() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_116() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_117() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_118() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_119() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_120() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_121() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_122() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_123() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_124() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_125() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_126() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_127() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, -2147483647, 1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_128() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_129() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_130() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_131() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_132() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_133() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_134() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_135() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_136() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_137() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_138() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_139() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_140() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_141() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_142() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_143() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_144() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_145() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_146() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_147() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_148() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_149() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_150() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_151() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_152() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_153() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_154() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_155() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_156() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_157() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_158() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_159() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_160() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_161() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_162() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_163() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_164() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_165() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_166() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_167() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_168() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_169() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_170() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_171() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_172() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_173() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_174() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_175() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_176() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_177() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_178() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_179() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_180() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_181() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_182() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_183() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_184() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_185() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_186() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_187() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_188() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_189() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_190() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_191() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, -1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_192() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_193() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_194() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_195() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_196() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_197() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_198() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_199() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_200() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_201() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_202() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_203() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_204() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_205() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_206() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_207() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_208() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_209() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_210() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_211() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_212() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_213() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_214() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_215() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_216() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_217() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_218() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_219() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_220() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_221() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_222() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_223() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_224() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_225() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_226() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_227() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_228() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_229() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_230() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_231() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_232() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_233() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_234() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_235() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_236() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_237() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_238() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_239() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_240() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_241() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_242() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_243() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_244() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_245() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_246() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_247() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_248() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_249() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_250() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_251() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_252() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_253() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_254() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_255() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, -2147483647, 1, 2, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_256() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_257() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_258() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_259() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_260() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_261() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_262() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_263() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_264() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_265() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_266() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_267() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_268() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_269() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_270() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_271() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_272() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_273() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_274() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_275() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_276() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_277() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_278() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_279() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_280() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_281() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_282() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_283() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_284() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_285() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_286() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_287() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_288() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_289() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_290() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_291() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_292() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_293() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_294() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_295() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_296() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_297() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_298() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_299() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_300() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_301() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_302() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_303() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_304() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_305() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_306() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_307() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_308() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_309() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_310() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_311() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_312() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_313() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_314() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_315() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_316() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_317() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_318() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_319() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, -1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_320() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_321() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_322() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_323() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_324() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_325() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_326() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_327() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_328() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_329() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_330() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_331() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_332() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_333() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_334() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_335() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_336() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_337() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_338() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_339() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_340() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_341() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_342() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_343() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_344() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_345() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_346() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_347() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_348() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_349() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_350() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_351() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_352() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_353() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_354() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_355() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_356() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_357() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_358() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_359() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_360() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_361() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_362() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_363() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_364() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_365() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_366() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_367() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_368() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_369() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_370() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_371() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_372() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_373() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_374() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_375() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_376() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_377() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_378() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_379() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_380() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_381() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_382() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_383() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, -1, 2, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_384() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_385() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_386() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_387() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_388() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_389() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_390() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_391() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_392() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_393() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_394() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_395() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_396() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_397() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_398() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_399() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_400() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_401() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_402() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_403() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_404() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_405() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_406() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_407() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_408() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_409() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_410() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_411() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_412() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_413() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_414() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_415() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_416() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_417() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_418() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_419() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_420() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_421() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_422() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_423() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_424() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_425() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_426() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_427() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_428() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_429() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_430() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_431() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_432() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_433() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_434() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_435() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_436() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_437() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_438() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_439() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_440() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_441() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_442() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_443() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_444() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_445() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_446() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_447() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, -1, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_448() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_449() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_450() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_451() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, -3, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_452() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_453() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, -3, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_454() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_455() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_456() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_457() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, -3, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_458() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_459() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_460() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_461() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_462() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_463() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_464() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_465() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, -3, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_466() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_467() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_468() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_469() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_470() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_471() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_472() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_473() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_474() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_475() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_476() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_477() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_478() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_479() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, -1, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_480() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_481() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, 5, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_482() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_483() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_484() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_485() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_486() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_487() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_488() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_489() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_490() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_491() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_492() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_493() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_494() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_495() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, -1, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_496() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_497() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_498() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_499() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, -1, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_500() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_501() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, -1, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_502() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_503() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, -1, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_504() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_505() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, 6, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_506() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_507() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, 6, -1, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_508() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_509() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, 6, 7, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_510() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_511() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483647, 1, 2, 3, 4, 8, 9, 10, 11, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_512() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_513() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_514() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_515() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_516() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_517() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_518() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_519() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_520() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_521() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_522() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_523() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_524() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_525() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_526() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_527() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_528() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_529() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_530() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_531() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_532() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_533() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_534() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_535() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_536() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_537() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_538() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_539() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_540() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_541() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_542() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_543() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_544() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_545() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_546() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_547() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_548() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_549() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_550() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_551() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_552() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_553() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_554() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_555() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_556() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_557() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_558() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_559() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_560() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_561() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_562() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_563() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_564() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_565() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_566() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_567() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_568() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_569() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_570() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_571() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_572() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_573() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_574() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_575() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, -1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_576() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_577() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_578() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_579() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_580() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_581() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_582() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_583() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_584() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_585() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_586() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_587() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_588() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_589() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_590() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_591() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_592() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_593() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_594() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_595() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_596() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_597() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_598() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_599() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_600() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_601() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_602() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_603() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_604() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_605() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_606() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_607() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_608() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_609() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_610() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_611() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_612() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_613() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_614() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_615() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_616() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_617() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_618() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_619() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_620() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_621() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_622() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_623() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_624() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_625() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_626() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_627() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_628() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_629() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_630() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_631() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_632() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_633() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_634() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_635() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_636() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_637() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_638() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_639() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, -1, 2, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_640() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_641() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_642() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_643() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_644() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_645() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_646() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_647() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_648() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_649() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_650() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_651() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_652() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_653() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_654() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_655() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_656() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_657() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_658() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_659() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_660() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_661() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_662() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_663() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_664() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_665() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_666() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_667() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_668() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_669() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_670() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_671() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_672() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_673() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_674() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_675() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_676() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_677() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_678() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_679() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_680() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_681() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_682() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_683() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_684() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_685() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_686() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_687() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_688() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_689() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_690() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_691() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_692() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_693() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_694() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_695() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_696() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_697() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_698() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_699() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_700() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_701() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_702() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_703() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, -1, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_704() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_705() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_706() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_707() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, -3, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_708() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_709() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, -3, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_710() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_711() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_712() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_713() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, -3, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_714() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_715() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_716() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_717() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_718() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_719() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_720() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_721() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, -3, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_722() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_723() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_724() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_725() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_726() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_727() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_728() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_729() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_730() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_731() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_732() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_733() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_734() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_735() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, -1, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_736() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_737() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, 5, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_738() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_739() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_740() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_741() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_742() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_743() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_744() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_745() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_746() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_747() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_748() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_749() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_750() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_751() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, -1, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_752() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_753() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_754() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_755() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, -1, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_756() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_757() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, -1, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_758() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_759() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, -1, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_760() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_761() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, 6, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_762() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_763() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, 6, -1, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_764() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_765() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, 6, 7, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_766() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_767() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, -1, 2, 3, 4, 8, 9, 10, 11, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_768() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_769() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_770() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_771() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_772() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_773() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_774() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_775() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_776() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_777() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_778() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_779() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_780() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_781() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_782() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_783() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_784() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_785() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_786() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_787() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_788() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_789() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_790() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 4, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_791() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_792() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_793() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_794() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_795() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_796() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_797() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_798() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_799() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_800() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_801() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_802() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_803() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_804() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_805() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_806() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 4, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_807() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_808() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_809() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_810() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 4, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_811() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_812() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_813() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_814() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_815() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_816() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_817() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_818() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_819() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_820() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_821() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_822() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_823() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_824() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_825() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_826() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_827() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_828() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_829() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_830() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_831() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, -1, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_832() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_833() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_834() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_835() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, -3, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_836() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_837() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, -3, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_838() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_839() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_840() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_841() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, -3, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_842() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_843() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_844() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_845() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_846() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_847() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_848() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_849() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, -3, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_850() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_851() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_852() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_853() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_854() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_855() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_856() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_857() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_858() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_859() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_860() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_861() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_862() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_863() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, -1, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_864() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_865() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, 5, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_866() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_867() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_868() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_869() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_870() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_871() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_872() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_873() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_874() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_875() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_876() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_877() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_878() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_879() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, -1, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_880() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_881() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_882() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_883() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, -1, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_884() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_885() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, -1, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_886() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_887() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, -1, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_888() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_889() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, 6, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_890() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_891() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, 6, -1, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_892() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_893() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, 6, 7, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_894() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_895() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, -1, 3, 4, 8, 9, 10, 11, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_896() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_897() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_898() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_899() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, -3, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_900() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_901() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, -3, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_902() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, -3, -3, -3, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_903() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_904() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_905() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, -3, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_906() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, -3, -3, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_907() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_908() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_909() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_910() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_911() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_912() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_913() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, -3, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_914() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, -3, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_915() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_916() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_917() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_918() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_919() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_920() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_921() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_922() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_923() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_924() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_925() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_926() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_927() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, -1, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_928() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_929() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, 5, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_930() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, -3, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_931() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_932() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_933() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_934() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_935() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_936() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_937() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_938() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_939() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_940() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_941() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_942() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_943() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, -1, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_944() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_945() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_946() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_947() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, -1, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_948() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_949() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, -1, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_950() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_951() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, -1, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_952() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_953() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, 6, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_954() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_955() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, 6, -1, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_956() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_957() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, 6, 7, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_958() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_959() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, -1, 4, 8, 9, 10, 11, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_960() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_961() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, 5, -1, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_962() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 4, 5, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_963() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_964() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_965() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_966() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_967() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_968() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_969() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_970() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_971() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_972() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_973() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_974() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_975() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, -1, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_976() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_977() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_978() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_979() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, -1, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_980() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_981() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, -1, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_982() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_983() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, -1, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_984() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_985() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, 6, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_986() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_987() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, 6, -1, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_988() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_989() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, 6, 7, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_990() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_991() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, -1, 8, 9, 10, 11, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_992() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_993() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_994() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_995() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, -1, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_996() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_997() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, -1, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_998() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_999() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, -1, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1000() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1001() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, 6, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1002() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1003() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, 6, -1, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1004() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1005() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, 6, 7, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1006() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, -1, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1007() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 8, -5, 9, 10, 11, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1008() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1009() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, -1, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1010() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1011() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, -1, -1, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1012() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1013() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, -1, 7, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1014() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, -1, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1015() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 8, 9, -5, 10, 11, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1016() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1017() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, 7, -1, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1018() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, 7, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1019() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 8, 9, 10, -5, 11, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1020() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, 7, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1021() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 8, 9, 10, 11, -1, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1022() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, 8, 9, 2147483647);
            SvcompList.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_1023() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 2147483647);
            SvcompList.main(new String[] {});
        }
    }
}
