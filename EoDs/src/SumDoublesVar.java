public class SumDoublesVar {
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
        //x and y are used as placeholder variables so the final result does not get messy
        //Math.random() intervals were chosen because they are divisible by 3, which I enjoy
        double x = outcome + (Double) (Math.random() * 12);
        double y = (outcome + (Double) (Math.random() * 9));
        //final value is name 'last' because there are far too many instances of 'outcome' for me
        int last = (int) (outcome + x + y);
        System.out.println(last);
    }
}
