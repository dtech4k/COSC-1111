public class Powers {
    public static void main(String[] args){
        //pull integer n from CLI
        double n = Integer.parseInt(args[0]);
        // define somePower as the next power of 2 of someNumber
        double somePower = 0;
        //2^x <= n; x is all integers define x? for loop
        double someNumber = 0;
            if (n > 0) {
                while (someNumber < n) {
                    someNumber = Math.pow(2, somePower);
                    System.out.println(someNumber);

                    somePower++;
                }
            }else{while (somePower >= n) {

                someNumber = Math.pow(2, somePower);
                System.out.println(someNumber);
                somePower--;
            }
            }
    }
}
