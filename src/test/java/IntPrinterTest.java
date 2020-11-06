import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntPrinterTest {
    @Test
    public void getInt() {
        assertEquals(11, IntPrinter.getInt());
    }

    @Test
    public void getNumberX() {
        assertEquals(13, IntPrinter.getNumber34X());
    }

    @Test
    public void getNumberY() {
        assertEquals(17, IntPrinter.getNumber34Y());
    }

    @Test
    public void getSumXY() {
        assertEquals(30, IntPrinter.sumXY());
    }

    @Test
    public void getIntX() {
        assertEquals(19, IntPrinter.getIntX());
    }

    @Test
    public void getIntY() {
        assertEquals(23, IntPrinter.getIntY());
    }

    @Test
    public void getIntZ() {
        assertEquals(437, IntPrinter.timesXY());
    }
}