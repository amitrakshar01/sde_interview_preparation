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


    

