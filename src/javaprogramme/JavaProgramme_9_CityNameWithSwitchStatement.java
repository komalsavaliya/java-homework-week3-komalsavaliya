package javaprogramme;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry using switch statement
 */
public class JavaProgramme_9_CityNameWithSwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Scanner open
        System.out.println("Enter any alphabet from 'A to F' : ");
        char alphabet = scanner.next().charAt(0);//allow to save 1 letter
        scanner.close();//scaner close
        String city;
        //using switch statement
        switch (alphabet) {
            case 'A':
            case 'a':
                System.out.println("City name : Ahmedabad");
                break;
            case 'B':
            case 'b':
                System.out.println("City name : Bombay");
                break;
            case 'C':
            case 'c':
                System.out.println("City name : Calcutta");
                break;
            case 'D':
            case 'd':
                System.out.println("City name : Delhi");
                break;
            case 'E':
            case 'e':
                System.out.println("City name : Essar");
                break;
            case 'F':
            case 'f':
                System.out.println("City name : Fatehpur");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
