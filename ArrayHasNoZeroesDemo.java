/* Write a function that will return 1 if all its elements are non-zero. Otherwise it returns 0.
If you are programming in Java or C# the function signiture is:
    int arrayHasNoZeroes(int[] a)
*/
public class ArrayHasNoZeroesDemo
{
    public static void main(String[] args)
    {
        System.out.println(arrayHasNoZeroes(new int[] {1,2,3}));
        System.out.println(arrayHasNoZeroes(new int[] {1,0,4,0}));
        System.out.println(arrayHasNoZeroes(new int[] {1,2,3,0}));
        System.out.println(arrayHasNoZeroes(new int[] {0,0,0,0}));
        System.out.println(arrayHasNoZeroes(new int[] {}));
    }
    static int arrayHasNoZeroes(int[] a)
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] == 0) return 0;
        
        return 1;
    }
}