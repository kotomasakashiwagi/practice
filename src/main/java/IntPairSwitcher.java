import java.text.DecimalFormat;
import java.util.Scanner;

public class IntPairSwitcher {
    private static final DecimalFormat FORMAT_1 = new DecimalFormat("0.#");

    public static void intPairChange() {
        System.out.println("数値x,yを入力してください。");
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.next());
        double y = Double.parseDouble(scan.next());
        double a = x;
        x = y;
        y = a;
        System.out.println("x=" + FORMAT_1.format(x) + ",y=" + FORMAT_1.format(y));
    }
}
