package javaprogramme;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * Salary Slip
 * Employee Id   : 2564
 * Employee Name : Jay
 * Basic Salary  : 25000
 * HRA 10%       : 2500
 * TA 8%         : 2250
 * DA 9%         : 2000
 * PF-20&        : 5000
 * Gross Salary  : 26750
 */
public class JavaProgramme_5_GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner open
        System.out.println("Enter the Employee ID");//printing the Statement for user Employee Id
        int employee_id = scanner.nextInt();//create variable for Employee ID
        System.out.println("Enter the Employee Name");//printing the Statement for Employee Name
        scanner.nextLine();//create variable for Employee name
        String employee_name = scanner.nextLine();
        System.out.println("Enter basic salary");// Printing the Statement for Basic salary
        //scanner.nextDouble();
        double basic_salary = scanner.nextDouble();//Create variable for Basic Salary
        scanner.close();

        // Calculate HRA, TA, DA, PF, and Gross Salary
        double hra = basic_salary * 0.10;
        double ta = basic_salary * 0.08;
        double da = basic_salary * 0.09;
        double pf = basic_salary * 0.20;
        double gross_salary = basic_salary + hra + ta + da - pf;

//Print Salary Slip
        System.out.println("___________________________________________________");
        System.out.println("|                  Salary sleep                   |");
        System.out.println("|_______________________________________________  |");
        System.out.println("|Employee Id                 :" + employee_id  +"                |");
        System.out.println("|Employee Name               :" + employee_name +"                 |");
        System.out.println("|_________________________________________________|");
        System.out.println("|Basic Salary                :" +basic_salary +"             |");
        System.out.println("|HRA 10%                     :" +hra+          "              |");
        System.out.println("|TA 8%                       :" + ta+           "              |");
        System.out.println("|DA 9%                       :" + da+          "              |");
        System.out.println("|PF -20%                     :" + pf +         "              |");
        System.out.println("|_________________________________________________|");
        System.out.println("|Gross Salary                :" + gross_salary+"             |");
        System.out.println("|=================================================|");
    }
}

