import java.util.Arrays;

public class binary_search_matrices {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        System.out.println(Arrays.toString(search(arr,3)));
    }

    static int[] binary_search(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(arr[row][mid] == target){
                return new int[] {row, mid};
            }

            if(target > arr[row][mid]){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }

    static int [] search(int[][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;

        if(columns == 0){
            return new int[] {-1,-1};
        }

        if(rows == 1){
            return binary_search(matrix, 0, 0, columns-1, target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = columns/2;

        while(rStart < rEnd-1){
            int rMid = rStart + (rEnd - rStart)/2;

            if(target == matrix[rMid][cMid]){
                return new int[] {rMid,cMid};
            }

            if(target > matrix[rMid][cMid]){
                rStart = rMid;
            }

            else{
                rEnd = rMid;
            }

            //Now only 2rows are left and four conditions or parts

            //general condition
            if(matrix[rStart][cMid] == target){
                return new int[] {rStart,cMid};
            }

            if(matrix[rStart + 1][cMid] == target){
                return new int[] {rStart+1,cMid};
            }

            //Part I
            if(target < matrix[rStart][cMid]){
                return binary_search(matrix, rStart, 0, cMid - 1, target);
            }

            if(target > matrix[rStart][cMid] && target <= matrix[rStart][columns-1]){
                return binary_search(matrix, rStart, cMid + 1, columns-1, target);
            }

            if(target < matrix[rStart+1][cMid]){
                return binary_search(matrix, rStart+1, 0, cMid-1, target);
            }
            
            else{
                return binary_search(matrix, rStart+1, cMid+1, columns-1, target);
            }
        }
        return new int[] {-1,-1};
    }
}
