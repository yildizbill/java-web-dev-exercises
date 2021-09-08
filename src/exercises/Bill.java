package exercises;


import java.util.Scanner;

public class Bill {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String name = input.nextLine();
        System.out.println("Your name is "+name);


        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                continue;
            }
            System.out.println("Not here");
        }
    }
}
