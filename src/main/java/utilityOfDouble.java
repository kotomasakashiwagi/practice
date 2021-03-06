import java.util.Scanner;
import java.text.DecimalFormat;

public class UtilityOfDouble {
    private static final double COUNT = 10;
    private static final DecimalFormat FORMAT_1 = new DecimalFormat("0.#");

    public static double increment(double x) {
        double xPlus = x;
        for (int i = 0; i < COUNT; i++) {
            xPlus++;
        }
        return xPlus;
    }

    public static double decrement(double x) {

        double xMinus = x;
        for (int i = 0; i < COUNT; i++) {
            xMinus--;
        }
        return xMinus;

    }


}
