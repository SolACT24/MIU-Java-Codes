/* Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers between m and n inclusive. 
Furthermore, the array must be in ascending order and contain only those integers. 

For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array. The array {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4. 
The array {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the 0 is out of range. And {1, 1, 3, 2, 2, 4} is not a 1-4 sequenced array 
because it is not in ascending order.

Write a method named isSequencedArray that returns 1 if its argument is a m-n sequenced array, otherwise it returns 0.
*/
import java.util.Arrays;
public class MNSequencedArray1Demo3 //Perfect Answer!
{
    public static void main(String[] args)
    {     
        System.out.println(isSequencedArray(new int[] {2, 2, 3, 4, 4, 4, 5})); //1
        System.out.println(isSequencedArray(new int[] {2, 2, 3, 5, 5, 5})); //0
        System.out.println(isSequencedArray(new int[] {0, 2, 2, 3, 3})); //0 ---> Should it be a 0-3 sequenced array??? 
        System.out.println(isSequencedArray(new int[] {1, 1, 3, 2, 2, 4})); //0
    }
    static int isSequencedArray(int[] a)
    {            
        int i, maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        for(i = 0; i < a.length-1; i++)
        {
            if(a[i] > a[i+1]) return 0;
            if(maxVal < a[i]) maxVal = a[i];
            if(minVal > a[i]) minVal = a[i];
        }
        if(maxVal < a[i]) maxVal = a[i];
        if(minVal > a[i]) minVal = a[i];

        for(int j = minVal; j <= maxVal; j++)
        {
            boolean flag = false;
            for(int k = 0; k < a.length; k++)
                if(j == a[k]) flag = true;
            if(flag == false) return 0;
        }
        return 1;
    }
}
