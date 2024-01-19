public class BalancingAct {
    public static void main(String[] args) {
        String s = args[0];
        System.out.println(balanced(s));
    }

    public static boolean balanced(String s) {
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && left == 0) {
                return false;
            }
            if (s.charAt(i) == '(') {
                left++;
            }
            if (s.charAt(i) == ')') {
                left--;
            }

        }
        return (left == 0);
    }
}
