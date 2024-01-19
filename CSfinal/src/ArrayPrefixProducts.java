import java.util.Arrays;

public class ArrayPrefixProducts {
    ///DONE///- Its parameters are two arrays of integers of the SAME LENGTH called a and b
    //- The method should return an array of arrays where the array at index i contains the results of multiplying each
    // element from a[0] to a[i] by each element from b[0] to b[i]. All arrays should have the exact length they need
    // to have. The order of the values in the "inner" arrays is not fixed, you can choose your own.
    public static void main(String[] args){
        int[] a = new int[]{3,1,2};
        int[] b = new int[]{-1, 4, 5};
        int[][] yurii = arrayPrefixProducts(a, b);
        for (int i = 0; i < yurii.length; i++) {
            System.out.println(Arrays.toString(yurii[i]));
        }
    }

    public static int[][] arrayPrefixProducts(int[] a, int[] b){
        //determine length of 'master' array
        //each index of that array will contain address to some array containing a[i] multiplied by b[[0,i]]
        //so length is == a.length
        int[][] toReturn = new int[a.length][];
        //each referenced array will be of length i^2
        for (int i = 0; i < a.length; i++) {
            int pow = (int) (Math.pow(i+1, 2));

            toReturn[i] = new int[pow];
        }
        //arrays are built, now to fill
        //arrayPrefixProducts( {3, 1, 2}, {-1, 4, 5}) should return a reference to an array of arrays like the following:
        //
        //{{ -3},
        // {-3, 12, -1, 4},
        // {-3, 12, 15, -1, 4, 5, -2, 8, 10} }

        for (int i = 0; i < toReturn.length; i++) {
            //now we're looking at each index of a[i]
            //for ease of thinking lets make that variable an int

            //a index
            //now we need to compare with b
            //since same length, <= comparator is correct
            int toReturnIndex = 0;
            for (int j = 0; j <=i; j++) {
                for (int k = 0; k <= i; k++) {
                    toReturn[i][toReturnIndex] = a[j]*b[k];
                    toReturnIndex++;
                }
            }
            toReturnIndex=0;

        }
        return toReturn;
    }
}
