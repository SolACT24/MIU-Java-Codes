/* Write a function that takes a number of integers as an argument and returns a largest factor number.

The signature of the function is:
    int fun1(int number)
Examples:
If input number is          return
168                         84
121                         11
7                           1
1                           1
0                           0
-147                        0
11                          1
00012                       6 //????
19                          1
*/
import java.util.Arrays;
public class LargestFactorNumberDemo4 
{
    public static void main(String args[])
    {
        System.out.println(fun1(168)); //84
        System.out.println(fun1(121)); //11
        System.out.println(fun1(7)); //1
        System.out.println(fun1(1)); //1
        System.out.println(fun1(0)); //0
        System.out.println(fun1(-147)); //0
        System.out.println(fun1(11)); //1
        System.out.println(fun1(00012)); // 6 - I think the answer should be 5 because the given number is an octal number!
        System.out.println(fun1(19)); //1

        System.out.println(fun1(00012)); //5
        System.out.println(fun1(12)); //6
    }
    static int fun1(int number)
    {
        if(number <= 0) return 0;

        int value = 1;
        for(int i = number/2; i >= 1; i--)
        {
            if(number % i == 0) 
            {
                value = i;
                break;
            }
        }
        return value;
    }    
}
