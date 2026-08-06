//#leetcode_1572

//Given a square matrix mat, return the sum of the matrix diagonals.
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal
//that are not part of the primary diagonal.

public class LC_1572 {

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {

            // Main Diagonal
            sum += mat[i][i];

            // Secondary Diagonal
            sum += mat[i][n - 1 - i];
        }

        // Remove duplicate center element (only for odd-sized matrix)
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}