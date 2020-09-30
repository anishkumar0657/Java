/**
 *
 */
package exception_handling;

/**
 * @author KumarAn5
 *
 */
public class GenericExceptionHandling
{

    public static void main(String[] args)
    {
        try
        {
            int b = 0;
            int a = 2;
            int result = a / b;
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception caught");
        }

    }

    public GenericExceptionHandling()
    {
        // TODO Auto-generated constructor stub
    }

}
