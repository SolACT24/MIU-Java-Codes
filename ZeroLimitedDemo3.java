/* An array, a, is called zero-limited if the following two conditions hold:
    i.  a[3*n+1] is 0 for n>=0 where 3*n+1 is less than the number of elements in the array.
    ii. if i != 3*n+1 for some n, then a[i] does not equal 0 
For example, {1, 0, 5, -1, 0, 2, 3, 0, 8} is zero-limited because a[3*0+1] = 0, a[3*1+1] = 0 and a[3*2+1] = 0 and all other elements are non-zero.

Write a function named isZeroLimited that returns 1 if its array argument is zero-limited, else it returns 0. 

If you are programming in Java or C#, the function signature is:
   int isZeroLimited(int[] a)   
*/
import java.util.Arrays;
public class ZeroLimitedDemo3 //Perfect and short Answer!!!!!!!!!
{
    public static void main(String[] args)
    {
        System.out.println(isZeroLimited(new int[] {1, 0, 5, -1, 0, 2, 3, 0, 8})); //1
        System.out.println(isZeroLimited(new int[] {1, 0, 5, -1, 0, 2, 3, 0, 0, 9, 10})); //0
        System.out.println(isZeroLimited(new int[] {1, 0, 5, -1, 0, 2, 3, 0, 0, 9, 0})); //0
    }
    static int isZeroLimited(int[] a)
    { 
        for(int i = 0; i < a.length; i++)
        {
            int n = 0, prod = 1;
            while(true)
            {
                prod = 3 * n + 1;
                if(prod >= i) break;
                n++;
            }
            if(prod == i && a[i] != 0 || prod != i && a[i] == 0) return 0;
        }
        return 1;
    }
}
