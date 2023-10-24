package javaprogramme;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class JavaProgramme_19_calculateTheAvg {
    public static void main(String[] args) {
        int numbers[]  ={10,20,30,40,50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length; //Calculate the average
        System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum of elements " + sum);
        System.out.println("Average of elements " + average);
    }
}
