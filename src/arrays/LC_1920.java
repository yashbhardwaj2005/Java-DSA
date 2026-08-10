/*
Problem: 1920. Build Array from Permutation

Approach:
1. Create answer array.
2. Traverse the array.
3. ans[i] = nums[nums[i]]

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class LC_1920 {

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] ans = buildArray(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}