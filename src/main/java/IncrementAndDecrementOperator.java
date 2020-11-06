import java.util.Scanner;
import java.text.DecimalFormat;

public class IncrementAndDecrementOperator {
    private static final double COUNT = 10;
    private static final DecimalFormat FORMAT_1 = new DecimalFormat("0.#");

    public static String checkIncrement(double x) {
        double xPlus = x;

        for (int i = 0; i < COUNT; i++) {
            xPlus++;
        }
        return FORMAT_1.format(xPlus);
    }

    public static String checkDecrement(double x) {

        double xMinus = x;
        for (int i = 0; i < COUNT; i++) {
            xMinus--;
        }
        return FORMAT_1.format(xMinus);

    }

    public static double scanX() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return Double.parseDouble(scan.next());
    }

    public static void printIncAndDec() {
        double x = scanX();
        System.out.println(checkIncrement(x) + " " + checkDecrement(x));
    }
}
