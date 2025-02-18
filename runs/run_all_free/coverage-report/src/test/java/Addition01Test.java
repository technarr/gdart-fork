import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class Addition01Test {

    @Test
    void test_valuationNr_0() {
        Addition01.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 9999);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 150);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 149);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_4() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 148);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_5() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 147);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_6() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 146);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_7() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 145);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_8() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 144);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_9() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 143);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_10() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 142);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_11() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 141);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_12() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 140);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_13() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 139);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_14() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 138);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_15() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 137);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_16() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 136);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_17() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 135);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_18() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 134);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_19() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 133);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_20() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 132);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_21() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 131);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_22() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 130);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_23() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 129);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_24() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 128);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_25() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 127);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_26() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 126);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_27() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 125);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_28() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 124);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_29() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 123);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_30() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 122);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_31() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 121);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_32() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 120);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_33() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 119);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_34() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 118);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_35() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 117);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_36() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 116);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_37() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 115);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_38() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 114);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_39() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 113);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_40() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 112);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_41() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 111);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_42() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 110);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_43() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 109);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_44() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 108);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_45() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 107);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_46() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 106);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_47() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 105);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_48() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 104);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_49() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 103);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_50() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 102);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_51() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 101);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_52() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 100);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_53() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 99);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_54() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 98);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_55() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 97);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_56() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 96);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_57() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 95);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_58() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 94);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_59() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 93);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_60() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 92);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_61() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 91);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_62() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 90);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_63() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 89);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_64() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 88);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_65() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 87);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_66() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 86);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_67() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 85);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_68() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 84);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_69() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 83);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_70() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 82);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_71() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 81);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_72() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 80);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_73() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 79);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_74() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 78);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_75() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 77);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_76() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 76);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_77() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 75);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_78() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 74);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_79() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 73);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_80() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 72);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_81() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 71);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_82() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 70);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_83() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 69);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_84() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 68);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_85() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 67);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_86() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 66);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_87() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 65);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_88() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 64);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_89() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 63);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_90() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 62);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_91() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 61);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_92() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 60);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_93() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 59);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_94() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 58);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_95() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 57);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_96() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 56);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_97() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 55);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_98() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 54);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_99() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 53);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_100() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 52);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_101() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 51);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_102() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 50);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_103() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 49);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_104() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 48);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_105() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 47);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_106() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 46);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_107() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 45);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_108() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 44);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_109() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 43);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_110() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 42);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_111() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 41);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_112() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 40);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_113() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 39);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_114() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 38);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_115() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 37);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_116() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 36);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_117() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 35);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_118() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 34);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_119() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 33);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_120() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 32);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_121() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 31);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_122() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 30);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_123() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 29);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_124() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 28);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_125() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 27);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_126() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 26);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_127() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 25);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_128() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 24);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_129() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 23);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_130() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 22);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_131() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 21);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_132() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 20);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_133() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 19);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_134() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 18);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_135() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 17);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_136() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 16);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_137() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 15);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_138() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 14);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_139() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 13);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_140() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 12);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_141() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 11);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_142() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 10);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_143() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 9);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_144() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 8);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_145() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 7);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_146() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 6);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_147() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 5);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_148() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 4);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_149() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 3);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_150() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 2);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_151() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 1);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_152() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, 1073741825);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_153() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(9984, -2147483648);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_154() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(1073751808);
            Addition01.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_155() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483648);
            Addition01.main(new String[] {});
        }
    }
}
