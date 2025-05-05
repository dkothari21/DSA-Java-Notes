package Day0103;

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

        // Rotating an array to the right by k steps
        int[] arrayToRotate = { 1, 2, 3, 4, 5 };
        int k = 2; // Number of steps to rotate
        int n = arrayToRotate.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = arrayToRotate[i];
        }

        System.out.println("Rotated array:");
        for (int num : rotatedArray) {
            System.out.println(num);
        }

        // Finding the maximum in a subarray of size k
        int[] subarrayExample = { 10, 5, 2, 7, 8, 7 };
        int windowSize = 3;
        System.out.println("Maximum in each subarray of size " + windowSize + ":");
        for (int i = 0; i <= subarrayExample.length - windowSize; i++) {
            int max = subarrayExample[i];
            for (int j = 1; j < windowSize; j++) {
                max = Math.max(max, subarrayExample[i + j]);
            }
            System.out.println(max);
        }

        // Matrix transposition
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed matrix:");
        for (int[] row : transposedMatrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // Matrix multiplication
        int[][] matrixA = {
                { 1, 2 },
                { 3, 4 }
        };
        int[][] matrixB = {
                { 5, 6 },
                { 7, 8 }
        };

        int[][] resultMatrix = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int l = 0; l < matrixB.length; l++) {
                    resultMatrix[i][j] += matrixA[i][l] * matrixB[l][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        for (int[] row : resultMatrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // Tips and Tricks for DSA:
        // 1. Always initialize arrays with proper size to avoid IndexOutOfBoundsException.
        //    - Ensure you know the required size beforehand or use dynamic structures like ArrayList.
        // 2. Use enhanced for-loops for better readability when iterating over arrays.
        //    - Avoid modifying the array inside the loop to prevent unexpected behavior.
        // 3. For multi-dimensional arrays, ensure consistent row sizes unless using jagged arrays.
        //    - Validate the dimensions during initialization to avoid NullPointerException.
        // 4. Use System.arraycopy for efficient array copying.
        //    - Ensure source and destination arrays have compatible sizes to avoid ArrayIndexOutOfBoundsException.
        // 5. Leverage java.util.Arrays for common operations like sorting and searching.
        //    - Use Arrays.sort for sorting and Arrays.binarySearch for efficient searching in sorted arrays.
        // 6. For large datasets, consider using data structures like ArrayList for dynamic sizing.
        //    - Use ArrayList's add() method to dynamically grow the list as needed.
        // 7. When working with matrices, ensure dimensions match for operations like multiplication.
        //    - Validate the number of columns in the first matrix equals the number of rows in the second matrix.
        // 8. Use modular arithmetic for circular array problems (e.g., rotations).
        //    - Use (index + k) % n for right rotations and (index - k + n) % n for left rotations.
        // 9. Optimize nested loops for better performance in multi-dimensional array operations.
        //    - Minimize redundant calculations and use caching where possible.
        // 10. Practice common patterns like sliding window and two-pointer techniques for subarray problems.
        //     - Use a fixed-size window for sliding window problems and maintain two indices for two-pointer problems.
    }
}