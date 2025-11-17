/* Write a function to remove duplicates from a given array of integers. Function signature:
    int[] f(int[] a)

Examples:
If input array is           return
{1,2,3,4,5,6,7}             {1,2,3,4,5,6,7}
{1,2,1,3,4,2,5}             {1,2,3,4,5}
{12,32,1,3,6,2,12,3,1,2}    {12,32,1,3,6,2}
*/
import java.util.Arrays;
class DuplicatesRemovalDemo2 //Perfect Answer
{
    public static void main(String args[])
    {
        System.out.println(Arrays.toString(f(new int[] {1,2,3,4,5,6,7})));
        System.out.println(Arrays.toString(f(new int[] {1,2,1,3,4,2,5})));
        System.out.println(Arrays.toString(f(new int[] {12,32,1,3,6,2,12,3,1,2})));
        
        System.out.println(Arrays.toString(f(new int[] {})));
        System.out.println(Arrays.toString(f(null)));
    }
    static int[] f(int[] a)
    {
        int[] output = {}; //This must be first
        if(a == null) return null; //This must be second
        if(a.length == 0 || a == null) return output; // And this must be third. Here the sequence line of codes is very important!
                
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
            if(count == 0 && findNum(arr, a[i]) == false)
            {
                arr[count] = a[i];
                flag = true;
            }
        }
        return arr;
    }
    static int[] arraySizeGrow(int[] arr)
    {
        int[] temp = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;
        return arr;
    }
    static boolean findNum(int[] arr, int n)
    {
        for(int i = 0; i < arr.length; i++)
            if(n == arr[i]) return true;
        return false;
    }
}

