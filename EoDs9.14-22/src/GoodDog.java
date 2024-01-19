public class GoodDog {
    public static void main(String[] args){
        String hour = args[0];
        String dogIsBarking = args[1];
        boolean trouble = doghouse(hour,dogIsBarking);
        System.out.println(trouble);
    }
    public static boolean doghouse(String hour, String dogIsBarking){
        int time = Integer.parseInt(hour);
        boolean trouble = Boolean.parseBoolean(dogIsBarking);
        trouble = (((time>=22)&&(trouble=true))||(time<=8)&&(trouble=true));
        return trouble;
    }
}
