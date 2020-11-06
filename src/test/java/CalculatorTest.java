import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

//assertEquals();
class CalculatorTest {
    @Test
    public void xTimes3() {
        assertEquals(21, Calculator.xTimes3());
    }

    @Test
    public void xDivided2() {
        assertEquals(3.5, Calculator.xDivided2());
    }

    @Test
    public void exponentiation2() {
        assertEquals(4.0, Calculator.exponentiation2(2.0));
        assertEquals(0, Calculator.exponentiation2(0));
        assertEquals(2.25, Calculator.exponentiation2(-1.5));
    }

    @Test
    public void exponentiation3() {
        assertEquals(8.0, Calculator.exponentiation3(2.0));
        assertEquals(0, Calculator.exponentiation3(0));
        assertEquals(-3.375, Calculator.exponentiation3(-1.5));
    }

    @Test
    public void exponentiation4() {
        assertEquals(16.0, Calculator.exponentiation4(2.0));
        assertEquals(0, Calculator.exponentiation4(0));
        assertEquals(5.0625, Calculator.exponentiation4(-1.5));
    }

    @Test
    public void multiplication2() {
        assertEquals(4.0, Calculator.multiplication2(2.0));
        assertEquals(0, Calculator.multiplication2(0));
        assertEquals(-4.0, Calculator.multiplication2(-2.0));
    }

    @Test
    public void multiplication3() {
        assertEquals(6.0, Calculator.multiplication3(2.0));
        assertEquals(0, Calculator.multiplication3(0));
        assertEquals(-6.0, Calculator.multiplication3(-2.0));
    }

    @Test
    public void multiplication4() {
        assertEquals(8.0, Calculator.multiplication4(2.0));
        assertEquals(0, Calculator.multiplication4(0));
        assertEquals(-8.0, Calculator.multiplication4(-2.0));
    }

    @Test
    public void calculatorRemainder() {
        assertEquals(new BigDecimal("2.0"), Calculator.calculatorRemainder(5, 3.0));
        assertEquals(new BigDecimal("-1.0"),Calculator.calculatorRemainder(-10,3.0));
        assertEquals(new BigDecimal("0.1"),Calculator.calculatorRemainder(10,0.3));
    }

    @Test
    public void calculatorQuotient() {
        assertEquals(new BigDecimal("1"), Calculator.calculatorQuotient(5, 3));
        assertEquals(new BigDecimal("-3"), Calculator.calculatorQuotient(-10, 3));
        assertEquals(new BigDecimal("33"), Calculator.calculatorQuotient(10, 0.3));
    }

    @Test
    public void checkIncrement(){
        assertEquals("20",IncrementAndDecrementOperator.checkIncrement(10));
        assertEquals("11.5",IncrementAndDecrementOperator.checkIncrement(1.5));
    }
    @Test
    public void checkDecrement(){
        assertEquals("-10",IncrementAndDecrementOperator.checkDecrement(0));
        assertEquals("-8.5",IncrementAndDecrementOperator.checkDecrement(1.5));
    }
}