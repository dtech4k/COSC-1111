public class EOD04_1 {
    public static void main(String[] args) {
        //Creating a for loop, in it, i is declared to count how many instances of "Hello World!" have been printed
        //Since we begin counting at zero, the tenth instance of the println command being executed
        //is i=9
        //for every time the loop is repeated one is added to the integer stored in the variable i
        // => "Hello World!" is printed 10 times
        // this was learned from S&W Sect 1.3 pg 59
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
    }
}
