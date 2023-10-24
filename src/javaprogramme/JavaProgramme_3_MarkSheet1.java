package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *         Mark Sheet
 * _____________________________
 *  Name       : Jay
 *  Roll No    : 08
 *  Subjects   : Marks
 *  Math       : 98
 *  Science    : 90
 *  English    : 85
 *  Total      : 273
 *  Percentage : 91.0
 *  Result     : Pass
 *  Grade      :A+
 */

public class JavaProgramme_3_MarkSheet1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner open
        System.out.println("Enter Student name : ");// Printing the Statement for enter Student name
        String name = scanner.nextLine();//create variable
        System.out.println("Enter Student roll number : ");//Print the roll number
        int no = scanner.nextInt();//Create variable
        System.out.println("Enter the mark of Math :  ");// Printing the Statement for enter the mark of Maths
        int math = scanner.nextInt();//create variable
        if (math <0 || math >100){//checking the input between 0 to 100
            throw new ArithmeticException("Invalid input mark should be between 0 to 100");//print the statement condition check for marks within the 100
        }//stop the programme if values are not within 0 to 100
        System.out.println("Enter the mark of Science : ");// Printing the Statement for enter the mark of Science
        int science = scanner.nextInt();//create variable
        if (science <0 || science >100){//checking the input between 0 to 100
            throw new ArithmeticException("Invalid input mark should be between 0 to 100");//print the statement condition check for marks within the 100
        }//stop the programme if values are not within 0 to 100
        System.out.println("Enter the mark of English : ");// printing Statement for enter the mark of Emglish
        int english =scanner.nextInt();//create variable
        if (english <0 || english >100) {//checking the input between 0 to 100
            throw new ArithmeticException("Invalid input mark should be between 0 to 100");//print the statement condition check for marks within the 100
        }//stop the programme if values are not within 0 to 100
        Object Science;
        int total = math+science+english;// total of marks
        int avg = total/3;// Average of total
        System.out.println("Total : " + total );//print the statement for avg of mark
        scanner.close();//scanner close
        //crating logic for pass or fail
        if(math>=35 && science>=35 && english>=35){
            System.out.println("Result : Pass" );
        }
        else {
            System.out.println("Result : Fail" );
        }
        System.out.println("percentage : " + avg);
        if(avg>=80){
            System.out.println("Student grade is A+");
        }
        else
            if (avg>=60) {
            System.out.println("Student grade  A");
        }
        else
            if (avg>=50) {
            System.out.println("Student grade  B");
        }
        else
            if (avg>=35) {
            System.out.println("student grade  C");
        }
    }
}

