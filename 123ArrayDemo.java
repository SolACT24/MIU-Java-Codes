/* Define an array to be a 121 array if all its elements are either 1 or 2 and it begins with one or more 1s followed 
by a one or more 2s and then ends with the same number of 1s that it begins with. Write a method named is121Array that returns 1 
if its array argument is a 121 array, otherwise, it returns 0.

If you are programming in Java or C#, the function signature is:
    int is121Array(int[] a)
Examples:
a is 	             then function returns 	reason 
{1, 2, 1}	                        1	    because the same number of 1s are at the beginning and end of the array and there is at least one 2 in between them.
{1, 1, 2, 2, 2, 1, 1}	            1	    because the same number of 1s are at the beginning and end of the array and there is at least one 2 in between them.
{1, 1, 2, 2, 2, 1, 1, 1}	        0	    Because the number of 1s at the end does not equal the number of 1s at the beginning.
{1, 1, 2, 1, 2, 1, 1}	            0	    Because the middle does not contain only 2s.
{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}  	0	    Because the array contains a number other than 1 and 2.
{1, 1, 1, 1, 1, 1}	                0	    Because the array does not contain any 2s
{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}	0	    Because the first element of the array is not a 1.
{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}	    0	    Because the last element of the array is not a 1.
{2, 2, 2}	                        0	    Because there are no 1s in the array.
*/
public class _123ArrayDemo 
{
    public static void main(String[] args)
    {
        System.out.println(is121Array(new int[] {1,2,1}));
        System.out.println(is121Array(new int[] {1,1,2,2,2,1,1}));
        System.out.println(is121Array(new int[] {1,1,2,2,2,1,1,1}));
        System.out.println(is121Array(new int[] {1,1,2,1,2,1,1}));
        System.out.println(is121Array(new int[] {1,1,1,2,2,2,1,1,1,3}));
        System.out.println(is121Array(new int[] {1,1,1,1,1,1}));
        System.out.println(is121Array(new int[] {2,2,2,1,1,1,2,2,2,1,1}));
        System.out.println(is121Array(new int[] {1,1,1,2,2,2,1,1,2,2}));
        System.out.println(is121Array(new int[] {2,2,2}));

        System.out.println(is121Array(new int[] {1,1,2,2,1,2,1,1,1}));
    }
    static int is121Array(int[] a)
    {
        boolean flag1 = false, flag2 = false;
        int begin1s = 0, mid2s = 0, end1s = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != 1 && a[i] != 2) return 0;

            if(a[i] == 1 && flag1 == false) begin1s++;
            if(a[i] == 2 && flag2 == false) 
            {
                mid2s++;
                flag1 = true;
            }
            if(a[i] == 1 && flag1 == true) 
            {
                end1s++;
                flag2 = true;
            }
            if(a[i] == 2 && flag2 == true) return 0;
        }
        if(begin1s != end1s || (begin1s == 0 && end1s == 0) || mid2s == 0) return 0; //{System.out.println("begin1s: "+begin1s+", mid2s: "+mid2s+", end1s: "+end1s); return 0;}
        else return 1; //{System.out.println("begin1s: "+begin1s+", mid2s: "+mid2s+", end1s: "+end1s); return 1;}
    }
}
