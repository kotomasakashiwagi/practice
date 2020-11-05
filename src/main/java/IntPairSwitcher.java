import java.text.DecimalFormat;
import java.util.Scanner;

public class IntPairSwitcher {
    private static DecimalFormat format1 = new DecimalFormat("0.#");

    public static void intPairChange() {
        System.out.println("数値x,yを入力してください。");
        Scanner scan = new Scanner(System.in);
        double x = Double.valueOf(scan.next());
        double y = Double.valueOf(scan.next());
        double a = x;
        x = y;
        y = a;
        System.out.println("x=" + format1.format(x) + ",y=" + format1.format(y));
    }
}
