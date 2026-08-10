package BinarySearch;

public class BS_01 {
    static void main() {
        int arr[] = {-1, -3, -9, 0, 3, 6, 8, 9, 23, 45};
        int ans = BinarySearch(arr, 23);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist :-

    static int BinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

//          int mid = start + end / 2;      // might be possible that start + end exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

}
