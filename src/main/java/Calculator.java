import java.text.DecimalFormat;
import java.util.Scanner;

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

    public static void xExponentiation() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        double x = Double.valueOf(scan.next());
        double x_2 = Math.pow(x, 2);
        double x_3 = Math.pow(x, 3);
        double x_4 = Math.pow(x, 4);
        System.out.println("x=" + x + "," + "xの２乗：" + x_2 + "," + "xの3乗:" + x_3 + "," + "xの4乗:" + x_4);
    }

    public static void xTimes234() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        double x = Double.valueOf(scan.next());
        double x_2 = x * 2;
        double x_3 = x * 3;
        double x_4 = x * 4;
        System.out.println("x=" + x + "," + "xの２倍：" + x_2 + "," + "xの3倍:" + x_3 + "," + "xの4倍:" + x_4);
    }
}
