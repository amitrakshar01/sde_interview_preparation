import java.util.*;

public class linear_search{
    public static void main(String[] args){
        int[] n = {1,8,12,20,40};
        int index = linearSearch(n,12);
        System.out.println(index);

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            int a = arr[i];
            if(a == target){
                return i;
            }
        }
        return -1;
    }
}