/* A Bunker array is an array that contains the value 1 if and only if it contains a prime number. 
The array {7, 6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1.  
The array {7, 6, 10} is not a Bunker array because it contains a prime number (7) but does not contain a 1. 
The array {6, 10, 1} is not a Bunker array because it contains a 1 but does not contain a prime number.
 
It is okay if a Bunker array contains more than one value 1 and more than one prime, so the array {3, 7, 1, 8, 1} 
is a Bunker array (3 and 7 are the primes). Write a function named isBunker that returns 1 if its array argument is a Bunker array 
and returns 0 otherwise. You may assume the existence of a function named isPrime that returns 1 if its argument is a prime and 
returns 0 otherwise. You do not have to write isPrime, you can just call it.
 
If you are programming in Java or C#, the function signature is
   int isBunker(int[] a)
*/
public class BunkerArray3Demo 
{
    public static void main(String[] args)
    {
        System.out.println(isBunker(new int[] {7, 6, 10, 1})); //1
        System.out.println(isBunker(new int[] {7, 6, 10})); //0
        System.out.println(isBunker(new int[] {6, 10, 1})); //0
    }
    static int isBunker(int[] a)
    {
        for(int i = 0; i < a.length; i++)
            if(isPrime(a[i]) == true && findNum(a, 1) == true) return 1;

        return 0;
    }
    static boolean isPrime(int n)
    {
        if(n < 2) return false;

        for(int i = 2; i < n/2; i++)
            if(n % i == 0) return false;
        
        return true;
    }
    static boolean findNum(int[] a, int n)
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] == n) return true;
        
        return false;
    }
}
