

// https://leetcode.com/problems/richest-customer-wealth/

/*  You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/ 

/*  Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10   */

public class leetcode_RichestCustomerWealth{
    public int maximumWealth(int[][] accounts) {
        int total = customerWealth(accounts);
        return total;
    }
    
    static int customerWealth(int[][] arr){
        int total = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            
            if(sum>total){
                total=sum;
            }
        }
        return total;
    }
}