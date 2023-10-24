package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class JavaProgramme_1_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner open
        System.out.println("Enter the number");//printing the Statement for user enter any number
        int num = scanner.nextInt();
        scanner.close();// Scanner close
        String output = (num % 2 ==0) ? "even number" : "odd number";//method for checking number is even or odd
        System.out.println(output);
    }
}
