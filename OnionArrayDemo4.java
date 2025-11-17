/* An onion array is an array that satisfies the following condition for all values of j and k: 
if j >= 0 and k >= 0 and j + k = length of array and j != k, then a[j] + a[k] <= 10. 

Write a function named isOnionArray that returns 1 if its array argument is an onion array and returns 0 if it is not.

Your solution must not use a nested loop (i.e., a loop executed from inside another loop). 
Furthermore, once you determine that the array is not an onion array your function must return 0; no wasted loops cycles please!

If you are programming in Java or C#, the function signature is:
    int isOnionArray(int[] a)

Examples:
a is 	then function returns 	reason 
{1, 2, 19, 4, 5}	1	        because 1+5 <= 10, 2+4 <=10
{1, 2, 3, 4, 15}	0	        because 1+15 > 10
{1, 3, 9, 8}	    0	        because 3+9 > 10
{2}	                1	        because there is no j, k where a[j]+a[k] > 10 and j+k=length of array and j!=k
{}	                1	        because there is no j, k where a[j]+a[k] > 10 and j+k=length of array and j!=k
{-2, 5, 0, 5, 12}	1	        because -2+12 <= 10 and 5+5 <= 10
*/
public class OnionArrayDemo4 //It says the solution must not use a nested loop. So, this is the perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(isOnionArray(new int[] {1, 2, 19, 4, 5})); //1
        System.out.println(isOnionArray(new int[] {1, 2, 19, 4, 15})); //0
        System.out.println(isOnionArray(new int[] {1, 3, 9, 8})); //0
        System.out.println(isOnionArray(new int[] {2})); //1
        System.out.println(isOnionArray(new int[] {})); //1
        System.out.println(isOnionArray(new int[] {-2, 5, 0, 5, 12})); //1
    }
    static int isOnionArray(int[] a)
    {
        if(a.length == 0 || a.length == 1) return 1;

        int j = 0, k = a.length;
        while(j < k)
        {
            j++;
            k--;
            if(j != k && j + k == a.length && a[j] + a[k] <= 10) return 1;            
        }
        return 0;
    }
}