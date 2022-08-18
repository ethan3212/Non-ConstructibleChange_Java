package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NonConstructibleChangeTest {
    @Test
    public void Test1() {
        int[] input = new int[] {5, 7, 1, 1, 2, 3, 22};
        int expected = 20;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] input = new int[] {1, 1, 1, 1, 1};
        int expected = 6;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] input = new int[] {1, 5, 1, 1, 1, 10, 15, 20, 100};
        int expected = 55;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] input = new int[] {6, 4, 5, 1, 1, 8, 9};
        int expected = 3;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] input = new int[] {};
        int expected = 1;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] input = new int[] {87};
        int expected = 1;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] input = new int[] {5, 6, 1, 1, 2, 3, 4, 9};
        int expected = 32;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int[] input = new int[] {5, 6, 1, 1, 2, 3, 43};
        int expected = 19;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int[] input = new int[] {1, 1};
        int expected = 3;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        int[] input = new int[] {2};
        int expected = 1;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        int[] input = new int[] {1};
        int expected = 2;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        int[] input = new int[] {109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4};
        int expected = 87;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void Test13() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int expected = 29;
        var actual = Main.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }
}