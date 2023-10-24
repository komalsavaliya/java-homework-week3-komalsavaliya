package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * Mark Sheet
 * _____________________________
 * Name       : Jay
 * Roll No    : 08
 * Subjects   : Marks
 * Math       : 98
 * Science    : 90
 * English    : 85
 * Total      : 273
 * Percentage : 91.0
 * Result     : Pass
 * Grade      :A+
 */

public class JavaProgramme_3_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// scamnner open
        //Input student details
        System.out.println("Enter Student's Name: ");// print Student's name
        String name = scanner.nextLine();//assign the value
        System.out.println("Enter Roll Number: ");//print roll number
        int rollNo = scanner.nextInt();//assign the value
        System.out.println("Enter Math marks: ");// print mathe mark
        double mathMark = scanner.nextInt();//assign the value
        System.out.println("Enter Science marks: ");// print Science mark
        double scienceMark = scanner.nextInt();//assign the value
        System.out.println("Enter English marks: ");// print English mark
        double englishMark = scanner.nextInt(); //assign the value
        scanner.close();// scanner close
        //if the marks enter between 0 to 100 for each Subject
        if (mathMark < 0 || mathMark > 100 || scienceMark < 0 || scienceMark > 100 || englishMark < 0 || englishMark > 100) {
            throw new ArithmeticException("Invalid input mark should be between 0 to 100");
        }
        //Calculate percentage and result
        double totalMarks = mathMark + scienceMark + englishMark;
        double percentage = (totalMarks / 300) * 100;
        String result = (percentage >= 35 && mathMark >= 35 && scienceMark >= 35 && englishMark >= 35) ? "Pass" : "Fail";// used ternary operator
        String grade = "Fail";
        if (percentage <= 100 && percentage >= 80) {
            grade = "A+";
            System.out.println(grade = "Grade A+");
        } else if (percentage < 80 && percentage >= 60) {
            grade = "A";
            System.out.println(grade = "Grade A");
        } else if (percentage < 60 && percentage >= 50) {
            grade = "B";
            System.out.println(grade = "Grade B");
        } else if (percentage < 50 && percentage >= 35) {
            grade = "C";
            System.out.println(grade = "Grade C");
        } else {
            System.out.println("Fail");
        }
        //Declare result
        System.out.println("Total: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result : " + result);
        System.out.println("Grade: " + grade);
        // Pint Mark sheet:
        System.out.println(" _______________________________________________");
        System.out.println("|                                               |");
        System.out.println("|                   Mark Sheet                  |");
        System.out.println("|_______________________________________________|");
        System.out.println("|      Name         :    " + name + "                    |");
        System.out.println("|      Roll No.     :    " + rollNo + "                      |");
        System.out.println("|_______________________________________________|");
        System.out.println("|      Subjects     :       Marks               |");
        System.out.println("|_______________________________________________|");
        System.out.println("|     Math          :    " + mathMark + "                   |");
        System.out.println("|     Science       :    " + scienceMark + "                   |");
        System.out.println("|     English       :    " + englishMark + "                   | ");
        System.out.println("|_______________________________________________|");
        System.out.println("|     Total         :    " + totalMarks + "                  |");
        System.out.println("|_______________________________________________|");
        System.out.println("|     Percentage    :    " + percentage + "                   |");
        System.out.println("|     Result        :    " + result + "                   |");
        System.out.println("|     Grade         :    " + grade + "               |");
        System.out.println("|_______________________________________________|");
    }
}


