import java.util.Arrays;

public class search_2DArray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                       {12,22,32,42},
                       {14,24,34,44},
                       {16,26,36,46}};
        int target = 34;
        int[] index = search(arr, target);
        System.out.println(Arrays.toString(index));
    }

    static int[] search(int[][] matrix, int target) {

        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[] { row, column };
            }

            if (target > matrix[row][column]) {
                row++;
            } else {
                column--;
            }
        }
        return new int[] {-1,-1};
    }
}
