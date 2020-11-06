public class Main {
    public static void main(String[] args) {
        if (args[0].equals("1-1")) {
            HelloWorldPrinter.printWord();
        }
        if (args[0].equals("1-2")) {
            IntPrinter.printInt();
        }
        if (args[0].equals("1-3")) {
            IntPrinter.printIntPair();
        }
        if (args[0].equals("1-4")) {
            IntPrinter.printIntSum();
        }
        if (args[0].equals("1-5")) {
            IntPrinter.printIntTimes();
        }
        if (args[0].equals("1-6")) {
            Calculator.printDouble(Calculator.times3());
            Calculator.printDouble(Calculator.divided2(Calculator.times3()));
        }
        if (args[0].equals("1-7")) {
            IntPairSwitcher.printSwitchXY();
        }
        if (args[0].equals("1-8")) {
            IntPrinter.printIntTimesZ();
        }
        if (args[0].equals("1-9")) {
            Calculator.printMultiplication();
        }
        if (args[0].equals("1-10")) {
            Calculator.printExponentiation();
        }
        if (args[0].equals("1-11")) {
            Calculator.printQAndR();
        }
        if (args[0].equals("1-12")) {
            IncrementAndDecrementOperator.printIncAndDec();
        }
    }
}


