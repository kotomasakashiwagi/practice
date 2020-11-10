public class IntPair {
    private final int x;
    private final int y;

    IntPair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object intPair) {
        if (intPair == this) {
            return true;
        }
        if (intPair instanceof IntPair) {
            IntPair testIntPair = (IntPair) intPair;
            return (this.x == testIntPair.x) && (this.y == testIntPair.y);
        }
        return false;
        //return (this.x == intPair.x)&&(this.y == intPair.y);
    }

    public IntPair switchXY() {
        return new IntPair(getY(), getX());
    }
}
