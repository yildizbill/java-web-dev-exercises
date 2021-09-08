package exercises;

import java.util.*;
import java.lang.*;
public class Alice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word that you want to search");
        String word = input.nextLine();
        word = word.toLowerCase(Locale.ROOT);
        String words = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        words = words.toLowerCase(Locale.ROOT);
        String[] wordSet;
        wordSet = words.split("[ \\s,:'?]+");

        List<String> wordList = Arrays.asList(wordSet);


        if (wordList.contains(word)) {
            System.out.println("It is found and length of it  " + word.length() + " plus our index is "+wordList.indexOf(word));
        } else {
            System.out.println("It is not found");
        }
    }


        }

