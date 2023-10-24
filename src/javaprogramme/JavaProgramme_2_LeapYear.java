package javaprogramme;

/**
 * Write a java program to input any year like (ex.2007) and
 * find out if it is leap year or not?
 */
public class JavaProgramme_2_LeapYear {
    public static void main(String[] args) {//main method
        int year = 2007;// input year
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){//recognise leap yer or not
            System.out.println(year + " is a leap year");// print the statement is a leap yeay
        } else {
            System.out.println(year + " is not a leap year");// print the statement is not a leap year
        }
    }
}