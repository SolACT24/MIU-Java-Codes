/* The Stanton measure of an array is computed as follows. Count the number of 1s in the array. Let this count be n. 
The Stanton measure is the number of times that n appears in the array. 
For example, the Stanton measure of {1, 4, 3, 2, 1, 2, 3, 2} is 3 because 1 occurs 2 times in the array and 2 occurs 3 times.

Write a function named stantonMeasure that returns the Stanton measure of its array argument.

If you are programming in Java or C#, the function prototype is:
	int stantonMeasure(int[] a)

Examples:
if a is	                            return	Reason
{1}	                                1	    1 occurs 1 time, 1 occurs 1 time
{0}	                                1	    1 occurs 0 times, 0 occurs 1 time
{3, 1, 1, 4}	                    0	    1 occurs 2 times, 2 occurs 0 times
{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}	6	    1 occurs 3 times, 3 occurs 6 times 
{}	                                0	    1 occurs 0 times, 0 occurs 0 times
*/
public class StantonMeasureDemo2 
{
    public static void main(String[] args)
    {
        System.out.println(isStantonMeasure(new int[] {1})); //1
        System.out.println(isStantonMeasure(new int[] {0})); //1
        System.out.println(isStantonMeasure(new int[] {3,1,1,4})); //0
        System.out.println(isStantonMeasure(new int[] {1,3,1,1,3,3,2,3,3,3,4})); //6
        System.out.println(isStantonMeasure(new int[] {})); //0

        System.out.println(isStantonMeasure(new int[] {1,4,3,2,1,2,3,2})); //3
    }
    static int isStantonMeasure(int[] a)
    {
        if(a.length == 0) return 0;

        int freq1s = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] == 1) freq1s++;

        int freq = 0;
        for(int i = 0; i < a.length; i++)
            if(freq1s == a[i]) freq++;
        
        return freq;
    }
}
