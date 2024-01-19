public class Ackermann {
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        if (m<0 || n<0){
            System.err.println("Please provide two non-negative integers");
            System.exit(1);
        }
        int A = function(m, n);
        System.out.println(A);
    }

    public static int function(int m, int n){
        if (m==0){
            return n+=1;
        }
        if (m>0 && n==0){
            n = function(m-1,1);
        }else{
            n = function(m-1, function(m,n-1));
        }
        return n;
    }
}
