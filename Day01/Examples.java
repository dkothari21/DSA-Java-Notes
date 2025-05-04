package Day01;

public class Examples {
    public static void main(String[] args) {
        // Introduction to arrays: declaration and initialization
        // Single-dimensional array
        int[] singleDimArray = { 1, 2, 3, 4, 5 };
        int[] anotherArray = new int[5]; // Array of size 5, default values are 0
        anotherArray[0] = 10; // Updating an element

        // Accessing and updating array elements
        System.out.println("First element: " + singleDimArray[0]);
        singleDimArray[1] = 20; // Update second element
        System.out.println("Updated second element: " + singleDimArray[1]);

        // Using for-each loop
        System.out.println("Array elements using for-each loop:");
        for (int num : singleDimArray) {
            System.out.println(num);
        }

        // Working with multi-dimensional arrays
        int[][] multiDimArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Accessing multi-dimensional array elements:");
        System.out.println("Element at [0][0]: " + multiDimArray[0][0]);
        multiDimArray[1][1] = 50; // Update element at [1][1]
        System.out.println("Updated element at [1][1]: " + multiDimArray[1][1]);

        System.out.println("Multi-dimensional array elements:");
        for (int i = 0; i < multiDimArray.length; i++) {
            for (int j = 0; j < multiDimArray[i].length; j++) {
                System.out.print(multiDimArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multi-dimensional array using for-each loop:");
        for (int[] row : multiDimArray) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // Additional examples for arrays
        // 1. Declaring and initializing arrays of different data types
        String[] stringArray = { "Java", "Python", "C++" };
        double[] doubleArray = { 1.1, 2.2, 3.3 };

        System.out.println("String array elements:");
        for (String str : stringArray) {
            System.out.println(str);
        }

        System.out.println("Double array elements:");
        for (double d : doubleArray) {
            System.out.println(d);
        }

        // 2. Jagged arrays (arrays with rows of different lengths)
        int[][] jaggedArray = {
                { 1, 2 },
                { 3, 4, 5 },
                { 6 }
        };

        System.out.println("Jagged array elements:");
        for (int[] row : jaggedArray) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // 3. Array of objects
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        System.out.println("Array of objects (names):");
        for (String name : names) {
            System.out.println(name);
        }

        // 4. Copying arrays
        int[] originalArray = { 10, 20, 30 };
        int[] copiedArray = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("Copied array elements:");
        for (int num : copiedArray) {
            System.out.println(num);
        }

        // 5. Sorting arrays
        java.util.Arrays.sort(singleDimArray);
        System.out.println("Sorted single-dimensional array:");
        for (int num : singleDimArray) {
            System.out.println(num);
        }

        // 6. Searching in arrays
        int index = java.util.Arrays.binarySearch(singleDimArray, 20);
        System.out.println("Index of 20 in sorted array: " + index);
    }
}