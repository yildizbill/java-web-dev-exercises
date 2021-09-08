package exercises;

import java.util.*;

public class areaOfaCircle {



       public static Double getArea(){
            System.out.println("Please enter radius");
            Scanner input = new Scanner(System.in);
            double radius = input.nextDouble();
            input.close();
            return 3.14*radius*radius;

       }
    public static void main(String[] args){
           areaOfaCircle inst = new areaOfaCircle();
        System.out.println( areaOfaCircle.getArea());

    }
}
