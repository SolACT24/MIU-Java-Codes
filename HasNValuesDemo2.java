/* Write a function named hasNValues which takes an array and an integer n as arguments. 
It returns 1 if all the elements of the array are one of n different values, otherwise 0; 

If you are writing in Java or C#, the function signature is:
    int hasNValues(int[] a, int n)

Note that an array argument is passed by reference so that any change you make to the array in your function will be visible when the function returns. 
Therefore, you must not modify the array in your function! In other words, your function should have no side effects.
Examples:
if a is	                            if n is	    return
{1, 2, 2, 1}	                    2	        1 (because there are 2 different element values, 1 and 2)
{1, 1, 1, 8, 1, 1, 1, 3, 3}	        3	        1 (because there are 3 different element values, 1, 3, 8)
{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}	    10	        1 (because there are 10 different element values)
{1, 2, 2, 1}	                    3	        0 (because there are 2 different element values, not 3 as required)
{1, 1, 1, 8, 1, 1, 1, 3, 3}	        2	        0 (because there are 3 different element values, not 2 as required)
{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}	    20	        0 (because there are 10 different element values, not 20 as required)

Hint: There are many ways to solve this problem. One way is to allocate an array of n integers and add each unique element found in the array parameter to it. 
If you add n elements to the array, return 1, otherwise return 0. 
*/
import java.util.Arrays;
public class HasNValuesDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(hasNValues(new int[] {1, 2, 2, 1}, 2)); //0
        System.out.println(hasNValues(new int[] {1, 1, 1, 8, 1, 1, 1, 3, 3}, 3)); //1
        System.out.println(hasNValues(new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10)); //1
        System.out.println(hasNValues(new int[] {1, 2, 2, 1}, 3)); //0
        System.out.println(hasNValues(new int[] {1, 1, 1, 8, 1, 1, 1, 3, 3}, 2)); //0
        System.out.println(hasNValues(new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20)); //0
    }
    static int hasNValues(int[] a, int n)
    {
        int[] arr = new int[1];

        int count = 0;
        boolean flag = false;
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
        if(arr.length == n) return 1;

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

