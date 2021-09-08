package exercises;
import java.util.Scanner;
public class cToF {
    public static void main(String[] args){
        double fahrenheit;
        double celsius;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Fahrenheit");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
