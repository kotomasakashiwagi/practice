import java.util.Scanner;

public class IntScanner {
    public static double scanX() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return Double.parseDouble(scan.next());

    }

    public static double scanDividend() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.next());
    }

    public static double scanDivisor() {
        System.out.println("法yを入力してください。");
        Scanner scan = new Scanner(System.in);
        return Double.parseDouble(scan.next());
    }

}
