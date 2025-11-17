/* A positive, non-zero number n is a factorial prime if it is equal to factorial(n) + 1 for some n and it is prime. // Is itfactorial(n-1) + 1???????
Recall that factorial(n) is equal to 1 * 2 * ... * n-1 * n. If you understand recursion, the recursive definition is 
factorial(1) = 1; 
factorial(n) = n*factorial(n-1).
For example, factorial(5) = 1*2*3*4*5 = 120. 

Recall that a prime number is a natural number which has exactly two distinct natural number divisors: 1 and itself. 

Write a method named isFactorialPrime which returns 1 if its argument is a factorial prime number, otherwise it returns 0.

The signature of the method is:
    int isFactorialPrime(int n)
Examples:
if n is 	then function returns 	reason 
2	            1	                because 2 is prime and is equal to factorial(1) + 1
3	            1	                because 3 is prime and is equal to factorial(2) + 1
7	            1	                because 7 prime and is equal to factorial(3) + 1
8	            0	                because 8 is not prime
11	            0	                because 11 does not equal factorial(n) + 1 for any n (factorial(3) = 6, factorial(4) = 24)
721	            0	                because 721 is not prime (its factors are 7 and 103)
*/
public class FactorialPrimeDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isFactorialPrime(2)); //1
        System.out.println(isFactorialPrime(3)); //1
        System.out.println(isFactorialPrime(7)); //1
        System.out.println(isFactorialPrime(8)); //0
        System.out.println(isFactorialPrime(11)); //0
        System.out.println(isFactorialPrime(721)); //0
    }
    static int isFactorialPrime(int n)
    {
        if(n < 2) return 0;

        if(isPrime(n) == true  && fact(n) == true) return 1;

        return 0;
    }
    static boolean fact(int n)
    {
        int prod = 1, i = 1;
        while(true)
        {
            prod = prod * i;
            if(prod+1 >= n) break;
            i++;
        }
        //System.out.println(n+", Prod: "+(prod+1));
        if(prod+1 == n) return true;
        
        return false;
    }
    static boolean isPrime(int n)
    {
        if(n < 2) return false;

        for(int i = 2; i <= n/2; i++)
            if(n % i == 0) return false;
        return true;
    }
}