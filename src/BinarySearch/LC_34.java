// #34) Find First and Last Position of Element in Sorted Array :-

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity .

package BinarySearch;

import java.util.Arrays;  //  Used to print the array nicely using Arrays.toString()

public class LC_34 {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;

        int[] result = searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // Find first occurrence
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                ans[0] = mid;

                // Go left to find first occurrence
                end = mid - 1;
            }
        }

        // Find last occurrence
        start = 0;
        end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                ans[1] = mid;

                // Go right to find last occurrence
                start = mid + 1;
            }
        }

        return ans;
    }
}