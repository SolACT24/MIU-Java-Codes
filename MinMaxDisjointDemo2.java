/* An array is defined to be minmax-disjoint if the following conditions hold:
    a. The minimum and maximum values of the array are not equal.
    b. The minimum and maximum values of the array are not adjacent to one another.
    c. The minimum value occurs exactly once in the array. 
    d. The maximum value occurs exactly once in the array.
For example the array {5, 4, 1, 3, 2} is minmax-disjoint because:
    a. The maximum value is 5 and the minimum value is 1 and they are not equal.
    b. 5 and 1 are not adjacent to one another
    c. 5 occurs exactly once in the array
    d. 2 occurs exactly once in the array

Write a function named isMinMaxDisjoint that returns 1 if its array argument is minmax-disjoint, otherwise it returns 0.

If you are programming in Java or C#, the function signature is:
    int isMinMaxDisjoint(int[] a)

Examples of arrays that are not minMaxDisjoint:
if a is	          return 	Reason
{18, -1, 3, 4, 0}	0	    The max and min values are adjacent to one another.
{9, 0, 5, 9}	    0	    The max value occurs twice in the array.
{0, 5, 18, 0, 9}	0	    The min value occurs twice in the array.
{7, 7, 7, 7}	    0	    The min and the max value must be different.
{}	                0	    There is no min or max.
{1, 2}	            0	    The min and max elements are next to one another.
{1}	                0	    The min and the max are the same.
*/
public class MinMaxDisjointDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isMinMaxDisjoint(new int[] {18, -1, 3, 4, 0})); //0
        System.out.println(isMinMaxDisjoint(new int[] {9, 0, 5, 9})); //0
        System.out.println(isMinMaxDisjoint(new int[] {0, 5, 18, 0, 9})); //0
        System.out.println(isMinMaxDisjoint(new int[] {7, 7, 7, 7})); //0
        System.out.println(isMinMaxDisjoint(new int[] {})); //0
        System.out.println(isMinMaxDisjoint(new int[] {1, 2})); //0
        System.out.println(isMinMaxDisjoint(new int[] {1})); //0
        System.out.println(isMinMaxDisjoint(new int[] {5, 4, 1, 3, 2})); //1
    }
    static int isMinMaxDisjoint(int[] a)
    {
        if(a == null || a.length == 0) return 0;

        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(maxVal < a[i]) maxVal = a[i];
            if(minVal > a[i]) minVal = a[i];
        }
        if(maxVal == minVal) return 0; //{System.out.println("MaxVal "+maxVal+" and MinVal "+minVal+" shouldn't be equal!"); return 0;}

        int i, minValFreq = 0, maxValFreq = 0;
        for(i = 0; i < a.length-1; i++)
        {
            if(a[i] == maxVal && a[i+1] == minVal || a[i] == minVal && a[i+1] == maxVal) return 0; //{System.out.println("MaxVal "+maxVal+" and MinVal "+minVal+" shouldn't be adjacent to one another!"); return 0;}
            if(a[i] == maxVal) maxValFreq++;
            if(a[i] == minVal) minValFreq++;
        }
        if(a[i] == maxVal) maxValFreq++;
        if(a[i] == minVal) minValFreq++;

        if(maxValFreq != 1 && minValFreq != 1) return 0; //{System.out.println("MaxVal: "+maxVal+" and MinVal "+minVal+" shouldn't occur d/t from 1!"); return 0;}

        return 1;
    }
}
