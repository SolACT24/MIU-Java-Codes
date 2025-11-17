/* An array is called zero-balanced if its elements sum to 0 and for each positive element n, there exists another element that is the negative of n. 

Write a function named isZeroBalanced that returns 1 if its argument is a zero-balanced array. Otherwise it returns 0.

If you are writing in Java or C#, the function signature is:
    int isZeroBalanced(int[] a)

Examples: 
if a is	                return
{1, 2, -2, -1}	        1 because elements sum to 0 and each positive element has a corresponding negative element.
{-3, 1, 2, -2, -1, 3}	1 because elements sum to 0 and each positive element has a corresponding negative element.
{3, 4, -2, -3, -2}	    0 because even though this sums to 0, there is no element whose value is -4
{0, 0, 0, 0, 0, 0}	    1 this is true vacuously; 0 is not a positive number
{3, -3, -3}	            0 because it doesn't sum to 0. (Be sure your function handles this array correctly)
{3}	                    0 because this doesn't sum to 0
{}	                    0 because it doesn't sum to 0
*/
public class ZeroBalancedDemo2 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(isZeroBalanced(new int[] {1, 2, -2, -1})); //1
        System.out.println(isZeroBalanced(new int[] {-3, 1, 2, -2, -1, 3})); //1
        System.out.println(isZeroBalanced(new int[] {3, 4, -2, -3, -2})); //0
        System.out.println(isZeroBalanced(new int[] {0, 0, 0, 0, 0, 0})); //1
        System.out.println(isZeroBalanced(new int[] {3, -3, -3})); //0
        System.out.println(isZeroBalanced(new int[] {3})); //0
        System.out.println(isZeroBalanced(new int[] {})); //0
        //System.out.println(isZeroBalanced(null)); //0
    }
    static int isZeroBalanced(int[] a)
    {
        if(a == null || a.length == 0) return 0;

        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
            boolean flag = false;
            for(int j = 0; j < a.length; j++)
                if(a[i] == -(a[j])) flag = true;
            if(flag == false) return 0;
        }
        if(sum != 0) return 0;

        return 1;
    }
}

