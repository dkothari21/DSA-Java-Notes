package Day01;

public class Examples {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Access elements in the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modify an element in the array
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // Loop through the array using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Loop through the array using a for-each loop
        System.out.println("Array elements (using for-each):");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Find the length of the array
        System.out.println("Length of the array: " + numbers.length);
    }
}