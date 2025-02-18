package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import tools.aqua.concolic.Verifier;

class SvcompAdditionTest {

    @Test
    void test_valuationNr_0() {
        SvcompAddition.main(new String[] {});
    }

    @Test
    void test_valuationNr_1() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 1);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_2() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 2);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_3() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 8192);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_4() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 150);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_5() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 149);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_6() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 148);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_7() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 147);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_8() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 146);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_9() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 145);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_10() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 144);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_11() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 143);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_12() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 142);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_13() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 141);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_14() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 140);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_15() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 139);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_16() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 138);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_17() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 137);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_18() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 136);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_19() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 135);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_20() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 134);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_21() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 133);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_22() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 132);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_23() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 131);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_24() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 130);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_25() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 129);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_26() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 128);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_27() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 127);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_28() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 126);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_29() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 125);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_30() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 124);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_31() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 123);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_32() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 122);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_33() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 121);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_34() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 120);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_35() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 119);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_36() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 118);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_37() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 117);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_38() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 116);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_39() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 115);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_40() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 114);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_41() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 113);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_42() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 112);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_43() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 111);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_44() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 110);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_45() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 109);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_46() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 108);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_47() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 107);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_48() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 106);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_49() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 105);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_50() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 104);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_51() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 103);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_52() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 102);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_53() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 101);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_54() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 100);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_55() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 99);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_56() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 98);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_57() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 97);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_58() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 96);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_59() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 95);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_60() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 94);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_61() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 93);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_62() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 92);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_63() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 91);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_64() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 90);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_65() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 89);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_66() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 88);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_67() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 87);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_68() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 86);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_69() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 85);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_70() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 84);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_71() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 83);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_72() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 82);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_73() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 81);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_74() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 80);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_75() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 79);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_76() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 78);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_77() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 77);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_78() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 76);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_79() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 75);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_80() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 74);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_81() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 73);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_82() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 72);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_83() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 71);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_84() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 70);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_85() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 69);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_86() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 68);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_87() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 67);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_88() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 66);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_89() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 65);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_90() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 64);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_91() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 63);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_92() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 62);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_93() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 61);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_94() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 60);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_95() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 59);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_96() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 58);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_97() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 57);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_98() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 56);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_99() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 55);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_100() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 54);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_101() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 53);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_102() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 52);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_103() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 51);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_104() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 50);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_105() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 49);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_106() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 48);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_107() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 47);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_108() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 46);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_109() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 45);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_110() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 44);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_111() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 43);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_112() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 42);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_113() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 41);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_114() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 40);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_115() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 39);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_116() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 38);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_117() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 37);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_118() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 36);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_119() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 35);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_120() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 34);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_121() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 33);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_122() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 32);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_123() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 31);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_124() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 30);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_125() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 29);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_126() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 28);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_127() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 27);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_128() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 26);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_129() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 25);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_130() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 24);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_131() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 23);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_132() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 22);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_133() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 21);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_134() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 20);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_135() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 19);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_136() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 18);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_137() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 17);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_138() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 16);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_139() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 15);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_140() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 14);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_141() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 13);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_142() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 12);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_143() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 11);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_144() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 10);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_145() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 9);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_146() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 8);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_147() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 7);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_148() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 6);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_149() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 5);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_150() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 4);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_151() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 3);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_152() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, 16384);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_153() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(0, -2147483648);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_154() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(16384);
            SvcompAddition.main(new String[] {});
        }
    }

    @Test
    void test_valuationNr_155() {
        try (MockedStatic<Verifier> mockedVerifier = Mockito.mockStatic(Verifier.class)) {
            mockedVerifier.when(Verifier::nondetInt).thenReturn(-2147483648);
            SvcompAddition.main(new String[] {});
        }
    }
}
