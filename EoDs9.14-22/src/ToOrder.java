public class ToOrder {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        boolean toOrder;
        toOrder = ((a>d)&&(b>c)&&(a>b));
        System.out.println(toOrder);


    }


}
