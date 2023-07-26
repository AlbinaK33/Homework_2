
package count;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    public void testCalculation() {
        Calculator calculator = new Calculator();
        int result = calculator.calculation(3, 3, '+');
        Assertions.assertEquals(6, result);
    }
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 3);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(9, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculator.divide(9, 0)
        );
    }
}
