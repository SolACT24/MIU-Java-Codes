/* A simple pattern match on the elements of an array A can be defined using another array P. Each element n of P is negative or positive (never zero) and 
defines the number of elements in a sequence in A. The first sequence in A starts at A[0] and its length is defined by P[0]. The second sequence follows 
the first sequence and its length is defined by P[1] and so on. Furthermore, for n in P, if n is positive then the sequence of n elements of A must all be positive. 
Otherwise the sequence of abs(n) elements must all be negative.The sum of the absolute values of the elements of P must be the length of A. For example, 
consider the array: A = {1, 2, 3, -5, -5, 2, 3, 18}. If P = {3, -2, 3}, then A matches P because:
    1) The first 3 elements of A (1, 2, 3) are positive (P[0] is 3 and is positive)
    2) The next 2 elements of A (-5, -5) are negative (P[1] is -2 and is negative)
    3) and the last 3 elements of A (2, 3, 18) are positive (P[2] is 3 and is positive)

Notice that the absolute value of its elements of P sum to the length of A and it contains no zeros.

The signiture of the function is:
int matches(int[] a, int[] p)
{
    // returns 1 if A matches P, otherwise it returns 0.
}
Hint: Your function should have one loop nested in another. The outer loop iterates through the elements of P. The inner loop iterates through the next sequence of A. 
The upper bound of the inner loop is the absolute value of the current element of P. The lower bound of the inner loop is 0. The loop variable of the inner loop is not 
used to index A!  
*/
public class MatchesDemo3 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int[] {3,-2,3})); //1
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int[] {2,1,-1,-1,2,1})); //1
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int[] {1,2,-1,-1,1,2})); //1
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int[] {2,1,-2,3})); //1
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int[] {1,1,1,-1,-1,1,1,1})); //1        
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int[] {4,-1,3})); //0
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int[] {2,-3,3})); //0
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int[] {8})); //0
    }
    static int matches(int[] a, int[] p)
    {
        int j = 0, sum = 0;
        for(int i = 0; i < p.length; i++)
        {
            if(p[i] == 0) return 0; 

            int count = 0, len = Math.abs(p[i]);
            while(count < len && p[i] < 0 && j < a.length)
            {
                if(a[j] > 0) return 0;
                j++;
                count++;
            }
            while(count < len && p[i] > 0 && j < a.length)
            {
                if(a[j] < 0) return 0;
                j++;
                count++;
            }
            sum += Math.abs(p[i]); 
        }
        if(sum != a.length) return 0; 

        return 1;         
    }
}
