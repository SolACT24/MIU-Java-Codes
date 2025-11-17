/* A Sub array is defined to be an array in which each element is greater than sum of all elements after that. 
See examples below: {13, 6, 3, 2} is a Sub array. Note that 13 > 6 + 3 + 2, 6 > 3 + 2, 3 > 2.
{11, 5, 3, 2} is a NOT a Sub array. Note that 5 is not greater than 3 + 2.

Write a function named isSub that returns 1 if its array argument is a Sub array, otherwise it returns 0.
 
If you are programming in Java or C#, the function signature is:
   int isSub(int[] a)
*/
public class SubArrayDemo2 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(isSub(new int[] {13, 6, 3, 2})); //1
        System.out.println(isSub(new int[] {11, 5, 3, 2})); //0
    }
    static int isSub(int[] a)
    {
        for(int i = 0; i < a.length-1; i++)
        {
            int sum = 0;
            for(int j = i+1; j < a.length; j++)
                sum += a[j];
            //System.out.println(a[i]+" > "+sum);
            if(a[i] <= sum) return 0;
        }
        return 1;
    }
}
