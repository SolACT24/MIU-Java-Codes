/* Write a function that accepts a character array, a zero-based start position and a length. It should return a character array.

The function should do error checking on the start position and the length and return null if the either value is not legal.

The function signature is:
    char[] func(char[] a, int start, int len)
Examples:
*/
import java.util.Arrays;
public class CharArrayDemo2
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 0, 4))); //null
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 0, 3))); //{'a','b','c'}
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 0, 2))); //{'a','b'}
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 0, 1))); //{'a'}
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 1, 3))); //null
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 1, 2))); //{'b','c'}
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 1, 1))); //{'b'}
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 2, 2))); //null
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 2, 1))); //{'c'}
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 3, 1))); //null
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, 1, 0))); //{}
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, -1, 2))); //null
        System.out.println(Arrays.toString(func(new char[] {'a','b','c'}, -1, -2))); //null
        System.out.println(Arrays.toString(func(new char[] {}, 0, 1))); //null
    }
    static char[] func(char[] a, int start, int len)
    {
        char[] output = {};
        if(len == 0) return output;

        if(a.length == 0 || a.length-start < len || start < 0 || len < 0) return null;

        char[] arr = new char[1];

        int count = 0, countLen = 0;
        boolean flag = false;
        while(countLen < len)
        {
            if(flag == true)
            {
                count++;
                start++;
                arr = arraySizeGrow(arr);
                arr[count] = a[start];
                countLen++;
            }
            if(count == 0 && flag == false)
            {
                arr[count] = a[start];
                countLen++;
                flag = true;
            }
        }
        return arr;
    }
    static char[] arraySizeGrow(char[] arr)
    {
        char[] temp = new char[arr.length+1];

        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}