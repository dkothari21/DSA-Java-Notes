package Day0406;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Examples2 {
    public static void main(String[] args) {
        // Section 1: String Basics
        // Declaration and Initialization
        String str1 = "Hello"; // Using string literal
        String str2 = new String("World"); // Using new keyword
        // Time Complexity: O(1) for string declaration and initialization.
        // Space Complexity: O(n), where n is the length of the string.

        // Concatenation
        String concatenated = str1 + " " + str2; // Using + operator
        System.out.println("Concatenated String: " + concatenated);
        // Time Complexity: O(n) for concatenation, where n is the total length of the strings.
        // Space Complexity: O(n), where n is the length of the concatenated string.

        // Practice Problem 1: Declare two strings and concatenate them with a space in
        // between.

        // Section 2: String Methods
        String sample = "DataStructuresAndAlgorithms";

        // Length of the string
        System.out.println("Length: " + sample.length()); // Returns the number of characters
        // Time Complexity: O(1) for length calculation.
        // Space Complexity: O(1).

        // Substring
        System.out.println("Substring (0, 4): " + sample.substring(0, 4)); // Extracts "Data"
        // Time Complexity: O(k) for substring extraction, where k is the length of the substring.
        // Space Complexity: O(k) for the substring.

        // Equals
        System.out.println("Equals 'DataStructuresAndAlgorithms': " + sample.equals("DataStructuresAndAlgorithms")); // Compares
                                                                                                                     // content
        // Time Complexity: O(n) for equals comparison, where n is the length of the string.
        // Space Complexity: O(1).

        // Index of a character
        System.out.println("Index of 'A': " + sample.indexOf('A')); // Finds the first occurrence of 'A'
        // Time Complexity: O(n) for indexOf, where n is the length of the string.
        // Space Complexity: O(1).

        // Convert to lowercase
        System.out.println("Lowercase: " + sample.toLowerCase()); // Converts to lowercase
        // Time Complexity: O(n) for toLowerCase, where n is the length of the string.
        // Space Complexity: O(n) for the new string.

        // Practice Problem 2: Write a program to check if two strings are anagrams.

        // Section 3: StringBuilder and StringBuffer
        // StringBuilder Example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends " World" to "Hello"
        System.out.println("StringBuilder: " + sb);
        // Time Complexity: O(n) for appending to StringBuilder, where n is the length of the appended string.
        // Space Complexity: O(n) for the StringBuilder.

        // Reverse a string using StringBuilder
        sb.reverse(); // Reverses the string
        System.out.println("Reversed StringBuilder: " + sb);
        // Time Complexity: O(n) for reversing a StringBuilder, where n is the length of the string.
        // Space Complexity: O(1).

        // StringBuffer Example
        StringBuffer sbf = new StringBuffer("DSA");
        sbf.append(" Notes"); // Appends " Notes" to "DSA"
        System.out.println("StringBuffer: " + sbf);
        // Time Complexity: O(n) for appending to StringBuffer, where n is the length of the appended string.
        // Space Complexity: O(n) for the StringBuffer.

        // Practice Problem 3: Reverse a string using StringBuilder or StringBuffer.

        // Tips and Tricks for DSA Problem Solving
        // 1. Use StringBuilder for mutable strings to save memory and improve performance.
        //    - Avoid using String concatenation in loops; use StringBuilder instead for better efficiency.
        // 2. Use .equals() for string comparison instead of ==.
        //    - Always use .equalsIgnoreCase() for case-insensitive comparisons.
        // 3. Use substring and indexOf to parse strings efficiently.
        //    - Validate indices to avoid StringIndexOutOfBoundsException.
        // 4. Convert strings to char arrays for character-level manipulations.
        //    - Use toCharArray() for easy iteration and modification of characters.

        // Tips and Tricks for DSA:
        // 1. Always analyze the time and space complexity of your solution.
        //    - Use Big-O notation to estimate the efficiency of your algorithm.
        // 2. Use HashMaps or HashSets for quick lookups in problems involving duplicates or frequency counts.
        //    - Ensure proper handling of null keys and values in HashMaps.
        // 3. Practice sliding window and two-pointer techniques for array and string problems.
        //    - Use a dynamic window size for problems involving variable-length subarrays.
        // 4. Divide and conquer is a powerful approach for sorting and searching problems.
        //    - Break the problem into smaller sub-problems and combine their solutions.
        // 5. Use dynamic programming for problems with overlapping subproblems and optimal substructure.
        //    - Use a memoization table to store intermediate results and avoid recomputation.
        // 6. Always dry-run your code with edge cases to ensure correctness.
        //    - Test with empty inputs, single elements, and maximum constraints.
        // 7. Use recursion with memoization to optimize solutions for problems with repeated calculations.
        //    - Avoid stack overflow by limiting recursion depth or using iterative solutions.
        // 8. Break down complex problems into smaller sub-problems and solve them step by step.
        //    - Use helper functions to modularize and simplify your code.
        // 9. Use binary search for problems involving sorted arrays or monotonic functions.
        //    - Ensure the array is sorted and handle edge cases like duplicates.
        // 10. Practice writing clean and modular code to make debugging easier.
        //     - Use meaningful variable names and add comments to explain logic.

        // Additional Examples for Patterns in DSA

        // Example 1: Count the frequency of characters in a string
        // Time Complexity: O(n), where n is the length of the string.
        // Space Complexity: O(1) for the frequency array (assuming fixed alphabet size).
        String freqSample = "datastructures";
        int[] freq = new int[26]; // Assuming only lowercase letters
        for (char c : freqSample.toCharArray()) {
            freq[c - 'a']++;
        }
        System.out.println("Character Frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + freq[i]);
            }
        }

        // Example 2: Check if a string is a palindrome
        // Time Complexity: O(n), where n is the length of the string.
        // Space Complexity: O(1).
        String palindromeSample = "madam";
        boolean isPalindrome = true;
        for (int i = 0, j = palindromeSample.length() - 1; i < j; i++, j--) {
            if (palindromeSample.charAt(i) != palindromeSample.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome: " + isPalindrome);

        // Example 3: Find all substrings of a string
        // Time Complexity: O(n^2), where n is the length of the string.
        // Space Complexity: O(1).
        String substringSample = "abc";
        System.out.println("All Substrings:");
        for (int i = 0; i < substringSample.length(); i++) {
            for (int j = i + 1; j <= substringSample.length(); j++) {
                System.out.println(substringSample.substring(i, j));
            }
        }

        // Example 4: Longest Common Prefix among an array of strings
        // Time Complexity: O(n * m), where n is the number of strings and m is the length of the shortest string.
        // Space Complexity: O(1).
        String[] words = { "flower", "flow", "flight" };
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    break;
            }
        }
        System.out.println("Longest Common Prefix: " + prefix);

        // Example 5: Reverse words in a sentence
        // Time Complexity: O(n), where n is the length of the sentence.
        // Space Complexity: O(n) for the reversed sentence.
        String sentence = "Data Structures and Algorithms";
        String[] wordsArray = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            reversedSentence.append(wordsArray[i]).append(" ");
        }
        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());

        // Additional Practice Problems with Solutions

        // Practice Problem 4: Find the maximum element in an array
        int[] array = { 1, 2, 3, 4, 5 };
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum Element: " + max);

        // Practice Problem 5: Check if a string contains only digits
        String digitSample = "12345";
        boolean isNumeric = digitSample.chars().allMatch(Character::isDigit);
        System.out.println("Contains only digits: " + isNumeric);

        // Practice Problem 6: Rotate an array to the right by k steps
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 2;
        int n = nums.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }
        System.out.print("Rotated Array: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Practice Problem 11: Find the second largest element in an array
        int[] array2 = { 10, 20, 4, 45, 99 };
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : array2) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest Element: " + secondLargest);

        // Practice Problem 12: Check if a string is a valid palindrome ignoring case
        // and non-alphanumeric characters
        String palindromeCheck = "A man, a plan, a canal: Panama";
        String filtered = palindromeCheck.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isValidPalindrome = true;
        for (int i = 0, j = filtered.length() - 1; i < j; i++, j--) {
            if (filtered.charAt(i) != filtered.charAt(j)) {
                isValidPalindrome = false;
                break;
            }
        }
        System.out.println("Is Valid Palindrome: " + isValidPalindrome);

        // Practice Problem 13: Find the intersection of two arrays
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        List<Integer> intersection = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (countMap.getOrDefault(num, 0) > 0) {
                intersection.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }
        System.out.println("Intersection: " + intersection);

        // Practice Problem 14: Reverse the vowels in a string
        String reverseVowelsSample = "hello";
        char[] chars = reverseVowelsSample.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (!"aeiouAEIOU".contains(chars[left] + "")) {
                left++;
            } else if (!"aeiouAEIOU".contains(chars[right] + "")) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Reversed Vowels: " + new String(chars));

        // Practice Problem 15: Find the longest common substring between two strings
        String strA = "abcdef";
        String strB = "zcdemf";
        int[][] dp = new int[strA.length() + 1][strB.length() + 1];
        int maxLength = 0;
        String longestSubstring = "";
        for (int i = 1; i <= strA.length(); i++) {
            for (int j = 1; j <= strB.length(); j++) {
                if (strA.charAt(i - 1) == strB.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        longestSubstring = strA.substring(i - maxLength, i);
                    }
                }
            }
        }
        System.out.println("Longest Common Substring: " + longestSubstring);

        // Additional Practice Problems without Solutions

        // Practice Problem 7: Find the first non-repeating character in a string

        // Practice Problem 8: Check if two arrays are equal

        // Practice Problem 9: Find the longest palindrome substring in a string

        // Practice Problem 10: Merge two sorted arrays into one sorted array

        // Practice Problem 16: Find all permutations of a string

        // Practice Problem 17: Find the majority element in an array

        // Practice Problem 18: Check if a string is a rotation of another string

        // Practice Problem 19: Find the smallest missing positive integer in an array

        // Practice Problem 20: Group anagrams from a list of strings
    }
}
