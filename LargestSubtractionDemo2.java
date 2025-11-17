/* Write a function that takes an array of integers as an argument and returns the largest subtraction among the elements of array.
Note: check each elements of array.

The signature of the function is:
    int fun6(int[] array)
Examples:
If input number is              return
{1, 2, 5, 6, 4}                 5
{12, 54, 8, 3, 41}              51
{}                              -1
{45}                            -1
*/
public class LargestSubtractionDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(fun6(new int[] {1,2,5,6,4})); //5
        System.out.println(fun6(new int[] {12,54,8,3,41})); //51
        System.out.println(fun6(new int[] {})); //-1
        System.out.println(fun6(new int[] {45})); //-1
    }
    static int fun6(int[] a)
    {
        if(a.length < 2) return -1;

        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(maxVal < a[i]) maxVal = a[i];
            if(minVal > a[i]) minVal = a[i];
        }
        return maxVal - minVal;
    }
}
