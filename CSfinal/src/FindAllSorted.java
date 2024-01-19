public class FindAllSorted {
    //In a class FindAllSorted, write a method findAllSorted with the following specifications:
    //
    //- Its parameters are two sorted arrays of integers called d and a.
    //- The array d contains distinct integers (i.e., all values in this array are unique), while a may contain duplicate values.
    //- The method should return true is all values stored in d are present in a, and false otherwise.
    //- The array a may contain values that are not in d.
    //- Your code must use the fact that d and a are sorted in increasing order (i.e., a could be { 3, 4, 4, 5 }).
    //- Hint: if you found the value of d[j] at a[z], where in a could d[j+1] be?
    public static void main(String[] args){
//idk why i made a main method
        int[] d = new int[]{1,2,3,4};
        int[] b = new int[]{1,2,4,5};
        int[] a = new int[]{1,2,3,4,6,7};
        //expect true
        System.out.println(findAllSorted(a,d));
        //expect false
        System.out.println(findAllSorted(a,b));
    }
    public static boolean findAllSorted(int[] a, int[] d){
        //assume two sorted arrays
        boolean toReturn = true;
        if (d.length>a.length){
            return false;
        }
        for (int i = 0; i < d.length; i++) {
            //for each value of d find it in a
            //checking for all values in d are in a; and both are sorted && that sort is increasing order,
            //reuse of i is okayas reference for the next for loop
            for (int j = i; j < a.length; j++) {
                if (d[i]==a[j]){
                    break;
                } else if (j==a.length-1) {
                    return false;
                }
            }
        }
        return true;
    }

}
