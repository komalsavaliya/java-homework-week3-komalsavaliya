package javaprogramme;

/**
 * Write a Java program to test if an array contains a specific value.
 *
 */
public class JavaProgramme_20_SpecificValue {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};
        boolean contains;
        System.out.println("Array does not contains value: " + contains(numbers, 50));
        System.out.println("Array contains the value: " + contains(numbers, 90));
        //System.out.println(contains(numbers, 90));
        //System.out.println(contains(numbers, 99));
    }

    public static boolean contains(int[] arrays, int items) {
        boolean contain = false;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == items) {
                contain = true;
                break;
            }
        }
        return contain;
    }
}
