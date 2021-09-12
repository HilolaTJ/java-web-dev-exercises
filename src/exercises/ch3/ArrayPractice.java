package exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main (String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printOddNumbers();
        arrayPractice.splitGivenString();
        arrayPractice.splitGivenStringIntoSentences();
    }

    public void printOddNumbers(){
        //  1, 1, 2, 3, 5, 8
        int[] myArrayOfInts = { 1, 1, 2, 3, 5, 8 };
        for (int i = 0; i < myArrayOfInts.length; i++) {
            // if the number is NOT divisible by 2, then the number is odd
            if (myArrayOfInts[i] % 2 == 1) {
                System.out.println(myArrayOfInts[i]);
            }
        }
    }
    public String[] splitGivenString() {
        String myProvidedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] mySplitStrings = myProvidedString.split(" ");
        // System.out.println(Arrays.toString(mySplitStrings));
        return mySplitStrings;
    }
    public void splitGivenStringIntoSentences() {
        String myProvidedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] mySplitStrings = myProvidedString.split("\\.");
        System.out.println(Arrays.toString(mySplitStrings));
    }
}

