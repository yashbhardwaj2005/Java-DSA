// #1672) Richest Customer Wealth :-

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
//Return the wealth that the richest customer has.A customer's wealth is the amount of money they have in all their bank accounts.
//The richest customer is the customer with the maximum wealth.

package LinearSearch;

public class LC_1672 {

    public static void main(String[] args) {

        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 3, 6}
        };

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

              int sum = 0;

              for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

               if (sum > maxWealth) {
                   maxWealth = sum;
            }
        }

        System.out.println(maxWealth);
    }
}