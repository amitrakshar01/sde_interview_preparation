import java.util.Arrays;

public class linear_search_in_2D_arrays {
    public static void main(String[] args){
        int arr[][] = {{8,12,26,40},
                      {2,3,5,9},
                      {1,4,6}};
        int target = 2;
        int[] index = search(arr,target);
        System.out.println(Arrays.toString(index));

    }

    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
            
        }
        return new int[] {-1,-1};


    }
    
}
