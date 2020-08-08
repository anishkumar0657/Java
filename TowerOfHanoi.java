/**
 *
 */
package algo;

/**
 * @author KumarAn5
 *
 */
public class TowerOfHanoi
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int n = 3;
        TowerOfHanoi.towerOfHanoi(n, 'A', 'B', 'C');
    }

    /**
     * @param n
     * @param c
     * @param d
     * @param e
     */
    private static void towerOfHanoi(int n, char a, char b, char c)
    {
        if (n > 0)
        {
            TowerOfHanoi.towerOfHanoi(n - 1, a, c, b);
            System.out.println("move disc " + n + " from tower => " + a + " to tower => " + c);
            TowerOfHanoi.towerOfHanoi(n - 1, b, a, c);
        }
    }
}
