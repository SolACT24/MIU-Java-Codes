/* A primeproduct is a positive integer that is the product of exactly two primes greater than 1. 
For example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1. 

Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a primeproduct, otherwise it returns 0. 
Recall that a prime number is a positive integer with no factors other than 1 and itself. 

You may assume that there exists a function named isPrime(int m) that returns 1 if its m is a prime number. 
You do not need to write isPrime. You are allowed to use this function.

The function signature: 
   int isPrimeProduct(int n)
*/
import java.util.Arrays;
public class PrimeProductDemo2 //Perfect Answer!!!!! Because it is possible to check whether the product of the primes is equal to n or not!
{
    public static void main(String[] args)
    {
        System.out.println(isPrimeProduct(22)); //1
        System.out.println(isPrimeProduct(30)); //0
        System.out.println(isPrimeProduct(14)); //1
        System.out.println(isPrimeProduct(20)); //0
        System.out.println(isPrimeProduct(10)); //1
        System.out.println(isPrimeProduct(6)); //1
    }
    static int isPrimeProduct(int n)
    {
        int[] arr = new int[1];

        int i = 2, count = 0, num = n;
        boolean flag = false;
        while(num != 1)
        { 
            if(num % i == 0 && isPrime(i) == 1)
            {
                if(flag == true)
                {
                    count++;
                    arr = arraySizeGrow(arr);
                    arr[count] = i;
                } 
                if(count == 0 && flag == false)
                {
                    arr[count] = i;
                    flag = true; 
                } 
                num = num / i;
            }  
            else i++;
        }
        //System.out.println("n: "+n);
        //System.out.println(Arrays.toString(arr));

        int prod = 1;
        for(int j = 0; j < arr.length; j++)
            prod *= arr[j];

        if(arr.length == 2 && prod == n) return 1; //arr.length == 2 means the number of primes should be exactly 2 and
                                                   //prod == n means the product of the primes should be equal to n

        return 0;
    }
    static int isPrime(int m)
    {
        if(m < 2) return 0;

        for(int i = 2; i <= m/2; i++)
            if(m % i == 0) return 0;
        
        return 1;
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
