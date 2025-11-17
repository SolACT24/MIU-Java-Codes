/* An array is defined to be odd-valent if it meets the following two conditions:
    a. It contains a value that occurs more than once
    b. It contains an odd number

For example {9, 3, 4, 9, 1} is odd-valent because 9 appears more than once and 3 is odd. Other odd-valent arrays are {3, 3, 3, 3} and 
{8, 8, 8, 4, 4, 7, 2}

The following arrays are not odd-valent:
{1, 2, 3, 4, 5} - no value appears more than once.
{2, 2, 2, 4, 4} - there are duplicate values but there is no odd value.

Write a function name isOddValent that returns 1 if its array argument is odd-valent, otherwise it returns 0.

If you are programming in Java or C#, the function prototype is:
   int isOddValent(int[] a);
*/
public class OddValentDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isOddValent(new int[] {9, 3, 4, 9, 1})); //1
        System.out.println(isOddValent(new int[] {3, 3, 3, 3})); //1
        System.out.println(isOddValent(new int[] {8, 8, 8, 4, 4, 7, 2})); //1
        System.out.println(isOddValent(new int[] {1, 2, 3, 4, 5})); //0
        System.out.println(isOddValent(new int[] {2, 2, 2, 4, 4})); //0
    }
    static int isOddValent(int[] a)
    {  
        int oddCount = 0, maxFreq = 0;
        for(int i = 0; i < a.length; i++)
        {
            int freq = 0;
            if(a[i] % 2 != 0) oddCount++;
            for(int j = 0; j < a.length; j++)
                if(a[i] == a[j]) freq++; 

            if(freq > maxFreq) maxFreq = freq;
        }
        if(oddCount >= 1 && maxFreq > 1) return 1;

        return 0;
    }
}
