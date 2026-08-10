// Running Sum of 1D Array :-
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.

package arrays;

import java.util.Arrays;

public class LC_1480 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        System.out.println(Arrays.toString(nums));
    }
}