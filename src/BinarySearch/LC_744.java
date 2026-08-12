// #744)Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.:-

//You are given an array of characters [letters] that is sorted in non-decreasing order, and a character [target].
//There are at least two different characters in letters.

//Return the smallest character in letters that is lexicographically greater than target.
//If such a character does not exist, return the first character in letters.


package BinarySearch;

public class LC_744 {

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        // Call the function and print the answer
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        // Continue searching while a valid search range exists
        while (start <= end) {

            // Find the middle element
            int mid = start + (end - start) / 2;

            // If middle letter is greater than target,
            // it could be our answer, so search on the left
            if (target < letters[mid]) {
                end = mid - 1;
            }

            // If middle letter is equal to or smaller than target,
            // it cannot be the answer, so search on the right
            else {
                start = mid + 1;
            }
        }


        // If start reaches the end of the array,
        // wrap around and return the first letter.
        // % (modulo) makes the index wrap around:
        // 3 % 3 = 0
        // 4 % 3 = 1
        // 5 % 3 = 2

        return letters[start % letters.length];  // can also use simple if
    }
}