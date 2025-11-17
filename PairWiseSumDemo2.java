/* Write a method named pairwiseSum that has an array with an even number of elements as a parameter and 
returns an array that contains the pairwise sums of the elements of its parameter array. 

If you are writing in Java or C#, the function signature is:
    int[] pairwiseSum(int[] a)

The method returns null if:
    1.	The array has no elements 
    2.	The array has an odd number of elements 
Otherwise, the method returns an array with arrayLength/2 elements. 
Each element of the returned array is the sum of successive pairs of elements of the original array. See examples for more details.
Examples:
if a is	                                return	            reason
{2, 1, 18, -5}	                        {3, 13}	            because 2+1=3, 18+-5=13. Note that there are exactly 2 elements in the returned array. 
                                                            You will lose full marks for this question if you return {3, 13, 0, 0}!
{2, 1, 18, -5, -5, -15, 0, 0, 1, -1}	{3, 13, -20, 0, 0}	because 2+1=3, 18+-5=13, -5+-15=-20, 0+0=0, 1+-1=0. Note that there are exactly 5 elements in the returned array. 
                                                            You will lose full marks for this question if you return {3, 13, -20, 0, 0, 0, 0, 0, 0, 0}!
{2, 1, 18}	                            null	            because there are an odd number of elements in the array.
{}	                                    null	            because there are no elements in the array
*/
import java.util.Arrays;
public class PairWiseSumDemo2 //Perfect Answer!!!!!
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18, -5}))); //{3, 13}
        System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18, -5, -5, -15, 0, 0, 1, -1}))); //{3, 13, -20, 0, 0}
        System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18}))); //null
        System.out.println(Arrays.toString(pairwiseSum(new int[] {}))); //null
    }
    static int[] pairwiseSum(int[] a)
    {
        if(a.length == 0 || a.length % 2 != 0) return null;

        int[] arr = new int[a.length/2];

        int count = 0;
        boolean flag = false;
        for(int i = 0, j = 1; i < a.length && j < a.length; i += 2, j += 2)
        {
            if(flag == true)
            {
                count++;
                arr[count] = a[i] + a[j];
            }
            if(count == 0 && flag == false)
            {
                arr[count] = a[i] + a[j];
                flag = true;
            }
        }
        return arr;
    }
}
