/* Define an array to be packed if all its values are positive, each value n appears n times and all equal values are in CONSECUTIVE LOCATIONS. 
So for example, {2, 2, 3, 3, 3} is packed because 2 appears twice and 3 appears three times. But {2, 3, 2, 3, 3} is not packed because the 2s are 
not in consecutive locations. And {2, 2, 2, 3, 3, 3} is not packed because 2 appears three times. 

Write a method named isPacked that returns 1 if its array argument is packed, otherwise it returns 0. You may assume that the array is not null. 
If you are programming in Java or C#, the function signature is:
    int isPacked(int[] a) 
Examples:
a is 	        then function returns 	reason 
{2, 2, 1}	                    1	    because there are two 2s and one 1 and equal values appear in consecutive locations.
{2, 2, 1, 2, 2}	                0	    Because there are four 2s (doesn't matter that they are in groups of 2)
{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}	1	    because 4 occurs four times, 3 appears three times, 2 appears two times and 1 appears once and equal values are in consecutive locations.
{7, 7, 7, 7, 7, 7, 7, 1}	    1	    because 7 occurs seven times and 1 occurs once.
{7, 7, 7, 7, 1, 7, 7, 7}	    0	    because the 7s are not in consecutive locations.
{7, 7, 7, 7, 7, 7, 7}	        1	    because 7 occurs seven times
{}	                            1	    because there is no value that appears the wrong number of times
{1, 2, 1}	                    0	    because there are too many 1s
{2, 1, 1}	                    0	    because there are too many 1s
{-3, -3, -3}	                0	    because not all values are positive
{0, 2, 2}	                    0	    because 0 occurs one time, not zero times.
{2, 1, 2}	                    0	    because the 2s are not in consecutive locations
*/
import java.util.Arrays;
public class PackedDemo4
{
    public static void main(String[] args)
    {
        System.out.println(isPacked(new int[] {2, 2, 1})); //1
        System.out.println(isPacked(new int[] {2, 2, 1, 2, 2})); //0        
        System.out.println(isPacked(new int[] {4, 4, 4, 4, 1, 2, 2, 3, 3, 3})); //1
        System.out.println(isPacked(new int[] {7, 7, 7, 7, 7, 7, 7, 1})); //1
        System.out.println(isPacked(new int[] {7, 7, 7, 7, 1, 7, 7, 7})); //0
        System.out.println(isPacked(new int[] {7, 7, 7, 7, 7, 7, 7})); //1
        System.out.println(isPacked(new int[] {})); //1
        System.out.println(isPacked(new int[] {1, 2, 1})); //0
        System.out.println(isPacked(new int[] {2, 1, 1})); //0
        System.out.println(isPacked(new int[] {-3, -3, -3})); //0
        System.out.println(isPacked(new int[] {0, 2, 2})); //0
        System.out.println(isPacked(new int[] {2, 1, 2})); //0

        System.out.println(isPacked(new int[] {2, 2, 3, 3, 3})); //1
        System.out.println(isPacked(new int[] {2, 2, 3, 3})); //0        
    }
    static int isPacked(int[] a)
    {
        if(a.length == 0) return 1;

        int[] arr = new int[1];

        int count = 0;
        boolean flag = false;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] <= 0) return 0;

            int freq = 0;
            for(int j = 0; j < a.length; j++)
                if(a[i] == a[j]) freq++;
            if(freq != a[i]) return 0;

            if(flag == true && arr[arr.length-1] != a[i]) //Here is the point!!!!
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
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
                if(arr[i] == arr[j]) return 0;
        }
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
