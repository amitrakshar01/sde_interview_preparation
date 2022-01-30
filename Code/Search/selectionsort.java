import javax.sound.sampled.SourceDataLine;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args){
        int[] arr = {4, 3, 1, 2, 5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - i -1;
            int maxIndex = maxindex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static int maxindex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
