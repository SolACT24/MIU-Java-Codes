/* Write a function that takes two arguments, an array of integers and a positive, non-zero number n. 
It sums n elements of the array starting at the beginning of the array. If n is greater than the number 
of elements in the array, the function loops back to the beginning of the array and continues summing until 
it has summed n elements. You may assume that the array contains at least one element and that n is greater than 0. 

If you are programming in Java or C#, the function signature is:
    int loopSum(int[] a, int n)
Examples:
If a is 	and n is 	then function returns 
{1, 2, 3} 	    2   	3 (which is a[0] + a[1]) 
{-1, 2, -1} 	7      -1 (which is a[0] + a[1] + a[2] + a[0] + a[1] + a[2] + a[0]) 
{1, 4, 5, 6} 	4 	    16 (which is a[0] + a[1] + a[2] + a[3]) 
{3}	            10	    30 (a[0] + a[0] + a[0] + a[0] + a[0] + a[0] + a[0] + a[0] + a[0] + a[0])
*/
public class LoopSumDemo2 //Perfect answer!
{
    public static void main(String[] args)
    {
        System.out.println(loopSum(new int[] {1, 2, 3}, 2)); //3
        System.out.println(loopSum(new int[] {-1, 2, -1}, 7)); //-1
        System.out.println(loopSum(new int[] {1, 4, 5, 6}, 4)); //16
        System.out.println(loopSum(new int[] {3}, 10)); //30
    }
    static int loopSum(int[] a, int n)
    {
        //if(n <= 0) return 0; //It is given that the array contains at least one element and that n is greater than 0! 
                               //So, it is not necessary to define if n <= 0, and then it should return 0.
        int i = 0, sum = 0;
        while(i < n)
        {
            int j = 0;
            while(j < a.length)
            {
                sum += a[j];
                j++;
                i++;
                if(i == n) break;
            }
        }
        return sum;
    }
}

