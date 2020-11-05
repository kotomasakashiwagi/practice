public class IntPairSwitcher {
    public static void intPairChange(int x, int y) {
        int a = x;
        x = y;
        y = a;
        System.out.println("x=" + x + ",y=" + y);
    }
}
