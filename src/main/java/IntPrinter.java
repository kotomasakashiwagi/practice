public class IntPrinter {
    private static final int NUMBER_2 = 11;
    private static final int NUMBER_3_4_X = 13;
    private static final int NUMBER_3_4_Y = 17;
    private static final int NUMBER_8_X = 19;
    private static final int NUMBER_8_Y = 23;

    public static void printInt() {
        System.out.println("\"x=" + getInt() + "\"");
    }

    public static int getInt() {
        int x = NUMBER_2;
        return x;
    }

    public static void printIntPair() {
        System.out.println("\"x=" + getNumber34X() + "\"y=" + getNumber34Y() + "\"");
    }

    public static int getNumber34X() {
        int x = NUMBER_3_4_X;
        return x;
    }

    public static int getNumber34Y() {
        int y = NUMBER_3_4_Y;
        return y;
    }

    public static void printIntSum() {
        System.out.println(sumXY());
    }

    public static int sumXY() {
        return NUMBER_3_4_X + NUMBER_3_4_Y;
    }

    public static void printIntTimes() {
        System.out.println(13 * 17);
    }

    public static void printIntTimesZ() {
        System.out.println(timesXY());
    }

    public static int getIntX() {
        int x = NUMBER_8_X;
        return x;
    }

    public static int getIntY() {
        int y = NUMBER_8_Y;
        return y;
    }

    public static int timesXY() {
        int z = getIntX() * getIntY();
        return z;
    }

}
