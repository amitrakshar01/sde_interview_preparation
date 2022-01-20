package Linear_Search;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

//Given an array nums of integers, return how many of them contain an even number of digits.

/*     Input: nums = [12,345,2,6,7896]
       Output: 2        */

public class leetcode_EvenNumbers {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    
    static boolean even(int n){
        int c = 0;
        while(n>0){
            n/=10;
            c++;
        }
        if(c%2 == 0){
            return true;
        }
        return false;
    }
}
