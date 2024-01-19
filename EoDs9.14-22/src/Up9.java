public class Up9 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a * b;
        boolean up9;
        up9 = ((a==9)||(b==9)||((a+b)==9)||((c%9)==0));
        System.out.println(up9);
    }
}
