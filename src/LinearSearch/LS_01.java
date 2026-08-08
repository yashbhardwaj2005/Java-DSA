// SEARCH IN ARRAYS :-

package LinearSearch;

public class LS_01 {
    public static void main() {
        int[] arr = {1,4,6,3,7,-3,-6,23,-24};
        int target = -3;
        int result = LinearSearch(arr,target);
        System.out.println(result);
    }
    public static int LinearSearch(int arr[],int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
