public class Printer {
    private static final String HELLO_WORLD = "hello world";

    public static void printWord(String s) {
        System.out.println(s);
    }

    public static void printWord() {
        printWord(HELLO_WORLD);
    }

    public static void printWord(IntPair intPair) {
        printWord("x=" + intPair.getX() + ",y=" + intPair.getY());
    }
    //オーバーロード；同名のメソッドで最終的には同じメソッドを呼ぶ。
}
