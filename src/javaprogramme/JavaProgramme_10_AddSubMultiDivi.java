package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class JavaProgramme_10_AddSubMultiDivi {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);// Scanner open
        System.out.println("Enter the First Number : ");// print statement to enter first number
        num1 = scanner.nextInt();//assign the value
        System.out.println("Enter the Second Number : ");//print statement to enter second number
        num2 = scanner.nextInt();//assign the valu
        System.out.println("Enter the Operator (+, -, /, *");//print statement to enter any Operator
       char operator = scanner.next().charAt(0);
        double result = 0;
        scanner.close();// scanner close
        //use if else method
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        }
        System.out.println("Result: " + result);
    }
}
