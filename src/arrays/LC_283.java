// MOVE ZEROES TO THE END :-


package arrays;

import java.util.Arrays;

public class LC_283 {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        int index = 0;

        // Put non-zero elements at the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(nums));
    }
}