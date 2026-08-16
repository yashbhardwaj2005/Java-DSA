// #33 ) Search in Rotated Sorted Array :-

// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
// For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.

// MAIN LOGIC :-

///  In a rotated sorted array, one half is always sorted.
///  Find mid and check which half is sorted.
///  If the target lies within the sorted half, search in that half.
///  Otherwise, discard the sorted half and search in the other half.
///  Repeat until the target is found or start > end

// Key rule to remember:

///  Left sorted  → nums[start] <= nums[mid]
///  Right sorted → nums[start] > nums[mid]



package BinarySearch

class LC_33 {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // One half is always sorted
            if (nums[start] <= nums[mid]) {

                // Target lies in sorted left half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                }
                // Target is in the other half
                else {
                    start = mid + 1;
                }

            } else {

                // Right half is sorted
                // Target lies in sorted right half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }
                // Target is in the other half
                else {
                    end = mid - 1;
                }
            }
        }

        // Target doesn't exist
        return -1;
    }
}