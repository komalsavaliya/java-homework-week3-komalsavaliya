package javaprogramme;

import java.util.Scanner;

/**
 *Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry.
 */
public class JavaProgramme_8_CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner open
        System.out.println("Enter any alphabet from 'A to F' : ");// print statement enter any alphabet beteen  "A to F"
        char alphabet = scanner.next().charAt(0);//allow to save 1 letter
        scanner.close();// scaneer close
        String city;
        //use if else Statement
        if (alphabet =='A' || alphabet =='a'){
            city = "Ahmedabad";
        } else if (alphabet == 'B'|| alphabet == 'b') {
            city = "Bombay";
        } else if (alphabet == 'C'|| alphabet == 'c') {
            city = "Calcutta";
        } else if (alphabet == 'D'|| alphabet == 'd') {
            city = "Delhi";
        } else if (alphabet == 'E'|| alphabet =='e') {
            city = "Essar";
        } else if (alphabet == 'F'||alphabet =='f') {
            city = "Fatehpur";
        } else  {
            city = "Invalid entry";
        }
        System.out.println("City Name: " + city);
    }
}
