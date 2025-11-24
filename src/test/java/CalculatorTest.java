import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(20, 5));
    }

    @Test
    void times() {
        assertEquals(12, calculator.times(3, 4));
    }

    @Test
    void solver() {
        assertEquals(15, calculator.solver());
    }
}