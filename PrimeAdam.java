/* A Prime-Adam integer is a positive integer (without leading zeroes) which is a prime as well as an Adam number.

Prime number: A number which has only two factors, i.e. 1 and the number itself. Example: 2, 3, 5, 7, etc.

Adam number: The square of a number and the square of its reverse are reverse to each other. Example: If n = 13 and reverse of ‘n’ is 31, then, 13^2 = 169, 
and 31^2 = 961 which is reverse of 169. Thus, 13 is an Adam number.

Accept two positive integers m and n, where m is less than n as user input. 
Display all Prime-Adam integers that are in the range between m and n (both inclusive) and output them along with the frequency, in the format given below:
INPUT: m = 5, n = 100
OUTPUT: The Prime-Adam integers are: 11, 13, 31
Frequency of Prime-Adam integers is: 3

INPUT: m = 100, n = 200
OUTPUT: The Prime-Adam integers are: 101, 103, 113
Frequency of Prime-Adam integers is: 3

INPUT: m = 50, n = 70
OUTPUT: The Prime-Adam integers are: NULL
Frequency of Prime-Adam integers is: 0

INPUT: m = 700, n = 450
OUTPUT: Invalid Input.
*/
import java.util.Arrays;
import java.util.Scanner;
public class PrimeAdam //Simplified!!!
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value m: ");
        int m = sc.nextInt();
        
        System.out.print("Enter the value n: ");
        int n = sc.nextInt();

        int[] result = isPrimeAdam(m, n);
        if(result == null) System.out.println("Invalid input!");
        else if(result.length == 0) 
        {
            System.out.print("The Prime-Adam integers are: ");
            System.out.print("NULL");
            System.out.println("\nFrequency of Prime-Adam integers is: "+result.length);
        }
        else 
        {
            System.out.print("The Prime-Adam integers are: ");
            System.out.print(Arrays.toString(result));
            System.out.println("\nFrequency of Prime-Adam integers is: "+result.length);
        }
    }
    static int[] isPrimeAdam(int m, int n)
    {
        if(m > n) return null;
        
        int[] arr = new int[1];
        
        int count = 0; boolean flag = false;
        for(int i = m; i <= n; i++)
        {
            if(isPrime(i) == true && reverseFunc(i*i) == reverseFunc(i) * reverseFunc(i))
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
            }
        }
        int[] output = {};
        if(count == 0 && flag == false) return output;

        return arr;
    }
    static int reverseFunc(int num)
    {
        int[] arr = new int[1];

        int squareM = num, count = 0;
        boolean flag = false;
        while(squareM != 0)
        {
            if(flag == true)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = squareM % 10;
            }
            if(count == 0 && flag == false)
            {
                arr[count] = squareM % 10;
                flag = true;
            }
            squareM = squareM / 10;
        }
        int sum = 0, counter = arr.length-1;
        for(int i = 0; i < arr.length; i++)
        {
            int j = 0, prod = 1;
            while(j < counter)
            {
                prod = prod * 10;
                j++;
            }
            sum += prod*arr[i];
            counter--;
        }
        return sum;
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