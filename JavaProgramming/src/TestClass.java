/**
 *
 */

/**
 * @author KumarAn5
 *
 */

import java.io.IOException;

public class TestClass
{
    public static int findXor(String num)
    {
        int len = num.length();
        int val = Integer.parseInt(num);
        int res = 0;
        while (val > 0)
        {
            res = res ^ (val % 10);
            val = val / 10;
        }
        return res;
    }

    public static boolean isDivisible(String num, int k)
    {
        int val = Integer.parseInt(num);
        return (val % k == 0);
    }

    static String largest_sol(int N, int K, String S)
    {
        // Write your code here
        String res = "";
        int max = 0;
        for (int i = 2; i < N; i++)
        {
            String xor = S.substring(0, i);
            String rem = S.substring(i);
            if (TestClass.findXor(xor) > max && TestClass.isDivisible(rem, K))
            {
                res = rem;
                max = TestClass.findXor(xor);
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException
    {
        int N = 6;
        int K = 2;
        String S = "611234";
        String out_ = TestClass.largest_sol(N, K, S);
        System.out.println(out_);
    }
}
