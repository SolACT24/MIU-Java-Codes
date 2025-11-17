/* A Daphne array is an array that contains either all odd numbers or all even numbers. 
For example, {2, 4, 2} (only even numbers) and {1, 3, 17, -5} (only odd numbers) are Daphne arrays 
but {3, 2, 5} is not because it contains both odd and even numbers. 
Write a function named isDaphne that returns 1 if its array argument is a Daphne array. Otherwise it returns 0.

If you are programming in Java or C#, the function prototype is:
   int isDaphne(int[] a);
*/
public class DaphneArray2Demo 
{
    public static void main(String[] args)
    {
        System.out.println(isDaphne(new int[] {2, 4, 2}));
        System.out.println(isDaphne(new int[] {1, 3, 17, -5}));
        System.out.println(isDaphne(new int[] {3, 2, 5}));
    }
    static int isDaphne(int[] a)
    {
        boolean even = false, odd = false;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0) even = true;
            if(a[i] % 2 == 1) odd = true;
            if(even == true && odd == true) return 0;
        }
        return 1;
    }
}
