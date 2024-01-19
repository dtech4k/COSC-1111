import java.util.Arrays;

public class FindDup {
    public static void main(String[] args){
        //make a random array
        int arraySize = (int) (2+Math.random()*10);
        int[] a = new int[arraySize];
        //populate the array itself
        for (int j = 0; j < a.length; j++){
            a[j] = (int) (Math.random()*20);
        }
        //print the array for transparency
        System.out.println(Arrays.toString(a));
        //print whether or not there is a repeating number
        System.out.println("Repeated Numbers: " + findDuplicate(a));
    }
    public static boolean findDuplicate(int[] a){
        boolean duplicate = false;
        for (int i = 0; i< a.length; i++){
            //create a temp variable numberHolder corresponding to a[i]
            int numberHolder = a[i];
            //using a loop check numberHolder against all other values
            for (int j = 0; j < a.length; j++){
                //if j == i, j++
                if (j == i){
                    j++;
                }else{
                    if (a[j] == numberHolder){
                        duplicate = true;
                    }
                }
            }
        }
        return duplicate;
    }
}

