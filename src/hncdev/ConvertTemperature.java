package hncdev;

public class ConvertTemperature {

    /*
    Given a temperature in Celsius, convert it to Kelvin and Fahrenheit.
     */

    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = (celsius + 273.15);
        ans[1] = ((celsius * 1.80) + 32.00);
        return ans;
    }

    public static void main(String[] args) {
        ConvertTemperature convertTemperature = new ConvertTemperature();
        double[] ans = convertTemperature.convertTemperature(100);
        System.out.println("Kelvin: " + ans[0] + " Fahrenheit: " + ans[1]);
    }
}
