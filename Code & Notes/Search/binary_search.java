package Search;

public class binary_search {

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,15,22,40,48};
        int target = 8;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                end = mid - 1;
            }
        }
        return -1;
    }
}