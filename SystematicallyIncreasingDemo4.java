/* An array is called systematically increasing if it consists of increasing sequences of the numbers from 1 to n. 
The first six (there are over 65,000 of them) systematically increasing arrays are:
	{1}
	{1, 1, 2}
	{1, 1, 2, 1, 2, 3}
	{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
	{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}
	{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}
Write a function named isSystematicallyIncreasing which returns 1 if its array argument is systematically increasing. Otherwise it returns 0. 

If you are programming in Java or C#, the function signature is:
    int isSystematicallyIncreasing(int[] a)

Examples:
a is 	then function returns 	reason 
{1}                 	1	    because 1 is a sequence from 1 to 1 and is the only sequence.
{1, 2, 1, 2, 3}     	0	    because it is missing the sequence from 1 to 1.
{1, 1, 3}	            0	    because {1, 3} is not a sequence from 1 to n for any n.
{1, 2, 1, 2, 1, 2}  	0	    because it contains more than one sequence from 1 to 2.
{1, 2, 3, 1, 2, 1}	    0	    because it is "backwards", i.e., the sequences from 1 to n are not ordered by increasing value of n
{1, 1, 2, 3}	        0	    because the sequence {1, 2} is missing (it should precede {1, 2, 3})
*/
import java.util.Arrays;
public class SystematicallyIncreasingDemo4 //Perfect Answer!!!
{
    public static void main(String[] args)
    { 
        System.out.println(isSystematicallyIncreasing(new int[] {1})); //1
        System.out.println(isSystematicallyIncreasing(new int[] {1, 2, 1, 2, 3})); //0
        System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 3})); //0
        System.out.println(isSystematicallyIncreasing(new int[] {1, 2, 1, 2, 1, 2})); //0
        System.out.println(isSystematicallyIncreasing(new int[] {1, 2, 3, 1, 2, 1})); //0
        System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 3})); //0
        System.out.println();
        System.out.println(isSystematicallyIncreasing(new int[] {1})); //1
        System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2})); //1
        System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3})); //1 
        System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4})); //1 
        System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5})); //1 
        System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6})); //1
    }
    static int isSystematicallyIncreasing(int[] a)
    {
        int sum = 0, start = 0, add = 1;
        while(true)
        {
            sum = start + add;
            if(sum >= a.length) break;
            start = sum;
            add++;
        }
        if(sum != a.length) return 0;

        int[] arr = new int[1];
        arr[0] = 1;

        int count = 0, loop = 2;
        while(arr.length < a.length)
        {   
            int j = 1;
            while(j <= loop)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = j;
                j++;
            }
            loop++;
        }
        //System.out.println(Arrays.toString(arr));

        for(int i = 0, j = 0; i < a.length && j < arr.length; i++, j++)
            if(a[i] != arr[j]) return 0;

        return 1;
    }
    static int[] arraySizeGrow(int[] arr)
    {
        int[] temp = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}