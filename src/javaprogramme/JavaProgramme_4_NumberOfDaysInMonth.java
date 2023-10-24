package javaprogramme;

import java.util.Scanner;

/**
 * Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month.Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 * Example of input/Output:
 * ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
 * ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 * year.
 * ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 * 2018 is not a leap year.
 * ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
 * ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 * 9999
 * HINT: Use the switch statement.
 * NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 */
public class JavaProgramme_4_NumberOfDaysInMonth {
    public static void main(String[] args) {

        //Leap year check
        int year;
        Scanner scanner = new Scanner(System.in);//scanner open
        System.out.println("Enter Year");// print yera
        year = scanner.nextInt();//create variable
        System.out.println("is this year a leap year ? " + isLeapYear(year)); // print statment is leap yer or not?

        //days in month check
        int month;
        System.out.println("Enter month"); // enter month
        month = scanner.nextInt(); //assign the value
        System.out.println(getDaysInMonth(month, year)); //print the month and year
    }
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {//checking the input between 1 to 9999
            return false;
        }
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {//recognise leap yer or not
            return true;//returning is leapyear
        } else {
            return false;//returning not leapyear
        }
    }
    public static int getDaysInMonth(int month, int year) {//static method
        if (year < 1 || year > 9999) { // Cheking the value between 1 to 9999
            return -1;
        }
        switch (month) { // calling Switch statement
            case 1:
                System.out.println("January");
                return 31;
            case 2:
                System.out.println("February");
                if (isLeapYear(year) == true) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                System.out.println("March");
                return 31;
            case 4:
                System.out.println("April");
                return 30;
            case 5:
                System.out.println("May");
                return 31;
            case 6:
                System.out.println("June");
                return 30;
            case 7:
                System.out.println("July");
                return 31;
            case 8:
                System.out.println("August");
                return 31;
            case 9:
                System.out.println("September");
                return 30;
            case 10:
                System.out.println("October");
                return 31;
            case 11:
                System.out.println("November");
                return 30;
            case 12:
                System.out.println("December");
                return 31;
            default:
                System.out.println("Invalid Month number");
                return -1;
        }

    }
}

