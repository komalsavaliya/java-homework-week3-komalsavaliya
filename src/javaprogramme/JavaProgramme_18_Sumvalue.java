package javaprogramme;

/**
 * Write a Java program to sum values of an array
 */
public class JavaProgramme_18_Sumvalue {
    public static void main(String[] args) {
        int[] numbers = {10,5,2,6,7,8,9,1,3,4};//variable
        int sum = 0 ; // variable to store into sum
        //Iterate through thr array and add each element to the sum
        for (int i =0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("The Sum of array element : " + sum);//print the sum of array element
    }
}
