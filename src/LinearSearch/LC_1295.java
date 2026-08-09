// #1295) Find Numbers with Even Number of Digits
//        Given an array nums of integers, return how many of them contain an even number of digits.

package LinearSearch;

public class LC_1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
        System.out.println(digits2(-345678));
    }


    static int findNumbers(int[] nums) {

        int count = 0;

        // Check each number in the array
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not :-

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
            //return numberOfDigits % 2 == 0;   //SHORT RETURN SYNTAX
    }


// 2nd and short method to find no. of digits using Math.log10 (but it fails for 0) :-

//    static int digits2(int num) {
//        if (num < 0) {
//            num = num * -1;
//        }
//        return (int)(Math.log10(num)) + 1;
//    }


    // count number of digits in a number

    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // removes the last digit
        }

        return count;
    }

}