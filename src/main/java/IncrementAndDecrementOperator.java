import java.util.Scanner;
import java.text.DecimalFormat;

public class IncrementAndDecrementOperator {
    private static double COUNT = 10;
    private static DecimalFormat format1 = new DecimalFormat("0.#");
    public static void check() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        double x_plus = Double.valueOf(scan.next());
        double x_minus = x_plus;
        for (int i = 0; i < COUNT; i++) {
            x_plus++;
            x_minus--;
        }
        String ans_x_plus =  format1.format(x_plus);
        String ans_x_minus = format1.format(x_minus);
        System.out.println(ans_x_plus+" "+ans_x_minus);


    }
}
