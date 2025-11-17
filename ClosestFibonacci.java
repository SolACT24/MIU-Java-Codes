/* The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
The first and second numbers are 1 and after that ni = ni-2 + ni-1, e.g., 34 = 13 + 21. A number in the sequence is called a Fibonacci number. 
Write a method with signature int closestFibonacci(int n) which returns the largest Fibonacci number that is less than or equal to its argument. 
For example, closestFibonacci(12) returns 8 because 8 is the largest Fibonacci number less than 12 and 
closestFibonacci(33) returns 21 because 21 is the largest Fibonacci number that is less than 33. closestFibonacci(34) should return 34. 
If the argument is less than 1 return 0. 
Your solution must not use recursion because unless you cache the Fibonacci numbers as you find them, the recursive solution recomputes the same Fibonacci number many times.
*/
public class ClosestFibonacci 
{
    public static void main(String[] args)
    {
        System.out.println(closestFibonacci(12)); //8
        System.out.println(closestFibonacci(33)); //21
        System.out.println(closestFibonacci(34)); //34
    }  
    static int closestFibonacci(int n)
    {
        int sum = 0, start = 0, prev = 1;
        while(true)
        {
            sum = start + prev;
            if(sum >= n) break;
            start = prev;
            prev = sum;
        }
        if(sum > n) return prev;

        return sum;
    }
}
