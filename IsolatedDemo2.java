/* Define a positive number to be isolated if none of the digits in its square are in its cube. For example 163 is n isolated number because 69*69 =  4761  
and 69*69*69 = 328509 and the square does not contain any of the digits 0, 3, 4 and 7 which are the digits used in the cube. On the other hand, 162 is not an 
isolated number because 162*162 = 26244 and 162*162*162 = 4251528 and the digits 2 and 4 which appear in the square are also in the cube.

Write a function named isIsolated that returns 1 if its argument is an isolated number,  it returns 0 if its not an isolated number and it returns -1 if it 
cannot determine whether it is isolated or not (see the note below). The function signature is:
    int isIsolated(long n)

Note that the type of the input parameter is long. The maximum positive number that can be represented as a long is 63 bits long. This allows us to test numbers 
up to 2,097,151 because the cube of 2,097,151 can be represented as a long. However, the cube of 2,097,152 requires more than 63 bits to represent it and hence 
cannot be computed without extra effort. Therefore, your function should test if n is larger than 2,097,151 and return -1 if it is. If  n is less than 1 your 
function should also return -1.

Hint: n % 10 is the rightmost digit of n, n = n/10 shifts the digits of n one place to the right.

The first 10 isolated numbers are:
N	    n*n	    n*n*n
2	    4 	    8
3	    9 	    27
8	    64 	    512
9	    81 	    729
14	    196 	2744
24	    576 	13824
28	    784 	21952
34	    1156 	39304
58	    3364 	195112
63	    3969 	250047
*/
import java.util.Arrays;
public class IsolatedDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isIsolated(2));
        System.out.println(isIsolated(3));
        System.out.println(isIsolated(8));
        System.out.println(isIsolated(9));
        System.out.println(isIsolated(14));
        System.out.println(isIsolated(24));
        System.out.println(isIsolated(28));
        System.out.println(isIsolated(34));
        System.out.println(isIsolated(58));
        System.out.println(isIsolated(63));
        //System.out.println();
        System.out.println(isIsolated(69));
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(0));
        
    }
    static int isIsolated(long n)
    {
       if(n < 1) return -1;
       
       long[] arr = new long[1];

       long square = n * n, cube = n * n * n;

       int count = 0; //Array index MUST be INT - if it is LONG, it will bring error!
       boolean flag = false;
       while(square != 0)
       {
           if(flag == true)
           {
               count++;
               arr = arraySizeGrow(arr);
               arr[count] = square % 10;
           }
           if(count == 0 && flag == false)
           {
               arr[count] = square % 10;
               flag = true;
           }
           square = square / 10;
       }
       //System.out.println(Arrays.toString(arr));
       while(cube != 0)
       {
           //System.out.println("Checking ... "+cube % 10);
           if(findNum(arr, cube % 10) == true) return 0;
           cube = cube / 10;
       }
       return 1;
    }
    static boolean findNum(long[] arr, long n)
    {
        for(int i = 0; i < arr.length; i++) //Array index MUST be INT - if it is LONG, it will bring error!
            if(arr[i] == n) return true;
        return false;
    }
    static long[] arraySizeGrow(long[] arr)
    {
        long[] temp = new long[arr.length+1];

        for(int i = 0; i < arr.length; i++) //Array index MUST be INT - if it is LONG, it will bring error!
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}