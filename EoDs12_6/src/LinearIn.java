public class LinearIn {
    public static void main(String[] args){
        //In a program LinearIn, write a method linearIn that, given two arrays of ints sorted in increasing order,
        // called outer and inner, returns true if all the numbers in inner appear in outer, and false otherwise.
        // You can assume neither inner nor outer have any repeated values. The best solution makes only a single
        // "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
        int[] inner = {2,9,4};
        int[] outer = {1,2,3,4,5,6};
        if (linearIn(inner, outer)){
            System.out.println("The inner array is present within the outer array.");
        }else{
            System.out.println("The inner array is NOT present within the outer array.");
        }
    }
    public static boolean linearIn(int[] inner, int[] outer){
        int innerfirst = inner[0];
        //provide some way of looking at the inner arr while comparing with various points in outer
        for (int i = 0; i < outer.length; i++) {
            if (outer[i]==innerfirst){
                if (compare(inner, outer, i)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean compare(int[] inner, int[] outer, int initial){
        for (int i = 0; i < inner.length; i++) {
            if (inner[i]!=outer[initial]){
                return false;
            }else{initial++;}
        }
        return true;
    }
}
