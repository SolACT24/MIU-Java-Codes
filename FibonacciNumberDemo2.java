/* A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21, . . . 
Note that first two Fibonacci numbers are 1 and any Fibonacci number other than the first two is the sum of the previous twoFibonacci numbers. 
For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on. Write a function named isFibonacci that returns 1 
if its integer argument is a Fibonacci number, otherwise it returns 0.
 
The signature of the function is
   int isFibonacci (int n)
*/
public class FibonacciNumberDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(2));
        System.out.println(isFibonacci(3));
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(8));
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(21));
        System.out.println(isFibonacci(34));
        System.out.println(isFibonacci(55));
        System.out.println(isFibonacci(550));
    }
    static int isFibonacci(int n)
    {
        if(n < 1) return 0;
        if(n == 1) return 1;

        int sum = 0, curr = 1, prev = 1;
        while(true)
        {
            sum = curr + prev;
            prev = curr;
            curr = sum;
            if(sum >= n) break;
        }
        //System.out.println("Sum: "+sum);
        if(sum == n) return 1;

        return 0;
    }
}
