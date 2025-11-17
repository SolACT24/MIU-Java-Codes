/* Write a function named largestDifferenceOfEvens which returns the largest difference between even valued elements 
of its array argument. For example, largestDifferenceOfEvens(new int[] {-2, 3, 4, 9}) returns 6 = (4 - (-2)). 
If there are fewer than 2 even numbers in the array, largestDifferenceOfEvens should return -1.

If you are programming in Java or C#, the function signature is:
    int largestDifferenceOfEvens(int[] a)
*/
import java.util.Arrays;
public class LargestDifferenceOfEvensDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(largestDifferenceOfEvens(new int[] {1, 3, 5, 9})); //-1
        System.out.println(largestDifferenceOfEvens(new int[] {1, 18, 5, 7, 33})); //-1
        System.out.println(largestDifferenceOfEvens(new int[] {2, 2, 2, 2})); //0
        System.out.println(largestDifferenceOfEvens(new int[] {1, 2, 1, 2, 1, 4, 1, 6, 4})); //6 - 2 = 4
        System.out.println(largestDifferenceOfEvens(new int[] {-2, 3, 4, 9})); //4 - (-2) = 6
    }
    static int largestDifferenceOfEvens(int[] a)
    {
       int numOfEvens = 0, maxEvensDiff = Integer.MIN_VALUE;

       for(int i = 0; i < a.length; i++)
            if(a[i] % 2 == 0) numOfEvens++;
        
       if(numOfEvens < 2) return -1;
       else
       {
           for(int i = 0; i < a.length; i++)
           {
               for(int j = 0; j < a.length; j++)
                    if(a[i] % 2 == 0 && a[j] % 2 == 0 && maxEvensDiff < a[i] - a[j]) maxEvensDiff = a[i] - a[j];    
           }
       }
       return maxEvensDiff;
    }
}