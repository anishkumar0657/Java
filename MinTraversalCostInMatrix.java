/**
 *
 */
package algo;

/**
 * @author Anish Kumar
 *
 */
public class MinTraversalCostInMatrix
{

    public static int findMinPath(int[][] matrix)
    {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int minCost = 0;
        int[][] temp = new int[rows][columns];

        for (int i = 1; i < columns; i++)
        {
            matrix[0][i] += matrix[0][i - 1];
        }

        for (int i = 1; i < rows; i++)
        {
            matrix[i][0] += matrix[i - 1][0];
        }

        //loop through to find the min cost of traveling from top left to bottom right element
        for (int i = 1; i < rows; i++)
        {
            for (int j = 1; j < columns; j++)
            {
                matrix[i][j] += MinTraversalCostInMatrix.min(matrix[i][j - 1], matrix[i - 1][j]);
            }
        }

        return matrix[rows - 1][columns - 1];
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[][] matrix = { { 1, 3, 5, 8 }, { 4, 2, 1, 7 }, { 4, 3, 2, 3 } };
        System.out.println(MinTraversalCostInMatrix.findMinPath(matrix));
    }

    /**
     * @param i
     * @param j
     * @return
     */
    private static int min(int num1, int num2)
    {
        return num1 < num2 ? num1 : num2;
    }

}
