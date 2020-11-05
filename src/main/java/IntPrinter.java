public class IntPrinter {
    private static int NUMBER_1 = 11;
    private static int NUMBER_X = 13;
    private static int NUMBER_Y = 17;
    private static int X = 19;
    private static int Y = 23;

    public static void printInt() {
        System.out.println("\"x=" + getInt() + "\"");
    }
    public static int getInt(){
        int x = NUMBER_1;
        return x;
    }

    public static void printIntPair() {
        System.out.println("\"x=" +  getNumberX() + "\"y=" + getNumberY() + "\"");
    }
    public static int getNumberX(){
        int x = NUMBER_X;
        return x;
    }
    public static int getNumberY(){
        int y = NUMBER_Y;
        return y;
    }

    public static void printIntSum() {
        System.out.println(getSumXY());
    }

    public static int getSumXY(){
        int x = NUMBER_X + NUMBER_Y;
        return  x;
    }

    public static void printIntTimes() {
        System.out.println(13 * 17);
    }

    public static void printIntTimesZ() {
        System.out.println(getIntZ());
    }
    public static int getIntX(){
        int x = X;
        return x;
    }
    public static int getIntY(){
        int y = Y;
        return y;
    }
    public static int getIntZ(){
        int z = getIntX() * getIntY();
        return z;
    }

}
