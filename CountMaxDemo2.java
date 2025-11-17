/* Write a function named countMax that returns the number of times that the max value occurs in the array. 
For example, countMax would return 2 if the array is {6, 3, 1, 3, 4, 3, 6, 5} because 6 occurs 2 times in the array.
 
If you are programming in Java or C#, the function signature is:
   int countMax(int[] a)
*/
public class CountMaxDemo2 
{
    public static void main(String[] args)
    {
        System.out.println(countMax(new int[] {6, 3, 1, 3, 4, 3, 6, 5}));
    }
    static int countMax(int[] a)
    {
        int freq = 0, maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++)
            if(maxVal < a[i]) maxVal = a[i];
        
        for(int i = 0; i < a.length; i++)
            if(maxVal == a[i]) freq++;
        
        //System.out.println("MaxValue: "+maxVal+", freq:"+freq);
        return freq;
    }
}
