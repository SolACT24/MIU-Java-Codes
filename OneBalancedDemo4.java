/* Define an array to be one-balanced if it begins with zero or more 1s followed by zero or more non-1s and concludes with zero or more 1s. 

Write a function named isOneBalanced that returns 1 if its array argument is one-balanced, otherwise it returns 0.

If you are programming in Java or C#, the function signature is:
    int isOneBalanced(int[] a)

Examples:
if a is 	      then function returns 	reason 
{1, 1, 1, 2, 3, -18, 45, 1}	    1	        because it begins with three 1s, followed by four non-1s and ends with one 1 and 3+1 == 4
{1, 1, 1, 2, 3, -18, 45, 1, 0}	0	        because the 0 starts another sequence of non-1s. There can be only one sequence of non-1s.
{1, 1, 2, 3, 1, -18, 26, 1}	    0	        because there are two sequences of non-1s ({2, 3} and {-18, 26}
{}	                            1	        because 0 (# of beginning 1s) + 0 (# of ending 1s) = 0 (# of non-1s)
{3, 4, 1, 1}	                1	        because 0 (# of beginning 1s) + 2 (# of ending 1s) = 2 (# of non-1s)
{1, 1, 3, 4}	                1	        because 2 (# of beginning 1s) + 0 (# of ending 1s) = 2 (# of non-1s)
{3, 3, 3, 3, 3, 3}	            0	        because 0 (# of beginning 1s) + 0 (# of ending 1s) != 6 (# of non-1s)
{1, 1, 1, 1, 1, 1}	            0	        because 6 (# of beginning 1s) + 0 (# of ending 1s) != 0 (# of non-1s)
*/
public class OneBalancedDemo4 //Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(isOneBalanced(new int[] {1, 1, 1, 2, 3, -18, 45, 1})); //1
        System.out.println(isOneBalanced(new int[] {1, 1, 1, 2, 3, -18, 45, 1, 0})); //0 ---
        System.out.println(isOneBalanced(new int[] {1, 1, 2, 3, 1, -18, 26, 1})); //0
        System.out.println(isOneBalanced(new int[] {})); //1
        System.out.println(isOneBalanced(new int[] {3, 4, 1, 1})); //1
        System.out.println(isOneBalanced(new int[] {1, 1, 3, 4})); //1
        System.out.println(isOneBalanced(new int[] {3, 3, 3, 3, 3, 3})); //0
        System.out.println(isOneBalanced(new int[] {1, 1, 1, 1, 1, 1})); //0
        System.out.println(isOneBalanced(new int[] {0, 0, 0})); //0
    }
    static int isOneBalanced(int[] a)
    {
        int begin1s = 0, non1s = 0, end1s = 0;
        boolean begin1sFlag = false, non1sFlag = false;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 1 && begin1sFlag == false) begin1s++;
            if(a[i] != 1 && non1sFlag == false)
            {
                non1s++;
                begin1sFlag = true;
            }
            if(a[i] == 1 && begin1sFlag == true)
            {
                end1s++;
                non1sFlag = true;
            }
            if(a[i] != 1 && begin1sFlag == true && non1sFlag == true) return 0;
        }
        if(begin1s+end1s != non1s) return 0;

        return 1;
    }
}