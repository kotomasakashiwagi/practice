import java.text.DecimalFormat;

import java.math.BigDecimal;

public class Calculator {
    private static final int NUMBER_6 = 7;
    private static DecimalFormat format1 = new DecimalFormat("0.#");

    public static int times3() {
        return NUMBER_6 * 3;
    }

    public static int divided2(int x) {
        return x / 2;
    }

    public static void printDouble(int a) {
        System.out.println(format1.format(a));
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
        double x = IntScanner.scanX();
        System.out.println("x=" + x + " , " + "xの２倍：" + multiplication2(x) + " , " + "xの3倍:" + multiplication3(x)
                + " , " + "xの4倍:" + multiplication4(x));
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

}
