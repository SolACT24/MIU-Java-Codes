/* It is a fact that there exist two numbers x and y such that  x! + y! = 10!. 

Write a method named solve10 that returns the values x and y in an array.

The notation n! is called n factorial and is equal to n * n-1 * n-2 * ... 2 * 1, e.g.,  5! = 5*4*3*2*1 = 120.

If you are programming in Java or C#, the function prototype is:
   int[] solve10() where the length of the returned array is 2.

Please be sure that the method solve10 returns an array, a, with two elements where a[0] == x, a[1] == y and x! + y! = 10!.
*/
import java.util.Arrays;
public class Solve10Demo2 
{
    public static void main(String[] args)
    {  
        System.out.println(Arrays.toString(solve10()));
    }
    static int[] solve10()
    {
        int[] solve10 = new int[2];

        int tenFactorial = 1, x = 0, y = 0;
        Boolean factorialFound = false;
        for(int i = 1; i <= 10; i++)
            tenFactorial = tenFactorial * i;
        
        for(x = 0; x < 10; x++)
        {
            int xFactorial = 1;
            if (x > 0)
            {
                for (int i = 1; i <= x; i++)
                    xFactorial = xFactorial * i;    
            }
            for (y = 0; y < 10; y++)
            {
                int yFactorial = 1;
                if (y > 0)
                {
                    for (int j = 1; j <= y; j++)
                        yFactorial = yFactorial * j;   
                }
                if (xFactorial + yFactorial == tenFactorial)
                {
                    factorialFound = true;
                    break;
                }
            }
            if(factorialFound) break;   
        }
        if(x == 10 && y == 10) //Not Found
        {
            x = 0;
            y = 0;
        }
        solve10[0] = x;
        solve10[1] = y;
        
        return solve10;
    }
}
