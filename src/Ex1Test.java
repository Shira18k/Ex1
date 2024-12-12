import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
    @Test
    void number2IntTest1() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v, 2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v, v2);
        assertTrue(Ex1.equals(s10, s2));
    }

    @Test
    void numdber2IntTest2() {
        String s2 = "130b8";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 88);
    }

    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for (int i = 0; i < good.length; i = i + 1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for (int i = 0; i < not_good.length; i = i + 1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }

    @Test
    void int2NumberTest1() {
        int num1 = 13;
        int base1 = 2;
        System.out.println(Ex1.int2Number(num1, base1));
    }

    @Test
    void int2NumberTest2() {
        int num2 = 178;
        int base = 5;
        assertEquals(68, 68);
    }

    @Test
    void int2NumberTest3() {
        int num2 =13;
        int base = 2;
        assertEquals("1101", Ex1.int2Number(13, 2));
    }

    @Test
    void maxIndexTest1() {
        String[] arr = {"101b2", "10bA", "FFbG", "110b2"};
        assertEquals(2, Ex1.maxIndex(arr));
    }

    @Test
    void maxIndexTest2() {
        String[] arr = {"0", "0", "10b9", "1b2"};
        assertEquals(2, Ex1.maxIndex(arr));
    }

    @Test
    void equalTest1() {
        String n1 = "101b2";
        String n2 = "101b2";
        assertTrue(Ex1.equals(n1, n2));
    }

    @Test
    void equalTest2() {
        String n1 = "1000bA";
        String n2 = "3330b4";
        assertFalse(Ex1.equals(n1, n2));
    }

    @Test
    void charToIntTest(){
        assertEquals(0, Ex1.charToInt('0'));
        assertEquals(1, Ex1.charToInt('1'));
        assertEquals(9, Ex1.charToInt('9'));


        assertEquals(10, Ex1.charToInt('A'));
        assertEquals(15, Ex1.charToInt('F'));
        assertEquals(16, Ex1.charToInt('G'));
    }

    @Test
    void intToCharTest() {
        assertEquals('0', Ex1.intToNum(0));
        assertEquals('5', Ex1.intToNum(5));
        assertEquals('9', Ex1.intToNum(9));
        assertEquals('A', Ex1.intToNum(10));
        assertEquals('F', Ex1.intToNum(15));
        assertEquals('G', Ex1.intToNum(16));

    }
}