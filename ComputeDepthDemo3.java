/* The depth of an integer n is defined to be how many multiples of n it is necessary to compute before all 10 digits have appeared at least once in some multiple. 

For example, the depth of 42 is 9 as shown by the following table.
Multiple    Value   New digit(s) contributed    Digits contributed by previous multiples
42*1        42               2, 4               none
42*2        84               8                  4 (by 42*1)
42*3        126              1, 6               2 (by 42*1)
42*4        168              none               1, 6 (by 42*3), 8 by 42*2
42*5        210              0                  1 (by 42*3), 2 (by 42*1)
42*6        252              5                  2 (by 42*1)
42*7        294              9                  2, 4 (by 42*1)
42*8        336              3                  6 (by 42*3)
42*9        378              7                  3 (by 42*8), 8 (by 42*2)
If you look at the digit(s) contributed column you will find all the digits from 0 to 9. Since it required 9 multiples of 42 to get all the digits, the depth of 42 is 9.

Write a function named computeDepth that computes the depth of its integer argument. 
Its signature is:
    int computeDepth(int n)
HINT: Use an array to keep track of which digits have been contributed. Digits can be isolated using a
combination of modulo 10 and integer arithmetic.
Here are some other depths that you can use to verify your program
If n is     its depth is    comment
7           10              7*10 = 70 which contributes the final 0, the only digit that has
                            not yet appeared in a previous multiple of 7.
13          8               13*8 = 104 which contributes the 0 and the 4
25          36              36*25 = 900 which contributes the 9.
*/
import java.util.Arrays;
public class ComputeDepthDemo3 //Simple and Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(computeDepth(7)); //10
        System.out.println(computeDepth(13)); //8
        System.out.println(computeDepth(25)); //36
        System.out.println(computeDepth(42)); //9
    }
    static int computeDepth(int n)
    {
        int[] arr = new int[1];

        int depth = 1, count = 0, prod = 0;
        boolean flag = false;
        for(;;)
        {
            prod = n * depth;
            while(prod != 0)
            {
                if(flag == true && findNum(arr, prod % 10) == false)
                {
                    count++;
                    arr = arraySizeGrow(arr);
                    arr[count] = prod % 10;
                }
                if(count == 0 && flag == false)
                {
                    arr[count] = prod % 10;
                    flag = true;
                }
                prod = prod / 10;
            }
            if(arr.length == 10) break;
            depth++;
        }
        return depth;
    }
    static boolean findNum(int[] a, int n)
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] == n) return true;
        return false;
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

