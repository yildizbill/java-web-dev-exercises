package exercises;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of your desired rectangle");
        double len = input.nextDouble();
        System.out.println("Please enter width of your desired rectangle");
        double wid = input.nextDouble();
        double area = len*wid;
        System.out.println("Your rectangle area is "+ area);
        input.close();












    }
}
