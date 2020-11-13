import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntPairSwitcherTest {
    @Test
    public void switchXY(){
        //IntPair intPair = new IntPair(10,12);
        IntPair intPair = IntPairSwitcher.switchXY(new IntPair(10,12));
        assertEquals(12,intPair.getX());
        assertEquals(10, intPair.getY());
    }

}