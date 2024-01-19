public class SumDoubles {
    public static void main(String[] args) {
        // a and b are the first and second command line arguments
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        //c is the sum of a and b
        Double c = a + b;
        //d is the product of a and b
        Double d = a * b;
        //e is the final value to be printed
        int outcome = (int) (c + d);
        System.out.println(outcome);
    }
}
