package exercises;

import java.util.ArrayList;

public class ArrayListExamples {

    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for(int integer : arr ){
            if (integer%2 == 0){
                total+=integer;
            }
        }
        return total;

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();


        for(int i=0; i<11; i++){
            list.add(i);
        }

        System.out.println(list);

        //some other methods
        list.size();
        list.clear();
       // list.set(0,8);

        //calling static method from above
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(13);
        arr.add(14);
        System.out.println(arr);
        System.out.println(ArrayListExamples.sumEven(arr));


    }
}
