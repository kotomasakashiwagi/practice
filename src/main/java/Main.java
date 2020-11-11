public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("引数の数はひとつで問題番号である必要があります。");
            //System.exit(0);//０が正常終了０以外が異常終了
        } else if (args[0].equals("1-1")) {
            Printer.printWord();
            //System.exit(0);//０が正常終了０以外が異常終了
        } else if (args[0].equals("1-2")) {
            IntPrinter.printInt();
            //System.exit(0);//０が正常終了０以外が異常終了
        } else if (args[0].equals("1-3")) {
            IntPrinter.printIntPair();
            //System.exit(0);//０が正常終了０以外が異常終了
        } else if (args[0].equals("1-4")) {
            IntPrinter.printIntSum();
            //System.exit(0);//０が正常終了０以外が異常終了
        } else if (args[0].equals("1-5")) {
            int x = 2;
            IntPrinter.printIntTimes();
            //System.exit(0);//０が正常終了０以外が異常終了
        } else if (args[0].equals("1-6")) {
            Calculator.printDouble(Calculator.times3());
            Calculator.printDouble(Calculator.divided2(Calculator.times3()));
        } else if (args[0].equals("1-7")) {
            IntPairSwitcher.printSwitchXY();
        } else if (args[0].equals("1-8")) {
            IntPrinter.printIntTimesZ();
        } else if (args[0].equals("1-9")) {
            Calculator.printMultiplication();
        } else if (args[0].equals("1-10")) {
            Printer.printExponentiation();
        } else if (args[0].equals("1-11")) {
            Printer.printQAndR();
        } else if (args[0].equals("1-12")) {
            Printer.printIncAndDec();
        } else {
            System.err.println("問題番号を指定してください。");
        }
    }
}


