/* An integer is defined to be an even subset of another integer n if every even factor of m is also a factor of n. 
For example, 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and these are both factors of 12. 
But 18 is not an even subset of 32 because 6 is not a factor of 32.

Write a function with signature: 
int isEvenSubset(int m, int n) that returns 1 if m is an even subset of n, otherwise it returns 0.
*/
import java.util.Arrays;
public class EvenSubsetDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isEvenSubset(18, 12));
        System.out.println(isEvenSubset(18, 32));
    }
    static int isEvenSubset(int m, int n)
    {
        int[] a1 = func(m);
        int[] a2 = func(n);

        for(int i = 0; i < a1.length; i++)
        {
            boolean flag = false;
            if(a1[i] % 2 == 0)
            {
                for(int j = 0; j < a2.length; j++)
                    if(a1[i] == a2[j]) flag = true;
                if(flag == false) return 0;
            }
        }
        return 1;
    }
    static int[] func(int n)
    {
        int[] arr = new int[1];

        boolean flag = false;
        int count = 0, num = n;
        for(int i = 2; i <= n/2; i++)
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
        }
        //System.out.println(Arrays.toString(arr));
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
