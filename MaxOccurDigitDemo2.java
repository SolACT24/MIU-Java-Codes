/* Write a function named maxOccurDigit that returns the digit that occur the most. If there is no such digit, it will return -1. 
For example maxOccurDigit(327277) would return 7 because 7 occurs three times in the number and all other digits occur less than three times.
Other examples:
    maxOccurDigit(33331) returns 3
    maxOccurDigit(32326) returns -1 
    maxOccurDigit(5) returns 5
    maxOccurDigit(-9895) returns 9

The function signature is:
    int maxOccurDigit(int n)
*/
import java.util.Arrays;
public class MaxOccurDigitDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(maxOccurDigit(33331)); //3
        System.out.println(maxOccurDigit(32326)); //-1 (because it has no single mode!)
        System.out.println(maxOccurDigit(5)); //5
        System.out.println(maxOccurDigit(-9895)); //9
        System.out.println(maxOccurDigit(327277)); //7
    }
    static int maxOccurDigit(int n)
    {
        int[] arr = new int[1];

        int count = 0, num = Math.abs(n);
        boolean flag = false;
        while(num != 0)
        {
            if(flag == true)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = num % 10;
            }
            if(count == 0 && flag == false)
            {
                arr[count] = num % 10;
                flag = true;
            }
            num = num / 10;
        }
        //System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[1];
        int maxFreq = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int freq = 0;
            for(int j = 0; j < arr.length; j++)
                if(arr[i] == arr[j]) freq++;
            if(freq > maxFreq)
            {
                maxFreq = freq;
                arr2[0] = arr[i];
            }  
        }
        for(int i = 0; i < arr.length; i++)
        {
            int freq = 0;
            for(int j = 0; j < arr.length; j++)
                if(arr[i] == arr[j]) freq++;
            if(freq == maxFreq && arr2[0] != arr[i]) return -1;  
        }
        return arr2[0];
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