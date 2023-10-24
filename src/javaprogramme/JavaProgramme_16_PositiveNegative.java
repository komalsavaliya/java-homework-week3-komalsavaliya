package javaprogramme;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class JavaProgramme_16_PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner open
        System.out.println("Enter the numbar");// print the statement enter any number
        int number = scanner.nextInt();//assign the value
        scanner.close();// scanner close
        //use if else statement
        if(number > 0){
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }
}
