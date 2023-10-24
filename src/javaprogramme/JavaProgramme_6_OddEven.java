package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class JavaProgramme_6_OddEven {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter any number");// print for any number
        Scanner scanner = new Scanner(System.in);// Scanner open
        number = scanner.nextInt(); //assign the value
        scanner.close();// scanner close

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number");
        }
            else
                System.out.println(number + " is an odd number");
            }
        }




