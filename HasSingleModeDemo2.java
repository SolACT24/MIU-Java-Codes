/* Mode is the most frequently appearing value. Write a function named hasSingleMode that takes an array argument and returns 1 
if the mode value in its array argument occurs exactly once in the array, otherwise it returns 0. 

If you are writing in Java or C#, the function signature is:
    int hasSingleMode(int[] a).
Examples:
Array elements              Mode value(s)   Value returned      Comments       
{1, -29, 8, 5, -29, 6}         {-29}               1            single mode
{1, 2, 3, 4, 2, 4, 7}          {2, 4}              0            no single mode
{1, 2, 3, 4, 6}                {1, 2, 3, 4, 6}     0            no single mode
{7, 1, 2, 1, 7, 4, 2, 7, 7}    {7}                 1            single mode
*/
import java.util.Arrays;
public class HasSingleModeDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(hasSingleMode(new int[] {1, -29, 8, 5, -29, 6})); //1
        System.out.println(hasSingleMode(new int[] {1, 2, 3, 4, 2, 4, 7})); //0
        System.out.println(hasSingleMode(new int[] {1, 2, 3, 4, 6})); //0
        System.out.println(hasSingleMode(new int[] {7, 1, 2, 1, 7, 4, 2, 7, 7})); //1
    }
    static int hasSingleMode(int[] a)
    {
        int[] arr = new int[1];

        int maxFreq = 0;
        for(int i = 0; i < a.length; i++)
        {
            int freq = 0;
            for(int j = 0; j < a.length; j++)
                if(a[i] == a[j]) freq++;
            if(freq > maxFreq) 
            {
                arr[0] = a[i];
                maxFreq = freq;
            }
        }
        for(int i = 0; i < a.length; i++)
        {
            int freq = 0;
            for(int j = 0; j < a.length; j++)
                if(a[i] == a[j]) freq++;
            if(freq == maxFreq && arr[0] != a[i]) return 0; //{System.out.println(arr[0]+" and "+a[i]+" have the same frequency!"); return 0;} 
        }
        return 1;
    } 
}