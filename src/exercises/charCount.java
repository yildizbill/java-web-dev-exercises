package exercises;

import java.util.HashMap;
import java.util.Map;

public class charCount {

   static void charCounter(String str){

        char[] arr = str.toCharArray();
        HashMap<Character,Integer> myMap = new HashMap<>();

        for(char x : arr){
            if(myMap.containsKey(x)){
                myMap.put(x,myMap.get(x)+1);
            }else{
                myMap.put(x,1);
            }

        }
       for (Map.Entry entry :myMap.entrySet()) {
           System.out.println(entry.getKey() + " " + entry.getValue());
       }
    }
    public static void main(String[] args) {
        String str ="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        charCount.charCounter(str);

    }
}
