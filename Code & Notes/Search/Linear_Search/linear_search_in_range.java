public class linear_search_in_range {
    public static void main(String[] args){
        int[] arr = {1,8,12,20,40};
        int start = 1;
        int end = 3;
        int target = 12;
        int index = linearSearchInRange(arr, start, end, target);
        System.out.println(index);

    }

    static int linearSearchInRange(int[] arr, int start, int end, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start; i<=end; i++){
            int a = arr[i];
            if(a == target){
                return i;
            }
        }
        return -1;
    }
    
}
