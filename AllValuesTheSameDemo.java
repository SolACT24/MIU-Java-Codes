/* Write a function named allValuesTheSame that returns 1 if all elements of its argument array have the same value. 
Otherwise, it returns 0. 
If you are programming in Java or C#, the function signature is: 
    int allValuesTheSame(int[] a)
*/
public class AllValuesTheSameDemo
{
    public static void main(String[] args)
    {
        System.out.println(allValuesTheSame(new int[] {1, 1, 1, 1}));
        System.out.println(allValuesTheSame(new int[] {83, 83, 83}));
        System.out.println(allValuesTheSame(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(allValuesTheSame(new int[] {1, -2343456, 1, -2343456}));
        System.out.println(allValuesTheSame(new int[] {0, 0, 0, 0, -1}));
        System.out.println(allValuesTheSame(new int[] {432123456}));
        System.out.println(allValuesTheSame(new int[] {-432123456}));
        System.out.println(allValuesTheSame(new int[] {}));
        System.out.println(allValuesTheSame(new int[] {3}));
        
    }
    static int allValuesTheSame(int[] a)
    {
        if(a.length == 0 || a == null) return 0;

        for(int i = 0; i < a.length; i++)
            if(a[0] != a[i]) return 0;
                
        return 1;
    }
}