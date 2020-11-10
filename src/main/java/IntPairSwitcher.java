import java.text.DecimalFormat;
import java.util.Scanner;

public class IntPairSwitcher {
    private static final DecimalFormat FORMAT_1 = new DecimalFormat("0.#");

    public static IntPair scanXY() {
        System.out.println("数値x,yを入力してください。");
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        return new IntPair(x,y);

    }
    public static IntPair switchXY(IntPair intpair){
        return new IntPair(intpair.getY(), intpair.getX());
    }
    public static void printSwitchXY(){
        IntPair intPair = scanXY().switchXY();
        System.out.println("x=" + intPair.getX() + ",y=" + intPair.getY() );
    }
}
