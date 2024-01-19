public class Checkerboard {
    public static void main(String[] args){
        //define n
        int n = Integer.parseInt(args[0]);
        //begin by creating a larger group to keep track of what row and where in sequence
        for (int i = 0; i<=n; i++) {
            //2 cases: a row starting with space or with a *
            if (i % 2 == 0){
                for (int j = 0; j <= n; j++) {
                    if (j % 2 == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                //heres the other use for an alternate
            } else{
                for (int k = 0;k <= n; k++){
                    if (k % 2 == 0 ){
                        System.out.print(" ");
                    }
                    else System.out.print("*");
                }
            }
            //carriage return
            System.out.println();
        }
        }
    }
