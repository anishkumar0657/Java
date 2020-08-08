/**
 *
 */
package algo;

/**
 * @author KumarAn5
 *
 */
public class MinTravelCostInMatrixUsingRecursion
{
    /**
     * @param matrix : the matrix with elements
     * @return the minimum cost of traveling the matrix from first to last element
     */
    public static int findMinPath(int[][] matrix)
    {
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;

        return MinTravelCostInMatrixUsingRecursion.minPath(matrix, rows, columns, 0, 0);
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[][] matrix = { { 1, 3, 5, 8 }, { 4, 2, 1, 7 }, { 4, 3, 2, 3 } };
        System.out.println(MinTravelCostInMatrixUsingRecursion.findMinPath(matrix));
    }

    /**
     * @param num1 - first number
     * @param num2 - second number
     * @return the minimum of these two numbers
     */
    private static int min(int num1, int num2)
    {
        return num1 < num2 ? num1 : num2;
    }

    /**
     * @param matrix
     * @param i : row index
     * @param j : column index
     * @param rows : row count
     * @param columns : column count
     * @return the min cost of travelling
     */
    private static int minPath(int[][] matrix, int rows, int col, int i, int j)
    {
        if (i > rows || j > col)
        {
            return 9999;
        }

        if (i == rows && j == col)
        {
            return matrix[i][j];
        }

        int a = MinTravelCostInMatrixUsingRecursion.minPath(matrix, rows, col, i + 1, j);
        int b = MinTravelCostInMatrixUsingRecursion.minPath(matrix, rows, col, i, j + 1);

        return matrix[i][j] + MinTravelCostInMatrixUsingRecursion.min(a, b);
    }
}
