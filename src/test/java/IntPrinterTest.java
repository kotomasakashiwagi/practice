import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntPrinterTest {
    @Test
    public void getInt() {
        assertEquals(11, IntPrinter.getInt());
    }

    @Test
    public void getNumberX() {
        assertEquals(13, IntPrinter.getNumberX());
    }

    @Test
    public void getNumberY() {
        assertEquals(17, IntPrinter.getNumberY());
    }

    @Test
    public void getSumXY() {
        assertEquals(30, IntPrinter.getSumXY());
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
        assertEquals(437, IntPrinter.getIntZ());
    }
}