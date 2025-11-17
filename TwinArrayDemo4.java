/* Consider the prime number 11. Note that 13 is also a prime and 13 – 11 = 2. So, 11 and 13 are known as twin primes. 
Similarly, 29 and 31 are twin primes. So is 71 and 73. However, there are many primes for which there is no twin. Examples are 23 & 67. 

A twin array is defined to be an array in which every prime that has a twin appear with a twin. Some examples are:
    {3, 5, 8, 10, 27}, 	     // 3 and 5 are twins and both are present
    {11, 9, 12, 13, 23},     // 11 and 13 are twins and both are present, 23 has no twin
    {5, 3, 14, 7, 18, 67}.   // 3 and 5 are twins, 5 and 7 are twins, 67 has no twin

The following are NOT twin arrays:
    {13, 14, 15, 3, 5} 	 // 13 has a twin prime and it is missing in the array
    {1, 17, 8, 25, 67}   // 17 has a twin prime and it is missing in the array

Write a function named isTwin(int[] a) that returns 1 if its array argument is a Twin array, otherwise it returns 0. 
*/
import java.util.Arrays;
public class TwinArrayDemo4 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(isTwin(new int[] {3, 5, 8, 10, 27})); // 3 & 5 are primes and twin primes --- return 1
        System.out.println(isTwin(new int[] {11, 9, 12, 13, 23})); // 11, 13, & 23 are primes but 23 has no twin
        System.out.println(isTwin(new int[] {5, 3, 14, 7, 18, 67})); // 3, 5, 7, & 67 are primes but 67 has no twin
        System.out.println(isTwin(new int[] {13, 14, 15, 3, 5})); // 3, 5, & 13 are primes but 13 has no twin
        System.out.println(isTwin(new int[] {1, 17, 8, 25, 67})); // 17 & 67 are primes but both have no twins
        System.out.println(isTwin(new int[] {4, 7, 9, 6, 5})); // 5 & 7 are primes and twin primes --- return 1
    }
    static int isTwin(int[] a)
    {
        int[] arr = new int[1];

        int count = 0; boolean flag = false;
        for(int i = 0; i < a.length; i++)
        {
            if(flag == true && isPrime(a[i]) == true)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = a[i];
            }
            if(count == 0 && flag == false && isPrime(a[i]) == true)
            {
                arr[count] = a[i];
                flag = true;
            }
        } 
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++)
        {
            boolean primeFlag = false;
            for(int j = 0; j < arr.length; j++)
                if(Math.abs(arr[i]-arr[j]) == 2) primeFlag = true;
            if(primeFlag == false) return 0;
        }
        return 1;
    }
    static boolean isPrime(int n)
    {
        if(n < 2) return false;
        
        for(int i = 2; i <= n/2; i++)
            if(n % i == 0) return false;
        
        return true;
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
