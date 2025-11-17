/* Write a function to return an array containing all elements common to two given arrays containing distinct positive integers. 
You should not use any inbuilt methods. You are allowed to use any number of arrays.

The signature of the function is:
    int[] f(int[] first, int[] second)
*/
import java.util.Arrays;
public class CommonDistinctEltsDemo
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(f(new int[] {1,8,3,2}, new int[] {4,2,6,1}))); //{1,2}
        System.out.println(Arrays.toString(f(new int[] {1,8,3,2,6}, new int[] {2,6,1}))); //{1,2,6}
        System.out.println(Arrays.toString(f(new int[] {1,3,7,9}, new int[] {7,1,9,3}))); //{1,3,7,9}
        System.out.println(Arrays.toString(f(new int[] {1,2}, new int[] {3,4}))); //{}
        System.out.println(Arrays.toString(f(new int[] {}, new int[] {1,2,3}))); //{}
        System.out.println(Arrays.toString(f(new int[] {1,2}, new int[] {}))); //{}
        System.out.println(Arrays.toString(f(new int[] {1,2}, null))); //null
        System.out.println(Arrays.toString(f(null, new int[] {}))); //null
        System.out.println(Arrays.toString(f(null, null))); //null
    }
    static int[] f(int[] first, int[] second) 
    {
        int[] output = {};
        if(first == output || second == output) return output;
        if(first == null || second == null) return null;

        int[] arr = new int[1];

        int count = 0;
        boolean flag = false;
        for(int i = 0; i < first.length; i++)
        {
            if(flag == true && findNum(second, first[i]) == true) 
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = first[i];
            }
            if(count == 0 && findNum(second, first[i]) == true) //This line of code SHOULD come after the flag is true!
            {
                arr[count] = first[i];
                flag = true;
            }
        }
        if(flag == false) return output;
        else return arr;
    }
    static boolean findNum(int[] second, int firstNum)
    {
        for(int i = 0; i < second.length; i++)
            if(second[i] == firstNum) return true;

        return false;
    }
    // To increase the size of the array bynamically by 1.
    static int[] arraySizeGrow(int[] arr)
    {
        int[] temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}
