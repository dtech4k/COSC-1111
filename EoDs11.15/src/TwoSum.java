public class TwoSum {
    public static void main(String[] args){
        //store all inputs into an array of ints
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        System.out.println(twoSum(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static boolean twoSum(int[] a){
        //twoSum should just yield a boolean as to whether or not two numbers in the array sum to zero
        //grab each number sequentially from the array

        //if (a[i] >0)
        //temp var = 0 - a[i];

        //if (a[i] <0)
        //temp var = 0+ a[i]

        //if a[i] == 0
        //temp var =0;

        //search for temp var
        //if exists: return true; else continue;
        boolean sum = false;
        for (int i = 0; i < a.length; i++) {
            int tempvar;
            if (a[i]>0){
                tempvar = -a[i];
                if (search(tempvar, a)==0){
                    sum = true;
                    return sum;
                };
            }
            if (a[i]<0){
                tempvar = Math.abs(a[i]);
                if (search(tempvar, a)==0) {
                    sum = true;
                    return sum;
                };
            }else{tempvar = 0;
                if (search(0, a)==0){
                    sum=true;
                    return sum;
                }
                }
        }
        return sum;
    }

    public static int search(int key, int[] a)
    {  return search(key, a, 0, a.length);  }
    public static int search(int key, int[] a, int lo, int hi) { // Search for key in a[lo, hi).
        if (hi <= lo) return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = 0;
        //if (a[mid] == key){cmp = 0;}
        if (a[mid] > key){cmp = 1;}
        if (a[mid] < key){cmp = -1;}
        //int cmp = a[mid].compareTo(key);
        if      (cmp > 0) return search(key, a, lo, mid);
        else if (cmp < 0) return search(key, a, mid+1, hi);
        else              return mid;
    }
    }

//}
