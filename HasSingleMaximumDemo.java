/* Write a function named hasSingleMaximum that takes an array argument and returns 1 if the maximum
value in its array argument occurs exactly once in the array, otherwise it returns 0.

If you are writing in Java or C#, the function signature is:
    int hasSingleMaximum(int[] a)

Examples:
If a is                     return      reason
{1,2,3,1,0}                 1
{18}                        1
{1,2,3,0,1,3}               0
{13,1,13,2,13,0,13,1,13}    0
{}                          0           because there is no maximum value
{-6,-6,-6,-6,-6,-6,-6}      0
*/
public class HasSingleMaximumDemo 
{
    public static void main(String args[]) 
    {
        System.out.println(hasSingleMaximum(new int[] {1,2,3,1,0})); //1
        System.out.println(hasSingleMaximum(new int[] {18})); //1
        System.out.println(hasSingleMaximum(new int[] {3,1,2,0,1,3})); //0
        System.out.println(hasSingleMaximum(new int[] {13,1,13,2,13,0,13,1,13})); //0
        System.out.println(hasSingleMaximum(new int[] {})); //0
        System.out.println(hasSingleMaximum(new int[] {-6,-6,-6,-6,-6,-6,-6})); //0
    }
    static int hasSingleMaximum(int[] a) 
    {
        if(a.length == 0) return 0;
        
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++) 
            if(maxValue < a[i]) maxValue = a[i];
        
        int count = 0;
        for(int j = 0; j < a.length; j++)
            if(maxValue == a[j]) count++;
        
        //System.out.println(maxValue + ", " +count);

        if(count == 1) return 1;
        else return 0;
    }
}
