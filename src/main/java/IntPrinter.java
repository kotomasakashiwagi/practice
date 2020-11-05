public class IntPrinter {
    private static int NUMBER_1 = 11;
    private static int NUMBER_X = 13;
    private static int NUMBER_Y = 17;
    private static int X = 19;
    private static int Y = 23;

    public static void printInt() {
        int x = NUMBER_1;
        System.out.println("\"x=" + x + "\"");
    }

    public static void printIntPair() {
        System.out.println("\"x=" + NUMBER_X + "," + "\"y=" + NUMBER_Y + "\"");
    }

    public static void printIntSum() {
        int x = NUMBER_X + NUMBER_Y;
        System.out.println(x);
    }

    public static void printIntTimes() {
        System.out.println(13 * 17);
    }

    public static void printIntTimesZ() {
        int x = X;
        int y = Y;
        int z = x * y;
        System.out.println(z);
    }

}
