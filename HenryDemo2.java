/* A perfect number is one that is the sum of its factors, excluding itself. The 1st perfect number is 6 because 6 = 1 + 2 + 3. 
The 2nd perfect number is 28 which equals 1 + 2 + 4 + 7 + 14. The third is 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248. 
In each case, the number is the sum of all its factors excluding itself. 
Write a method named henry that takes two integer arguments, i and j and returns the sum of the ith and jth perfect numbers. 
So for example, henry (1, 3) should return 502 because 6 is the 1st perfect number and 496 is the 3rd perfect number and 6 + 496 = 502.

The function signature is:
    int henry(int i, int j)

You do not have to worry about integer overflow, i.e., you may assume that each sum that you have to compute can be represented as a 31 bit integer. 
Hint: use modulo arithmetic to determine if one number is a factor of another.
*/
import java.util.Arrays;
public class HenryDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isHenry(1, 2)); //34
        System.out.println(isHenry(1, 3)); //502
        System.out.println(isHenry(2, 3)); //524
        System.out.println(isHenry(1, 4)); //8134      
        System.out.println(isHenry(2, 4)); //8156
        System.out.println(isHenry(3, 4)); //8624        
        //System.out.println(isHenry(1, 5)); //I think it doesn't work for j > 4!
    }
    static int isHenry(int m, int j)
    {
        int[] arr = new int[1];

        int count = 0, num = 2;
        boolean flag = false;
        while(true)
        {
            int sum = 0;
            for(int i = 1; i <= num/2; i++)
                if(num % i == 0) sum += i;
        
            if(sum == num && flag == true) 
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = num;
            }           
            if(sum == num && count == 0 && flag == false)
            {
                arr[count] = num;
                flag = true;
            }
            if(count == j-1) break;
            num++;
        }
        //System.out.println(Arrays.toString(arr));

        return arr[m-1]+arr[j-1];
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