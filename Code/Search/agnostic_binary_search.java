public class agnostic_binary_search {
    public static void main(String[] args){
        int[] arr = {43,40,22,18,9,3};
        int target = 40;
        int index = agnosticBinarySearch(arr, target);
        System.out.println(index);
    }

    static int agnosticBinarySearch(int[] arr, int target){
        
        int start = 0;
        int end = arr.length - 1;

        boolean asc = arr[start] < arr[end];
        
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }

            if(asc){
                if(target > arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}

    // static void agnosticBinarySearch(int[] arr, int target){
    //     boolean flag = arr[0] < arr[arr.length-1];
    //     if (flag){
            
    //         System.out.println(ascending(arr, target));
    //     }
    //     else{
            
    //         System.out.println(descending(arr, target));
    //     }

    // }

    // static int ascending(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while(start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (arr[mid] == target) {
    //             return mid;
    //         } else if (target > arr[mid]) {
    //             start = mid + 1;
    //         } else {
    //             // ans found
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }

    // static int descending(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while(start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (arr[mid] == target) {
    //             return mid;
    //         } else if (target > arr[mid]) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
                
    //         }
    //     }
    //     return -1;
    // }
    


// }

// public class agnostic_binary_search {
//     public static void main(String[] args) {
// //        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//         int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
//         int target = 22;
//         int ans = orderAgnosticBS(arr, target);
//         System.out.println(ans);
//     }

//     static int orderAgnosticBS(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         // find whether the array is sorted in ascending or descending
//         boolean isAsc = arr[start] < arr[end];

//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             if (isAsc) {
//                 if (target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } else {
//                 if (target > arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }

    

