import java.util.Scanner;
import java.text.DecimalFormat;

public class IncrementAndDecrementOperator {
    private static double COUNT = 10;
    private static DecimalFormat format1 = new DecimalFormat("0.#");

    public static String checkIncrement(double x) {
        double x_plus = x;

        for (int i = 0; i < COUNT; i++) {
            x_plus++;
            //x_minus--;
        }
        String ans_x = format1.format(x_plus);
        return ans_x;
    }

    public static String checkDecrement(double x) {

        double x_minus = x;
        for (int i = 0; i < COUNT; i++) {
            //x_plus++;
            x_minus--;
        }
        String ans_x = format1.format(x_minus);
        return ans_x;

    }

    public static double scannerX() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        double x = Double.valueOf(scan.next());
        return x;
    }

    public static void printIncAndDec() {
        double x = scannerX();
        System.out.println(checkIncrement(x) + " " + checkDecrement(x));
    }
}
