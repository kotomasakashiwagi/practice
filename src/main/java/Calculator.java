import java.text.DecimalFormat;

public class Calculator {
    private static double X = 7;
    private static DecimalFormat format1 = new DecimalFormat("0.#");

    public static void xTimes3() {
        X = X * 3;
        System.out.println(format1.format(X));
    }

    public static void xDivided2() {
        X = X / 2;
        System.out.println(format1.format(X));
    }
}
