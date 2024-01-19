public class bogoSort {
    public static void main(String[] args){
        //The idea of bogoSort is the following: given the input array arr, check whether it is sorted.
        // If it is, then we are done, if it isn't, then shuffle the elements at random using the Fisher-Yates'
        // algorithm that we have used for shuffling Deck in the CardGame assignment, and repeat until the elements are
        // sorted.
        //In a program BogoSort, write a method bogoSort(int[] arr) that sorts arr according to the above idea.
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int shuffleCount = bogoSort(arr);
        System.out.println("The array was sorted in " + shuffleCount + "shuffles.");
    }
    public static int bogoSort(int[] arr){
        int idx = 1;
        int shuffleCount =0;
        while (idx<arr.length){
            if (arr[idx]>arr[idx-1]){
                idx++;
            }else{
                Shuffle(arr);
                shuffleCount++;
                idx =1;
            }
        }
        return shuffleCount;
    }
    public static void Shuffle(int[] arr){
        for (int i = arr.length-1; i > 1; i--) {
            int temp = ((int) (Math.random()*i));
            int holdThis = arr[temp];
            arr[temp] = arr[i];
            arr[i] = holdThis;

        }
    }
}
