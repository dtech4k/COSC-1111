import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.Locale;

public class DNA {
    public static void main(String[] args) {

    String DNAString = args[0].toLowerCase();

    String DNAStringCircularShift = args[1].toLowerCase();

    System.out.println(DNAString);

    isDNA(DNAString);

    System.out.println(complementWatsonCrick(DNAString));

    boolean palindrome = isWatsonCrickPalindrome(DNAString);
    System.out.println(DNAString + "is ");
    if (palindrome == false){
        System.out.print("not ");
    }
    System.out.print("a Watson-Crick Palindrome.");

    System.out.println(DNAStringCircularShift);
    if (isCircularShift(DNAString, DNAStringCircularShift)){
        System.out.print(" is");
    }else{
        System.out.print(" is not");
    }
    System.out.println(" a circular shift of " + DNAString);
    }
    public static void isDNA(String DNA){

        //first method checks accepts string, checks if each character is ACGT
        //use args.length to cycle through each character in the string
        //but this is a character by character check
        //what is the command to sort through character by character
        //start with a boolean ig
        boolean isDNA = true;
        //use a for loop to cycle through each location of the string
        for (int i = 0; i < DNA.length(); i++){
            char tempLetter = DNA.charAt(i);
            if (tempLetter == 'a'){
                continue;
            }
            if (tempLetter == 't'){
                continue;
            }
            if (tempLetter == 'c'){
                continue;
            }
            if (tempLetter == 'g'){
                continue;
            }
            else{
                isDNA = false;
            }

        }
        System.out.println(isDNA);
        if (isDNA==false){
            System.err.println("This is not DNA!");
            System.exit(1);
        }
        //call method
    }

    public static String complementWatsonCrick(String DNAsequence){
        //new string kinda like an array
        char[] watsonCrickarr = new char[DNAsequence.length()];
        for (int i =0; i<DNAsequence.length();i++){
            if (DNAsequence.charAt(i)=='a'){
                watsonCrickarr[i]='t';
            }
            if (DNAsequence.charAt(i)=='t'){
                watsonCrickarr[i]='a';
            }
            if (DNAsequence.charAt(i)=='c'){
                watsonCrickarr[i]='g';
            }
            if (DNAsequence.charAt(i)=='g'){
                watsonCrickarr[i]='c';
            }


        }
        String watsonCrick = String.valueOf(watsonCrickarr);
        return watsonCrick;
    }
    public static boolean isWatsonCrickPalindrome(String DNAString){
        //watsoncrickpalindrome: DNAString == watsoncrickString.reverseOrder

        //initialize a boolean
        boolean isWatsonCrickPalindrome = false;
        //first step is placing the DNAString into an array of chars, borrowing from previous method
        char[] watsonCrickarr = new char[DNAString.length()];
        for (int i =0; i<DNAString.length();i++){
            if (DNAString.charAt(i)=='a'){
                watsonCrickarr[i]='t';
            }
            if (DNAString.charAt(i)=='t'){
                watsonCrickarr[i]='a';
            }
            if (DNAString.charAt(i)=='c'){
                watsonCrickarr[i]='g';
            }
            if (DNAString.charAt(i)=='g'){
                watsonCrickarr[i]='c';
            }


        }
        String watsonCrick = String.valueOf(watsonCrickarr);
        //now we have a string for the DNAString and for the watsonCrick
        //if(watsoncrick.reverse != DNAString) {boolean is watsonCrickPalindrome = false;}
        //how to we turn this .reverse into a real thing in java?
        //write watsonCrick into an array... didn't we already do this? yes! let's just use what we've already
        //made

        //declare a new array
        char[] watsonCrickReverse = new char[DNAString.length()];

        //so what we need to do is fill a NEW array by iterating through the previous one in reverse order
        //k--
        for (int k = DNAString.length()-1; k>=0; k--){
            //we're counting down from last index position until 0
            //we need to simeoultaneously count up from 0 to last index position
            int kReverse = 0;
            //now we can use this to write
            watsonCrickReverse[k] = watsonCrickarr[kReverse];

            kReverse++;
        }
        //now we've built a new array that is populated with watsonCrick.reverse
        //make it a string, compare the two string, if they are equal, make the boolean true
        String backwardsWatsonCrick = String.valueOf(watsonCrickReverse);

        if (backwardsWatsonCrick == DNAString){
            isWatsonCrickPalindrome = true;
        }
        //last bit is to return the boolean
        return isWatsonCrickPalindrome;
    }
    public static boolean isCircularShift(String DNAString, String DNAStringCircularShift){
        //double the input string and put it into a new string
        String doubleDNAString = DNAString+DNAString;
        //check if {whatever} (what the h~eck~ is going to be my {whatever} value going to be && where is it coming
        //from?
        boolean isSubString = false;
        //ok ok, so using indexOf() we're going to check the substring, store it in a boolean to return
        int returnvalue = doubleDNAString.indexOf(DNAStringCircularShift);
        if (returnvalue>=0){
            isSubString = true;
        }
        return isSubString;
    }
}
