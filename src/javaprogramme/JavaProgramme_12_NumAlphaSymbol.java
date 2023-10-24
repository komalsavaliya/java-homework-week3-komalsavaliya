package javaprogramme;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class JavaProgramme_12_NumAlphaSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner open
        System.out.println("Enter the Character");// print statement for enter any character
        char input = scanner.next().charAt(0);//  allow to save input
        scanner.close();// scannar close
        //if else statement
        if (Character.isDigit(input)){
            System.out.println("Input is Number");//print statement for enter any number
        }else if (Character.isLetter(input)){
            System.out.println("Input is Alphabet");//print statement for enter any alphabet
        }else{
            System.out.println("Input is Symbol");//print statement for enter any symbol
        }
    }
}
