package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * Sales amount >= 20,000 10%
 * Sales amount >= 10,000 5%
 * Sales amount < 10,000 2%
 */

public class JavaProgramme_7_Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Scanner open
        System.out.println("Sales Id: ");//print statement for slaes id
        int salesId = scanner.nextInt();
        scanner.nextLine();//assign the value
        System.out.println("Seller's Name: ");//print statement for seller's name
        String sellerName = scanner.nextLine();//assign the value
        System.out.println("Sales Amount: ");//print statement for slaes amount
        double salesAmount = scanner.nextDouble();//assign the value
        System.out.println("Salary Basic: ");//print statement for salary basic
        double salaryBasic  = scanner.nextDouble();//assign the value
        double commissionRate;
        //if else statement
        if (salesAmount >= 50000){
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
             commissionRate = 0.20;
            }else if (salesAmount >= 20000){
                 commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
             commissionRate = 0.05;
        }else {
             commissionRate = 0.02;
        }
        double commission = salesAmount * commissionRate;// method of commission
        double totalSalary = salaryBasic + commission;
        System.out.println("sales commission report");
        System.out.println("Sales Id: " + salesId);
        System.out.println("seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Commission: " + commission );
        System.out.println("Total Salary: " + totalSalary);
        scanner.close();

    }
}
