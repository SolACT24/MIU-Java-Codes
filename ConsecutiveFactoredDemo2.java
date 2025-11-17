/* A positive number n is consecutive-factored if and only if it has factors, i and j where i > 1, j > 1 and j = i + 1. 
Write a function named isConsecutiveFactored that returns 1 if its argument is consecutive-factored, otherwise it returns 0. 
Examples:
n	    return	because
24	      1	    24 = 2*3*4 and 3 = 2 + 1
105	      0	    105 = 3*5*7 and 5 != 3+1 and 7 != 5+1
90	      1	    factors of 90 include 2 and 3 and 3 = 2 + 1
23	      0	    has only 1 factor that is not equal to 1
15	      0	    15 = 3*5 and 5 != 3 + 1
2	      0	    2 = 1*2, 2 = 1 + 1 but factor 1 is not greater than 1
0	      0	    n has to be positive
-12	      0	    n has to be positive

The function signature is:
    int isConsecutiveFactored(int n)
*/
import java.util.Arrays;
public class ConsecutiveFactoredDemo2 
{
    public static void main(String[] args)
    {
        System.out.println(isConsecutiveFactored(24)); //1
        System.out.println(isConsecutiveFactored(105)); //0
        System.out.println(isConsecutiveFactored(90)); //1
        System.out.println(isConsecutiveFactored(23)); //0
        System.out.println(isConsecutiveFactored(15)); //0
        System.out.println(isConsecutiveFactored(2)); //0
        System.out.println(isConsecutiveFactored(0)); //0
        System.out.println(isConsecutiveFactored(-12)); //0
    }
    static int isConsecutiveFactored(int n)
    {
        if(n <= 0) return 0;

        int[] arr = new int[1];
        int count = 0, num = n;
        
        boolean flag = false;
        for(int i = 2; i <= n; i++)
        {
            if(flag == true && num % i == 0)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = i;
                num = num / i;
            }
            if(count == 0 && num % i == 0)
            {
                arr[count] = i;
                num = num / i;
                flag = true;
            }
            if(num == 1 || num < i) break;
            
        }
        //System.out.print(n+": ");
        //System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++)
            if(arr[i+1] == arr[i]+1) return 1;
        return 0;
    }
    static int[] arraySizeGrow(int[] arr)
    {
        int[] temp = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}
