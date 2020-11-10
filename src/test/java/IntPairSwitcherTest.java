import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntPairSwitcherTest {
    @Test
    public void switchXY(){
        IntPair intPair = new IntPair(10,12);
        assertEquals(new IntPair(12,10) , IntPairSwitcher.switchXY(intPair));
    }

}