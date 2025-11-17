/* Write a method int allEven(int[] a, int len) that returns 1 if all elements of the array a are even, 
otherwise it returns 0. Assume that the array has at least one element.
*/
public class AllEvenDemo
{
    public static void main(String[] args)
    {
        System.out.println(allEven(new int[] {10, 2, 8, 4}));
        System.out.println(allEven(new int[] {10, 2, 8, 3}));
    }
    static int allEven(int[] a)
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] % 2 != 0) return 0;
        
        return 1;
    }
}