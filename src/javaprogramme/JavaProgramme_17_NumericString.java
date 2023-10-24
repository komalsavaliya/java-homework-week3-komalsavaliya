package javaprogramme;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class JavaProgramme_17_NumericString {
    public static void main(String[] args) {
        //Numeric Arrays
        int[] numericArray = {10, 50, 30, 60, 40, 90, 20, 70, 90};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));

        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
//String Arrays
        String[] stringsArrays = {"yellow", "purple", "red ", "black","blue"};
        System.out.println("Original sting Array : " + Arrays.toString(stringsArrays));
//sort the string arrays using a custom comparator for case-insensitive sorting
        Arrays.sort(stringsArrays, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted String Array: " + Arrays.toString(stringsArrays));
    }
}
