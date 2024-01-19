public class RollDice {
    public static void  main(String[] args){
        int face = Integer.parseInt(args[0]);
        int result1 = rollDie(face);
        face = Integer.parseInt(args[1]);
        int result2 = rollDie(face);
        face = Integer.parseInt(args[2]);
        int result3 = rollDie(face);
        System.out.println(result1 + " "+result2+" "+result3);
    }
    public static Integer rollDie(int face){
        int result = (int) (Math.random()*face);
        return result;

    }
}
