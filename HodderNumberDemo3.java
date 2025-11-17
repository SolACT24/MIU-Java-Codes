/* A hodder number is one that is prime and is equal to 2^j-1 for some j. For example, 31 is a hodder number because 31 is prime 
and is equal to 2^5-1 (in this case j = 5). The first 4 hodder numbers are 3, 7, 31, 127.

Write a function with signature int isHodder(int n) that returns 1 if n is a hodder number, otherwise it returns 0. 
Recall that a prime number is a whole number greater than 1 that has only two whole number factors, itself and 1.
*/
public class HodderNumberDemo3 //Perfect Answer!
{
    public static void main(String[] args)
    { 
        System.out.println(isHodder(3));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));        
        System.out.println(isHodder(127));  
        System.out.println(isHodder(2));
        System.out.println(isHodder(32));
    }
    static int isHodder(int n)
    {
       int prod = 1;
       while(prod-1 < n)
       {
           prod = prod*2;
       } 
       if(prod-1 == n && isPrime(prod-1) == true) return 1;

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