/*A number n is called prime happy if there is at least one prime less than n and the sum of all primes less than n is evenly divisible by n.
Recall that a prime number is an integer > 1 which has only two integer factors, 1 and itself.

The function prototype is:
    int isPrimeHappy(int n);

Examples:
if n is	    return	because
5	        1	    because 2 and 3 are the primes less than 5, their sum is 5 and 5 evenly divides 5.
25	        1	    because 2, 3, 5, 7, 11, 13, 17, 19, 23 are the primes less than 25, their sum is 100 and 25 evenly divides 100
32	        1	    because 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 are the primes less than 32, their sum is 160 and 32 evenly divides 160
8	        0	    because 2, 3, 5, 7 are the primes less than 8, their sum is 17 and 8 does not evenly divide 17.
2	        0	    because there are no primes less than 2.
*/
import java.util.Arrays;
public class PrimeHappyDemo2 //Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(isPrimeHappy(5)); //1
        System.out.println(isPrimeHappy(25)); //1
        System.out.println(isPrimeHappy(32)); //1
        System.out.println(isPrimeHappy(8)); //0
        System.out.println(isPrimeHappy(2)); //0
    }
    static int isPrimeHappy(int n)
    {
        int sum = 0;
        for(int i = 2; i < n; i++)
            if(isPrime(i) == true) sum += i;
        //System.out.println("Sum: "+sum);
        if(sum != 0 && sum % n == 0) return 1;

        return 0;
    }
    static boolean isPrime(int n)
    {
        if(n < 2) return false;

        for(int i = 2; i <= n/2; i++)
            if(n % i == 0) return false;
        
        return true;   
    }
}