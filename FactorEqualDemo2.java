/* Two integers are defined to be factor equal, if they have the same number of factors. For example, 
integers 10 and 33 are factor equal because, 10 has four factors: 1, 2, 5, 10 and 33 also has four factors: 1, 3, 11, 33. 
On the other hand, 9 and 10 are not factor equal since 9 has only three factors: 1, 3, 9 and 10 has four factors: 1, 2, 5, 10.

Write a function named factorEqual(int n, int m) that returns 1 if n and m are factor equal and 0 otherwise.

The signature of the function is:
   int factorEqual(int n, int m)
*/
import java.util.Arrays;
public class FactorEqualDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(factorEqual(10, 33));
        System.out.println(factorEqual(9, 10));
    }
    static int factorEqual(int n, int m)
    {
        int[] a1 = func(n);
        int[] a2 = func(m);

        if(a1.length == a2.length) return 1;

        return 0;
    }
    static int[] func(int num)
    {
        int[] arr = new int[1];

        int count = 0, i = 1;
        boolean flag = false;

        while(i <= num)
        {
            if(num % i == 0 && flag == true)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = i;
            }
            if(count == 0 && num % i == 0 && flag == false)
            {
                arr[count] = i;
                flag = true;
            }
            i++;
        }
        System.out.print(num+": ");
        System.out.println(Arrays.toString(arr));

        return arr;
    }
    static int[] arraySizeGrow(int[] arr)
    {
        int[] temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}