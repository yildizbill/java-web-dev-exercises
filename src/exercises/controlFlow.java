package exercises;

import java.util.Arrays;

public class controlFlow {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 5, 8};

        for (int a : arr) {
            System.out.println(a);
        }

        String str =" I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] strArray = str.split("[\\s,.]+");

        for(String a : strArray){
            System.out.println(a);
        }

        System.out.println(Arrays.toString(strArray));
    }
}