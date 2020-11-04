public class Main {
    public static void main(String[] args){
        if(args.length < 1){
            System.err.println("引数にメール");
            System.exit(-1);
        }
        String input = args[0];
        String input1 = args[1];
        System.out.println(input1);
        int begin = input.indexOf("<");
        if (begin >= 0){
            begin++;
            int end = input.indexOf(">");
            if(end>begin){
                String addr = input.substring(begin,end);
                System.out.println(addr);
            }
        }
        //System.out.println(s.contains("1"));
    }
}
