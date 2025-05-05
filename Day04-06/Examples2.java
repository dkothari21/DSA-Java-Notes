package Day02;

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

        // Concatenation
        String concatenated = str1 + " " + str2; // Using + operator
        System.out.println("Concatenated String: " + concatenated);

        // Practice Problem 1: Declare two strings and concatenate them with a space in
        // between.

        // Section 2: String Methods
        String sample = "DataStructuresAndAlgorithms";

        // Length of the string
        System.out.println("Length: " + sample.length()); // Returns the number of characters

        // Substring
        System.out.println("Substring (0, 4): " + sample.substring(0, 4)); // Extracts "Data"

        // Equals
        System.out.println("Equals 'DataStructuresAndAlgorithms': " + sample.equals("DataStructuresAndAlgorithms")); // Compares
                                                                                                                     // content

        // Index of a character
        System.out.println("Index of 'A': " + sample.indexOf('A')); // Finds the first occurrence of 'A'

        // Convert to lowercase
        System.out.println("Lowercase: " + sample.toLowerCase()); // Converts to lowercase

        // Practice Problem 2: Write a program to check if two strings are anagrams.

        // Section 3: StringBuilder and StringBuffer
        // StringBuilder Example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends " World" to "Hello"
        System.out.println("StringBuilder: " + sb);

        // Reverse a string using StringBuilder
        sb.reverse(); // Reverses the string
        System.out.println("Reversed StringBuilder: " + sb);

        // StringBuffer Example
        StringBuffer sbf = new StringBuffer("DSA");
        sbf.append(" Notes"); // Appends " Notes" to "DSA"
        System.out.println("StringBuffer: " + sbf);

        // Practice Problem 3: Reverse a string using StringBuilder or StringBuffer.

        // Tips and Tricks for DSA Problem Solving
        // 1. Use StringBuilder for mutable strings to save memory and improve
        // performance.
        // 2. Use .equals() for string comparison instead of ==.
        // 3. Use substring and indexOf to parse strings efficiently.
        // 4. Convert strings to char arrays for character-level manipulations.

        // Additional Examples for Patterns in DSA

        // Example 1: Count the frequency of characters in a string
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
        String substringSample = "abc";
        System.out.println("All Substrings:");
        for (int i = 0; i < substringSample.length(); i++) {
            for (int j = i + 1; j <= substringSample.length(); j++) {
                System.out.println(substringSample.substring(i, j));
            }
        }

        // Example 4: Longest Common Prefix among an array of strings
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
        String sentence = "Data Structures and Algorithms";
        String[] wordsArray = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            reversedSentence.append(wordsArray[i]).append(" ");
        }
        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());

        // Additional Practice Problems with Solutions

        // Practice Problem 4: Find the maximum element in an array
        int[] array = {1, 2, 3, 4, 5};
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
        int[] nums = {1, 2, 3, 4, 5};
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
        int[] array2 = {10, 20, 4, 45, 99};
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

        // Practice Problem 12: Check if a string is a valid palindrome ignoring case and non-alphanumeric characters
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
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
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
