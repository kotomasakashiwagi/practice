public class IntPrinter {
    private static int NUMBER_1 = 11;
    private static int NUMBER_X = 13;
    private static int NUMBER_Y = 17;
    public static void printInt(){
        int x = NUMBER_1;
        System.out.println("\"x="+x+"\"");
    }
    public static void printIntPair(){
        System.out.println("\"x="+NUMBER_X+","+"\"y="+NUMBER_Y+"\"");
    }
    public static void printIntSum(){
        int x = NUMBER_X + NUMBER_Y;
        System.out.println(x);
    }

}
