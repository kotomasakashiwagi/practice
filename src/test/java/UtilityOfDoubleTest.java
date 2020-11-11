import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityOfDoubleTest {
    @Test
    public void increment() {
        assertEquals("20.0", UtilityOfDouble.increment(10.0));
        assertEquals("11.5", UtilityOfDouble.increment(1.5));
    }

    @Test
    public void decrement() {
        assertEquals("-10.0", UtilityOfDouble.decrement(0.0));
        assertEquals("-8.5", UtilityOfDouble.decrement(1.5));
    }

}