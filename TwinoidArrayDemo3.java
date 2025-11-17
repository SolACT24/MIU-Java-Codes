/* A twinoid is defined to be an array that has exactly two even values that are adjacent to one another. 

For example: {3, 3, 2, 6, 7} is a twinoid array because it has exactly two even values (2 and 6) and they are adjacent to one another. 
The following arrays are not twinoid arrays. 
    {3, 3, 2, 6, 6, 7} because it has three even values.
    {3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another
    {3, 8, 5, 7, 3} because it has only one even value.
Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise it returns 0.

If you are programming in Java or C#, the function signature is
    int isTwinoid(int[] a);
*/
public class TwinoidArrayDemo3
{
    public static void main(String[] args)
    {
        System.out.println(isTwinoid(new int[] {3, 3, 2, 6, 7})); //1
        System.out.println(isTwinoid(new int[] {3, 3, 2, 6, 6, 7})); //0
        System.out.println(isTwinoid(new int[] {3, 3, 2, 7, 6, 7})); //0
        System.out.println(isTwinoid(new int[] {3, 8, 5, 7, 3})); //0
    }
    static int isTwinoid(int[] a)
    {
        int freq = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] % 2 == 0) freq++;
        if(freq != 2) return 0;

        for(int i = 0; i < a.length-1; i++)
            if(a[i] % 2 == 0 && a[i+1] % 2 == 0) return 1;
        return 0;
    }
}
