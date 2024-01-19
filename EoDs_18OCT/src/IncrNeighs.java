import java.util.Arrays;

public class IncrNeighs {
    public static void main(String[] args){
        //make a random array
        int arraySize = (int) (2+Math.random()*10);
        int[] a = new int[arraySize];
        //populate the array itself
        for (int j = 0; j < a.length; j++){
            a[j] = (int) (Math.random()*20);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(threeIncreasingNeighbors(a));
    }

    public static boolean threeIncreasingNeighbors(int[] a){
        //establish a boolean to return false if not changed to true
        boolean increase = false;
        //variable of count to be modified for each instance of increase
        //count will only increase if lastNumber < a[i]
        int count = 0;
        //temp variable to hold the previous number
        int lastNumber = a[0];
        for (int i = 1; i < a.length; i++){
           if (count == 3){
               increase = true;
               return increase;
           }else{
               //compare index position number to last number
               if (a[i] < lastNumber) {
                   count = 0;
                   lastNumber = a[i];
               } else {
                   lastNumber = a[i];
                   count++;
               }

           }
        }
        return increase;
    }
}
