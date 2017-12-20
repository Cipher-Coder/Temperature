import java.util.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        temperature = in.nextInt();

        temperature = ((temperature*9) /5) +32;

        System.out.println("Temperature in Fahrenheit =  " + temperature);
    }
}
