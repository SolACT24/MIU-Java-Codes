/* An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than 
the value of the middle element. Note that only arrays with an odd number of elements have a middle element. Write a function named 
isCentered that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.  Examples: {1, 2, 3, 4, 5} 
is not a centered array (the middle element 3 is not strictly less than all other elements), {3, 2, 1, 4, 5} is centered 
(the middle element 1 is strictly less than all other elements), {3, 2, 1, 4, 1} is not centered (the middle element 1 is 
not strictly less than all other elements), {3, 2, 1, 1, 4, 6} is not centered (no middle element since array has even number of elements), 
{} is not centered (no middle element), {1} is centered (satisfies the condition vacuously). 

If you are programming in Java or C#, the function signature is:  
    int isCentered(int[] a)
*/
public class Centered11Demo
{
    public static void main(String[] args)
    {
        System.out.println(isCentered(new int[] {1,2,3,4,5})); //0
        System.out.println(isCentered(new int[] {3,2,1,4,5})); //1
        System.out.println(isCentered(new int[] {3,2,1,4,1})); //0
        System.out.println(isCentered(new int[] {3,2,1,1,4,6})); //0
        System.out.println(isCentered(new int[] {1,2,3,4})); //0 (no middle element)
        System.out.println(isCentered(new int[] {})); //0 (no middle element)
        System.out.println(isCentered(new int[] {1})); //1
        System.out.println();
        System.out.println(isCentered(new int[] {5, 3, 3, 4, 5})); //0
        System.out.println(isCentered(new int[] {3, 2, 1, 4, 5})); //1
        System.out.println(isCentered(new int[] {3, 2, 1, 4, 1})); //0
        System.out.println(isCentered(new int[] {3, 2, 1, 1, 4, 6})); //0
    }
    static int isCentered(int[] a)
    {
        if(a.length % 2 == 0 || a.length == 0 || a == null) return 0;
        if(a.length == 1) return 1;

        for(int i = 0, j = a.length/2 + 1; i < a.length/2 && j < a.length; i++, j++)
            if(a[i] <= a[a.length/2] || a[j] <= a[a.length/2]) return 0;

        return 1;
    }
}