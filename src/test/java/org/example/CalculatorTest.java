package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    void when5asStringPlus10asStringResult15() {
        int expected = 15;
        int actual = calc.add("5", "10");
        assertEquals(expected, actual);
    }
    @Test
    void whenInputFirstIncorrectValueNFException() {
        assertThrows(NumberFormatException.class, () -> {calc.add("incorrectValue", "10");});
    }
    @Test
    void whenInputSecondIncorrectValueNFException() {
        boolean wasException = false;
        try {
            calc.add("5", "incorrectValue");
        } catch (NumberFormatException e) {
            wasException = true;
        }
        assertTrue(wasException);
    }
    @Test
    void testWhen10plus5then15() {
        int expected = 15;
        int result = calc.add(10, 5);
        assertEquals(expected, result,0.001);
    }
    @Test
    void testWhen10mul5then50() {
        int expected = 50;
        double result = calc.mul(10, 5);
        assertEquals(expected, result,0.001);
    }
    @Test
    void testWhen10div5then2() {
        int expected = 2;
        double result = calc.div(10, 5);
        assertEquals(expected, result,0.001);
        double expected2 = 0;
        double result2 = calc.div(0, 10);
        assertEquals(expected2, result2,0.001);
    }
    @Test
    void testWhenDivideZero() {
        assertThrows(ArithmeticException.class, () -> {calc.div(10, 0);});
    }
    @Test
    void testWhen10sub5then5() {
        int expected = 5;
        int result = calc.sub(10, 5);
        assertEquals(expected, result);
    }
    @Test
    void testWhen10AsStringSub5AsStringResult5() {
        int expected = 5;
        int result = calc.sub("10", "5");
        assertEquals(expected, result);
    }
    @Test
    void testWhen10AsStringMul5AsStringResult50() {
        int expected = 50;
        int result = calc.mul("10", "5");
        assertEquals(expected, result,0.001);
    }
    @Test
    void testWhen10AsStringDiv5AsStringResult2() {
        int expected = 2;
        int result = calc.div("10", "5");
        assertEquals(expected, result,0.001);
    }

    @AfterEach
    public void close() {
        calc = null;
    }
    public void whatCalc() {
        System.out.println(calc);
    }

}