/* A Super array is defined to be an array in which each element is greater than sum of all elements before that. 

See examples below: {2, 3, 6, 13} is a Super array. Note that 2 < 3, 2 + 3 < 6, 2 + 3 + 6 < 13.
 {2, 3, 5, 11} is a NOT a Super array. Note that 2 + 3 not less than 5.

 Write a function named isSuper that returns 1 if its array argument is an isSuper array, otherwise it returns 0.
 
If you are programming in Java or C#, the function signature is:
   int isSuper(int[] a)
*/
public class SuperArrayDemo2 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(isSuper(new int[] {2, 3, 6, 13})); //1
        System.out.println(isSuper(new int[] {2, 3, 5, 11})); //0
    }
    static int isSuper(int[] a)
    {
        for(int i = a.length-1; i >= 1; i--)
        {
            int sum = 0;
            for(int j = 0; j < i; j++)
                sum += a[j];
            //System.out.println("Is "+a[i]+" > "+sum+"?");
            if(a[i] <= sum) return 0;
        }
        return 1;
    }
}