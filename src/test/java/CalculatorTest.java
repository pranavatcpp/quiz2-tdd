import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 8;
        int actual = calculator.sum(3, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 5;
        int actual = calculator.subtract(8, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractNegativeResult() {
        int expected = -5;
        int actual = calculator.subtract(3, 8);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 12;
        int actual = calculator.multiply(3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyByZero() {
        int expected = 0;
        int actual = calculator.multiply(5, 0);

        assertEquals(expected, actual);
    }
}
