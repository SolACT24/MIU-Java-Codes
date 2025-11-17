/* Write a function named isSquare that returns 1 if its integer argument is a square of some integer, otherwise it returns 0. 
Your function must not use any function or method (e.g. sqrt) that comes with a runtime library or class library!

The signature of the function is:
    int isSquare(int n)
Examples:
if n is         return  reason
4               1       because 4 = 2*2
25              1       because 25 = 5*5
-4              0       because there is no integer that when squared equals -4. (note, -2 squared is 4 not -4)
8               0       because the square root of 8 is not an integer.
0               1       because 0 = 0*0
*/
public class SquareNumberDemo2 //Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(isSquare(4)); //1
        System.out.println(isSquare(25)); //1
        System.out.println(isSquare(-4)); //0
        System.out.println(isSquare(8)); //0
        System.out.println(isSquare(0)); //1
        System.out.println(isSquare(49)); //1
    }
    static int isSquare(int n)
    {
        if(n < 0) return 0;

        int prod = 0;
        for(int i = 1; i <= n/2; i++)
        {
            prod = i * i;
            if(prod >= n) break;
        }
        if(prod == n) return 1;

        return 0;
    }
}
