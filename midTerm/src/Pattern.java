import java.sql.SQLOutput;

public class Pattern {
    public static void main(String[] args){
        //set conditions for err
        if (args.length != 1){
            System.err.println("Please provide one valid integer input");
            System.exit(1);
        }
        //parse out int value
        int n = Integer.parseInt(args[0]);
        //error for values <2
        if (n < 2){
            System.err.println("Please provide a value of 2 or greater");
            System.exit(1);
        }
        // draw the first line, sp then n dashes
        for (int j = 0; j<n; j++) {
            if (j == 0) {
                System.out.print(" ");
            } else {
                System.out.print("-");
            }
        }
        //create a pattern for a column
        //print |, then n-1 spaces,/ then |
        //then n-2 spaces, /, then 1 space
        //then n-3 spaces, /, then 2 spaces, then |
        //
        for (int i = n; i>=0; i--){
            for (int k = 0; k<=i; k++){
                if (k == 0){
                    System.out.println("|");
                }if(k>0 && k <i){System.out.print(" ");
                }
                else{
                    System.out.print("|");
                }

            }
        }



        }
    }

