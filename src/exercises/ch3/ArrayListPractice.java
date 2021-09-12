package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        // ArrayList<Integer> numbersToSum = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
        // System.out.println("The sum is: " + theSum.toString());

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitGivenString();

        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));
        System.out.println("What word are you looking for: ");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
        ArrayListPractice.printWordsFiveLetters(wordsToSearch, searchLength);
    }

    public static Integer getUserSearchInput() {
        Scanner scanner = new Scanner(System.in);
        Integer myUserInt = scanner.nextInt();
        scanner.close();
        return myUserInt;
    }
    public static void printWordsFiveLetters(ArrayList<String> words, Integer searchLength) {
        for (int i = 0; i < words.size(); i++){
            if(words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }
    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum) {
        Integer sum = 0;
        for(int i = 0; i < valuesToSum.size(); i++) {
            if (valuesToSum.get(i) % 2 == 0){
                sum += valuesToSum.get(i);
            }
        }
        return sum;
    }
}
