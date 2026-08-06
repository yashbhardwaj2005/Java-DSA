//#867)   Given a 2D integer array matrix, return the transpose of matrix.
//        The transpose of a matrix is the matrix flipped over its main diagonal,
//        switching the matrix's row and column indices.

package arrays;
import java.util.Arrays;

public class LC_867 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transpose = transpose(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose Matrix:");
        printMatrix(transpose);
    }

    public static int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] transpose = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                transpose[j][i] = matrix[i][j];

            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}