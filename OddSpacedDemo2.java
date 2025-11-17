/* An integer array is said to be oddSpaced, if the difference between the largest value and the smallest value is an odd number. 
Write a function isOddSpaced(int[] a) that will return 1 if it isoddSpaced and 0 otherwise. 
If array has less than two elements, function will return 0.
Examples
Array	                Largest value	Smallest value	Difference	        Return value
{100, 19, 131, 140}	    140	            19	            140-19 = 121	    1
{200, 1, 151, 160}	    200	            1	            200-1 = 199	        1
{200, 10, 151, 160}	    200	            10	            200-10 = 190	    0
{100, 19, -131, -140}	100	           -140	            100-(-140 ) = 240	0
{80, -56, 11, -81}	    80	           -81	            80-(-80) = 161	    1
*/
public class OddSpacedDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isOddSpaced(new int[] {100, 19, 131, 140})); //1
        System.out.println(isOddSpaced(new int[] {200, 1, 151, 160})); //1
        System.out.println(isOddSpaced(new int[] {200, 10, 151, 160})); //0
        System.out.println(isOddSpaced(new int[] {100, 19, -131, -140})); //0
        System.out.println(isOddSpaced(new int[] {80, -56, 11, -81})); //1
    }
    static int isOddSpaced(int[] a)
    {
        if(a.length < 2) return 0;

        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(maxVal < a[i]) maxVal = a[i];
            if(minVal > a[i]) minVal = a[i];
        }
        if((maxVal - minVal) % 2 != 0) return 1;

        return 0;
    }
}