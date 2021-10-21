import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondTest {
    @Test
    void test10() {
        assertTrue(Second.process(3,3,3,'A') == 4);
    }

    @Test
    void test11() {
        assertTrue(Second.process(2,3,3,'A') == 4);
    }

    @Test
    void test12() {
        assertTrue(Second.process(4,3,3,'A') == 4);
    }

    @Test
    void test13() {
        assertTrue(Second.process(3,2,3,'A') == 4);
    }

    @Test
    void test14() {
        assertTrue(Second.process(3,4,3,'A') == 4);
    }

    @Test
    void test15() {
        assertTrue(Second.process(3,3,2,'A') == 4);
    }

    @Test
    void test16() {
        assertTrue(Second.process(3,3,4,'A') == 4);
    }

    @Test
    void test20() {
        assertTrue(Second.process(3,3,3,'B') == 8);
    }

    @Test
    void test21() {
        assertTrue(Second.process(2,3,3,'B') == 8);
    }

    @Test
    void test22() {
        assertTrue(Second.process(4,3,3,'B') == 9);
    }

    @Test
    void test23() {
        assertTrue(Second.process(3,2,3,'B') == 8);
    }

    @Test
    void test24() {
        assertTrue(Second.process(3,4,3,'B') == 9);
    }

    @Test
    void test25() {
        assertTrue(Second.process(3,3,2,'B') == 8);
    }

    @Test
    void test26() {
        assertTrue(Second.process(3,3,4,'B') == 9);
    }

    @Test
    void test1_1() {
        assertTrue(Second.process(1,1,1,'A') == -1);
    }

    @Test
    void test1_2() {
        assertTrue(Second.process(3,1,1,'A') == -1);
    }

    @Test
    void test1_3() {
        assertTrue(Second.process(5,1,1,'A') == -1);
    }

    @Test
    void test1_4() {
        assertTrue(Second.process(1,3,1,'A') == -1);
    }

    @Test
    void test1_5() {
        assertTrue(Second.process(3,3,1,'A') == -1);
    }

    @Test
    void test1_6() {
        assertTrue(Second.process(5,3,1,'A') == -1);
    }

    @Test
    void test1_7() {
        assertTrue(Second.process(1,5,1,'A') == -1);
    }

    @Test
    void test1_8() {
        assertTrue(Second.process(3,5,1,'A') == -1);
    }

    @Test
    void test1_9() {
        assertTrue(Second.process(5,5,1,'A') == -1);
    }

    @Test
    void test1_10() {
        assertTrue(Second.process(1,1,3,'A') == -1);
    }

    @Test
    void test1_11() {
        assertTrue(Second.process(3,1,3,'A') == -1);
    }

    @Test
    void test1_12() {
        assertTrue(Second.process(5,1,3,'A') == -1);
    }

    @Test
    void test1_13() {
        assertTrue(Second.process(1,3,3,'A') == -1);
    }

    @Test
    void test1_14() {
        assertTrue(Second.process(3,3,3,'A') == 4);
    }

    @Test
    void test1_15() {
        assertTrue(Second.process(5,3,3,'A') == -1);
    }

    @Test
    void test1_16() {
        assertTrue(Second.process(1,5,3,'A') == -1);
    }

    @Test
    void test1_17() {
        assertTrue(Second.process(3,5,3,'A') == -1);
    }

    @Test
    void test1_18() {
        assertTrue(Second.process(5,5,3,'A') == -1);
    }

    @Test
    void test1_19() {
        assertTrue(Second.process(1,1,5,'A') == -1);
    }

    @Test
    void test1_20() {
        assertTrue(Second.process(3,1,5,'A') == -1);
    }

    @Test
    void test1_21() {
        assertTrue(Second.process(5,1,5,'A') == -1);
    }

    @Test
    void test1_22() {
        assertTrue(Second.process(1,3,5,'A') == -1);
    }

    @Test
    void test1_23() {
        assertTrue(Second.process(3,3,5,'A') == -1);
    }

    @Test
    void test1_24() {
        assertTrue(Second.process(5,3,5,'A') == -1);
    }

    @Test
    void test1_25() {
        assertTrue(Second.process(1,5,5,'A') == -1);
    }

    @Test
    void test1_26() {
        assertTrue(Second.process(3,5,5,'A') == -1);
    }

    @Test
    void test1_27() {
        assertTrue(Second.process(5,5,5,'A') == -1);
    }

    @Test
    void test1_54() {
        assertTrue(Second.process(1,1,1,'B') == -1);
    }

    @Test
    void test1_28() {
        assertTrue(Second.process(3,1,1,'B') == -1);
    }

    @Test
    void test1_29() {
        assertTrue(Second.process(5,1,1,'B') == -1);
    }

    @Test
    void test1_30() {
        assertTrue(Second.process(1,3,1,'B') == -1);
    }

    @Test
    void test1_31() {
        assertTrue(Second.process(3,3,1,'B') == -1);
    }

    @Test
    void test1_32() {
        assertTrue(Second.process(5,3,1,'B') == -1);
    }

    @Test
    void test1_33() {
        assertTrue(Second.process(1,5,1,'B') == -1);
    }

    @Test
    void test1_34() {
        assertTrue(Second.process(3,5,1,'B') == -1);
    }

    @Test
    void test1_35() {
        assertTrue(Second.process(5,5,1,'B') == -1);
    }

    @Test
    void test1_36() {
        assertTrue(Second.process(1,1,3,'B') == -1);
    }

    @Test
    void test1_37() {
        assertTrue(Second.process(3,1,3,'B') == -1);
    }

    @Test
    void test1_38() {
        assertTrue(Second.process(5,1,3,'B') == -1);
    }

    @Test
    void test1_39() {
        assertTrue(Second.process(1,3,3,'B') == -1);
    }

    @Test
    void test1_40() {
        assertTrue(Second.process(3,3,3,'B') == 8);
    }

    @Test
    void test1_41() {
        assertTrue(Second.process(5,3,3,'B') == -1);
    }

    @Test
    void test1_42() {
        assertTrue(Second.process(1,5,3,'B') == -1);
    }

    @Test
    void test1_43() {
        assertTrue(Second.process(3,5,3,'B') == -1);
    }

    @Test
    void test1_44() {
        assertTrue(Second.process(5,5,3,'B') == -1);
    }

    @Test
    void test1_45() {
        assertTrue(Second.process(1,1,5,'B') == -1);
    }

    @Test
    void test1_46() {
        assertTrue(Second.process(3,1,5,'B') == -1);
    }

    @Test
    void test1_47() {
        assertTrue(Second.process(5,1,5,'B') == -1);
    }

    @Test
    void test1_48() {
        assertTrue(Second.process(1,3,5,'B') == -1);
    }

    @Test
    void test1_49() {
        assertTrue(Second.process(3,3,5,'B') == -1);
    }

    @Test
    void test1_50() {
        assertTrue(Second.process(5,3,5,'B') == -1);
    }

    @Test
    void test1_51() {
        assertTrue(Second.process(1,5,5,'B') == -1);
    }

    @Test
    void test1_52() {
        assertTrue(Second.process(3,5,5,'B') == -1);
    }

    @Test
    void test1_53() {
        assertTrue(Second.process(5,5,5,'B') == -1);
    }
}