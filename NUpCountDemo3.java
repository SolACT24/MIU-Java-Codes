/* Define the n-upcount of an array to be the number of times the partial sum goes from less than or equal to n to 
greater than n during the calculation of the sum of the elements of the array. 

If you are programming in Java or C#, the function signature is:
    int nUpCount(int[] a, int n)

For example, if n = 5, the 5-upcount of the array {2, 3, 1, -6, 8, -3, -1, 2} is 3.
i       a[i]    partial sum     upcount     comment
0       2       2
1       3       5
2       1       6               1           partial sum goes from 5 to 6
3       -6      0
4       8       8               2           partial sum goes from 0 to 8
5       -3      5               
6       -1      4
7       2       6               3           partial sum goes from 4 to 6
Notice that the three rows in the count column that contain values correspond to times when the partial
sum goes from less than or equal to 5 to greater than 5.
Note that the partial sum is initialized to 0. For example, the 6 upcount of the array {6, 3, 1} is 1.
i       a[i]    partial sum     upcount     comment
0       6       6                1          partial sum goes from 0(its initial value) to 6  ------ X
1       3       9                1          partial sum goes from 6 to 9   ----- which is the previous sum is less than or equal to 6 & 
                                                                                                    the current sum is greater than 6.
2       1       10   
Here is an example of an array with a 0 20-upcount: {1, 2, -1, 5, 3, 2, -3}. This is because the maximum value of a 
partial sum is 12, i.e., the partial sum never gets bigger than 20.
Hint: Save the previous partial sum in a variable.                       
*/
public class NUpCountDemo3 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(nUpCount(new int[] {2, 3, 1, -6, 8, -3, -1, 2}, 5)); //3
        System.out.println(nUpCount(new int[] {2, 3, 1, -6, 8, -3, -1, 2}, 4)); //3
        System.out.println(nUpCount(new int[] {6, 3, 1}, 6)); //1
        System.out.println(nUpCount(new int[] {1, 2, -1, 5, 3, 2, -3}, 20)); //0
    }  
    static int nUpCount(int[] a, int n)
    {
       int upcount = 0, sum = 0, prev = 0;
       for(int i = 0; i < a.length; i++)
       {
            sum = prev + a[i];
            if(prev <= n && sum > n) upcount++;
            prev = sum;  
       }
       return upcount;
    }  
}
