/* Define an array to be trivalent if all its elements are one of three different values. 
For example, {22, 19, 10, 10, 19, 22, 22, 10} is trivalent because all elements are either 10, 22, or 19. 
However, the array {1, 2, 2, 2, 2, 2, 2} is not trivalent because it contains only two different values (1, 2). 
The array {2, 2, 3, 3, 3, 3, 2, 41, 65} is not trivalent because it contains four different values (2, 3, 41, 65). 

Write a function named isTrivalent that returns 1 if its array argument is trivalent, otherwise it returns 0.

If you are writing in Java or C#, the function signature is:
   int isTrivalent (int[] a)

Hint: Remember that the elements of the array can be any value, so be careful how you initialize your local variables! 
For example using -1 to initialize a variable won’t work because -1 might be one of the values in the array.

Examples:
if a is 	                        return 	Reason
{-1, 0, 1, 0, 0, 0}	                1	    All elements have one of three values (0, -1, 1)
{}	                                0	    There are no elements
{2147483647, -1, -1, -2147483648}	1	    Again only three different values. Note that the value of a[0] is the maximum integer and 
                                            the value of a[3] is the minimum integer so you can’t use those to initialize local variables.
*/
import java.util.Arrays;
public class TrivalentDemo3
{
    public static void main(String[] args)
    {
        System.out.println(isTrivalent(new int[] {-1,0,1,0,0,0})); //1
        System.out.println(isTrivalent(new int[] {})); //0
        System.out.println(isTrivalent(new int[] {2147483647,1,-1,2147483647})); //1

        System.out.println(isTrivalent(new int[] {22,19,10,10,19,22,22,10})); //1
        System.out.println(isTrivalent(new int[] {1,2,2,2,2,2,2})); //0
        System.out.println(isTrivalent(new int[] {2,2,3,3,3,3,2,41,65})); //0
    }
    static int isTrivalent(int[] a)
    {
        int[] arr = new int[1];

        int count = 0; boolean flag = false;
        for(int i = 0; i < a.length; i++)
        {
            if(flag == true && findNum(arr, a[i]) == false)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = a[i];
            }
            if(count == 0 && flag == false)
            {
                arr[count] = a[i];
                flag = true;
            }
        }
        //System.out.println(Arrays.toString(arr));
        if(arr.length == 3) return 1;

        return 0;
    }
    static boolean findNum(int[] arr, int n)
    {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == n) return true;
        return false;
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
