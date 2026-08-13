// #852 ) Peak Index in a Mountain Array :-

// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

//Return the index of the peak element.

//Your task is to solve it in O(log(n)) time complexity.

package BinarySearch;

public class LC_852 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Going UP → peak is on the right
                start = mid + 1;
            }
            else {
                // Going DOWN → peak is at mid or on the left
                end = mid;
            }
        }

        return end;
    }
}