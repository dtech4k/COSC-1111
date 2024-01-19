public class F2K {
    public static void main(String[] arg){
        //accept some temperature value in imperial, store it as F (for Fahrenheit)
        double F = Double.parseDouble(arg[0]);
        //calculate Fahrenheit to Celsius (C)
        double C = (F - 32) * (5.0 / 9);
        //convert Celsius (C) to Kelvin (K) by adding 273.15
        double K = C + 273.15;
        System.out.println("The temperature is" + K + "degrees Kelvin.");
    }

}
