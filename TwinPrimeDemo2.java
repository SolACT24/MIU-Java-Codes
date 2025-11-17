/* A twin prime is a prime number that differs from another prime number by 2. 

Write a function named isTwinPrime with an integer parameter that returns 1 if the parameter is a twin prime, otherwise it returns 0. 
Recall that a prime number is a number with no factors other than 1 and itself. 
Examples:
number	    is twin prime?
  5	        yes, 5 is prime, 5-2 or 5+2 is prime
  7	        yes, 7 is prime, 7-2 is prime
  53	    no, 53 is prime, but neither 53-2 nor 53+2 is prime
  9	        no, 9 is not prime

The function signature is:
    int isTwinPrime(int n)
*/
public class TwinPrimeDemo2 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(isTwinPrime(5)); //1
        System.out.println(isTwinPrime(7)); //1
        System.out.println(isTwinPrime(53)); //0
        System.out.println(isTwinPrime(9)); //0
    }
    static int isTwinPrime(int n)
    {
       if(isPrime(n) == true && (isPrime(n-2) == true || isPrime(n+2) == true)) return 1;
       
       return 0;
    }
    static boolean isPrime(int num)
    {
        if(num < 2) return false;

        for(int i = 2; i <= num/2; i++)
            if(num % i == 0) return false;
        
        return true;
    }
}
