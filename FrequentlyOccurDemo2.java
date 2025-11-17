/* Write a program which finds the most frequently occuring element in an array.
Write a function named FrequentlyOccure.

If you are writing in Java or C#, the function signature is:
    int frequentlyOccure(int[] a)

Example: {4, 1, 1, 4, 2, 3, 4, 4, 2, 4, 9, 3} 4 (5 times)
*/
import java.util.Arrays;
public class FrequentlyOccurDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(frequentlyOccure(new int[] {1, 4, 1, 4, 2, 3, 4, 4, 2, 4, 9, 3}));
    }
    static int frequentlyOccure(int[] a)
    {
       int[] arr = new int[1];

       int maxFreq = 0;
       for(int i = 0; i < a.length; i++)
       {
            int freq = 0;
            for(int j = 0; j < a.length; j++)
                if(a[i] == a[j]) freq++;
            //System.out.println(a[i]+" occurs "+freq+" times!");
            if(freq > maxFreq)
            {
                arr[0] = a[i];
                maxFreq = freq;
            }
       }
       return arr[0];
    }
}
