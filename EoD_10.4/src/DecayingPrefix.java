public class DecayingPrefix {
    public static void main(String[] args){
        String UserString = args[0];
        int lenDecay = Integer.parseInt(args[1]);
        decayingPrefix(UserString, lenDecay);

    }
    public static void decayingPrefix(String UserString, int lenDecay){
        //lets find out how long our string is
        int lenString = UserString.length();
        //method should first check to make sure that n is between 0 and the length of s inclusive.
        if (lenDecay >= lenString){
            System.err.println("please ensure that integer is less than string length");
            System.exit(1);
        }


    }
}
