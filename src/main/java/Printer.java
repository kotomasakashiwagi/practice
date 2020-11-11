import java.text.DecimalFormat;

public class Printer {
    private static final String HELLO_WORLD = "hello world";
    private static DecimalFormat format1 = new DecimalFormat("0.#");

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
    public static void printExponentiation() {
        double x = IntScanner.scanX();
        System.out.println("x=" + x + "," + "xの２乗：" + Calculator.exponentiation2(x) + "," + "xの3乗:" +
                Calculator.exponentiation3(x) + "," + "xの4乗:" + Calculator.exponentiation4(x));
    }

    public static void printMultiplication() {
        double x = IntScanner.scanX();
        System.out.println("x=" + x + " , " + "xの２倍：" + Calculator.multiplication2(x) + " , " + "xの3倍:" +
                Calculator.multiplication3(x)
                + " , " + "xの4倍:" + Calculator.multiplication4(x));
    }

    public static void printQAndR() {
        int x = (int) IntScanner.scanDividend();
        double y = IntScanner.scanDivisor();
        System.out.println(x + "/" + y + " = " + format1.format(Calculator.calculatorQuotient(x, y))
                + " 余り " + Calculator.calculatorRemainder(x, y));
    }

    public static void printIncAndDec() {
        double x = IntScanner.scanX();
        System.out.println(UtilityOfDouble.increment(x) + " " + UtilityOfDouble.decrement(x));
    }
}
