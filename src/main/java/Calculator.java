import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    private static double x = 7;
    private static DecimalFormat format1 = new DecimalFormat("0.#");

    public static double xTimes3() {
        x = x * 3;
        return x;
       // System.out.println(format1.format(x));
    }

    public static double xDivided2() {
        x = x / 2;
        return x;
        //System.out.println(format1.format(x));
    }
    public static void printDouble(double a){
        System.out.println(format1.format(a));
    }

    public static double scannerX() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        double x = Double.valueOf(scan.next());
        return x;

    }
    public static double exponentiation2(double x){
        return Math.pow(x, 2);
    }
    public static double exponentiation3(double x){
        return Math.pow(x, 3);
    }
    public static double exponentiation4(double x){
        return Math.pow(x, 4);
    }
    public static void printExponentiation(){
        double x = scannerX();
        System.out.println("x=" + x + "," + "xの２乗：" + exponentiation2(x) + "," + "xの3乗:" +
                exponentiation3(x) + "," + "xの4乗:" + exponentiation4(x));
    }


       // System.out.println("x=" + x + " , " + "xの２倍：" + x_2 + " , " + "xの3倍:" + x_3 + " , " + "xの4倍:" + x_4);


    public static double multiplication2(double x){
        return x*2;
    }
    public static double multiplication3(double x){
        return x*3;
    }
    public static double multiplication4(double x){
        return x*4;
    }
    public static void printMultiplication(){
        double x = scannerX();
        System.out.println("x=" + x + " , " + "xの２倍：" + multiplication2(x) + " , " + "xの3倍:" + multiplication3(x)
                + " , " + "xの4倍:" + multiplication4(x));
    }
    public static double scannerDividend() {
        System.out.println("数値xを入力してください。");
        Scanner scan = new Scanner(System.in);
        double x = Double.valueOf(scan.next());
        //System.out.println(x + "/" + y + " = " + format1.format(quotient) + " 余り " + remainder);
        return x;
    }
    public static double scannerDivisor() {
        System.out.println("法yを入力してください。");
        Scanner scan = new Scanner(System.in);
        double y = Double.valueOf(scan.next());
        return y;
    }
    public static double calculatorRemainder(double x,double y){
        double remainder = x%y;
        return remainder;
    }
    public static double calculatorQuotient(double x,double y){
        double quotient = (x-calculatorRemainder(x,y))/y;
        return quotient;
    }
    public  static void printQAndR(){
        double x = scannerDividend();
        double y = scannerDivisor();
        System.out.println(x + "/" + y + " = " + format1.format(calculatorQuotient(x,y))
                + " 余り " + calculatorRemainder(x,y));
    }
}
