import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.BigDecimal;

public class Calculator {
    private static final int NUMBER_6 = 7;
    private static DecimalFormat format1 = new DecimalFormat("0.#");

    public static int times3() {
        int x = NUMBER_6 * 3;
        return x;
    }

    public static int divided2(int x) {
        int x2 = x / 2;
        return x2;
    }

    public static void printDouble(int a) {
        System.out.println(format1.format(a));
    }

    public static double scanX() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return Double.parseDouble(scan.next());

    }

    public static double exponentiation2(double x) {
        return Math.pow(x, 2);
    }

    public static double exponentiation3(double x) {
        return Math.pow(x, 3);
    }

    public static double exponentiation4(double x) {
        return Math.pow(x, 4);
    }

    public static void printExponentiation() {
        double x = scanX();
        System.out.println("x=" + x + "," + "xの２乗：" + exponentiation2(x) + "," + "xの3乗:" +
                exponentiation3(x) + "," + "xの4乗:" + exponentiation4(x));
    }


    // System.out.println("x=" + x + " , " + "xの２倍：" + x_2 + " , " + "xの3倍:" + x_3 + " , " + "xの4倍:" + x_4);


    public static double multiplication2(double x) {
        return x * 2;
    }

    public static double multiplication3(double x) {
        return x * 3;
    }

    public static double multiplication4(double x) {
        return x * 4;
    }

    public static void printMultiplication() {
        double x = scanX();
        System.out.println("x=" + x + " , " + "xの２倍：" + multiplication2(x) + " , " + "xの3倍:" + multiplication3(x)
                + " , " + "xの4倍:" + multiplication4(x));
    }

    public static double scanDividend() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        return x;
    }

    public static double scanDivisor() {
        System.out.println("法yを入力してください。");
        Scanner scan = new Scanner(System.in);
        double y = Double.parseDouble(scan.next());
        return y;
    }

    public static BigDecimal calculatorRemainder(int x, double y) {
        double remainder = x % y;
        BigDecimal bd = new BigDecimal(remainder);
        return bd.setScale(1, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal calculatorQuotient(int x, double y) {
        BigDecimal x1 = new BigDecimal(x);
        BigDecimal bd1 = x1.subtract(calculatorRemainder(x, y));
        BigDecimal bd2 = new BigDecimal(y);
        return bd1.divide(bd2, 0, BigDecimal.ROUND_HALF_UP);
    }

    public static void printQAndR() {
        int x = (int) scanDividend();
        double y = scanDivisor();
        System.out.println(x + "/" + y + " = " + format1.format(calculatorQuotient(x, y))
                + " 余り " + calculatorRemainder(x, y));
    }
}
