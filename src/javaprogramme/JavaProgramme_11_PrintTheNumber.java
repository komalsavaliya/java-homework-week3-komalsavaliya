package javaprogramme;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class JavaProgramme_11_PrintTheNumber {
    public static void main(String[] args) {
        System.out.println("Number divided by 3");//Print the statement to enter number divided by 3
        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0){ //if statement
                System.out.println(a + " ");
            }
        }
        System.out.println("Number divided by 5");////Print the statement to enter number divided by 3
        for (int a = 1; a <= 100; a++){//if statement
            if (a % 5 == 0){
                System.out.println(a + " ");
            }
        }
    }
}