/**
 *
 */
package searching_algorithms;

/**
 * @author Anish Kumar
 * This class implements linear search on a integer array.
 *
 * LINEAR SEARCH:
 *
 * In linear search we go through each and every element in an array using a iterator.
 * We check the required number with each array element.
 * If the required number is found we return either a boolean true or false.
 * We can also return the index of the element in the given array.
 */
public class LinearSearch
{
    private static boolean findItem(int[] nums, int find)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == find)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] nums = { 1, 8, 9, 5, 7, 3, 6, 4, 2, 0 };
        int find = 10;
        boolean isPresent = LinearSearch.findItem(nums, find);
        if (isPresent)
        {
            System.out.println("element found");
        }
        else
        {
            System.out.println("element not found");
        }
    }

}
