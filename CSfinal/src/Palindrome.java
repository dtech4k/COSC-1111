public class Palindrome {
    //An array a of ints is an x-scaled palindrome for a non-zero, positive integer x if:
    //
    //- a has a length equal to zero, no matter what x is, or
    //- a  has length equal to one, and the only element in a has value x, or
    //- a has length greater than 1 and the last element of the array is equal to x times the first element of the array
    //   and the elements from the second to the second-to-last (both included) form a x-scaled palindrome.
    //
    //For example:
    //
    //{ 2, 4 } is a 2-scaled palindrome
    //
    //{ 3, 1, 3, 9 } is a 3-scaled palindrome
    //
    //{ 3, 2, 5, 10, 15 } is a 5-scaled palindrome
    //
    //However, { 3, 5, 7, 9 } is not a x-scaled-palindrome for any x.

    //recursion
    //int x

    public static boolean scaledPalindrome(int[] a, int x){
        //
        //In a class Palindrome, do the following:
        //
        //First: write a method scaledPalindrome that takes as input parameters an  int[] a and a non-zero, positive  int x
        // and returns a boolean denoting whether a is a x-scaled palindrome.  You will likely want to use recursion, but
        // you don't have to.
        //

        //two base cases
        if (a.length==2){
            if (a[1]==(a[0]*x)){
                return true;
            }else{return false;}
        } else if (a.length==1) {
            if (a[0]==x) {
                return true;
            }else{
                return false;
            }
        }else if (a[a.length-1]==(a[0])*x){
            int[] toPass = new int[a.length-2];
            for (int i = 0; i < toPass.length; i++) {
                toPass[i]=a[i+1];
            }
            return scaledPalindrome(toPass, x);
        }else{
            return false;
        }
    }

    //Second: write a method findX that takes as input parameter an int[] a and returns an int that is either:
    //- the integer x for which a is an x-scaled palindrome, if such an integer exists, or
    //- 0 if a is not an x-scaled palindrome for any value of x
    //
    //For example:
    //
    //for an input of { 3, 6 }, findX must return 2
    //
    //for an input of { 3, 4, 12 }, findX must return 4
    //
    //for an input of { 3, 5, 7, 9}, findX must return 0
    //
    //Hint: use scaledPalindrome in findX.
    public static int findX(int[] a){
        int guess = (a[a.length-1])/a[0];
        if (((a[a.length-1])%a[0]) !=0){
            return 0;
        }else if (scaledPalindrome(a, guess)){
            return guess;
        }else{return 0;}
    }
}
