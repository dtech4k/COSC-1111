public class Fix34 {
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 6, 3, 9,4,2};
        int[] b = fix34(a);
        System.out.println(toString(b));
    }

    public static int[] fix34(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3) {
                b[i] = a[i];
                b[i+1]=4;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) ;{
                b[i]=a[i];

            }
        }
        return b;
    }
        public static String toString (int[] a){
            String foo = "";
            for (int i = 0; i < a.length; i++) {
                foo += a[i] + " ";
            }
            return foo;
        }
    }

