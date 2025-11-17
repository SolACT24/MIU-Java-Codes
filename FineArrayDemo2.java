/* A twin prime is a prime number that differs from another prime number by 2. A Fine array is defined to be an array 
in which every prime in the array has its twin in the array. So {4, 7, 9, 6, 5} is a Fine array because 7 and 5 occurs. 
Note that {4, 9, 6, 33} is a Fine array since there are no primes. On the other hand, {3, 8, 15} is not a Fine array 
since 3 appear in the array but its twin 5 is not in the array.

Write a function named isFineArray that returns 1 if its array argument is a Fine array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isFineArray(int[] a)

You may assume that there exists a function isPrime that returns 1 if it argument is a prime, otherwise it returns 0. 
You do not have to write this function.
*/
import java.util.Arrays;
public class FineArrayDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isFineArray(new int[] {3, 5, 8, 10, 27})); // 3 & 5 are primes and twin primes --- return 1
        System.out.println(isFineArray(new int[] {11, 9, 12, 13, 23})); // 11, 13, & 23 are primes but 23 has no twin --- return 0
        System.out.println(isFineArray(new int[] {5, 3, 14, 7, 18, 67})); // 3, 5, 7, & 67 are primes but 67 has no twin --- return 0
        System.out.println(isFineArray(new int[] {13, 14, 15, 3, 5})); // 3, 5, & 13 are primes but 13 has no twin --- return 0
        System.out.println(isFineArray(new int[] {1, 17, 8, 25, 67})); // 17 & 67 are primes but both have no twins --- return 0
        System.out.println(isFineArray(new int[] {4, 7, 9, 6, 5})); // 5 & 7 are primes and twin primes --- return 1
        System.out.println(isFineArray(new int[] {4, 9, 6, 33})); // no primes --- return 1
        System.out.println(isFineArray(new int[] {3, 8, 15})); // only 3 prime but has no twin --- return 0 
    }
    static int isFineArray(int[] a)
    {
        int[] arr = new int[1];

        int count = 0;
        boolean flag = false;
        for(int i = 0; i < a.length; i++)
        {
            if(flag == true && isPrime(a[i]) == 1)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = a[i];
            }
            if(count == 0 && flag == false && isPrime(a[i]) == 1)
            {
                arr[count] = a[i];
                flag = true;
            }
        }
        //System.out.println(Arrays.toString(arr));

        if(arr.length == 1 && isPrime(arr[0]) == 1) return 0;

        if(count == 0) return 1; //If there are no primes, then it fine array!
        else
        {
            for(int i = 0; i < arr.length; i++)
            {
                boolean newFlag = false;
                for(int j = 0; j < arr.length; j++)
                {
                    if(Math.abs(arr[i] - arr[j]) == 2)
                    {
                        //System.out.println(arr[i]+" - "+arr[j]+" = "+Math.abs(arr[i] - arr[j]));
                        newFlag = true;
                        break; // To make efficient
                    }
                }   
                if(newFlag == false) return 0;
            }
        }
        return 1;
    }
    static int isPrime(int n)
    {
        if(n < 2) return 0;

        for(int i = 2; i <= n/2; i++)
            if(n % i == 0) return 0;
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
