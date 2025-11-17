/* An array is defined to be odd-heavy if it contains at least one odd element and every odd element is greater than every even element. 
So, {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9) are greater than all the even elements. And {11, 4, 9, 2, 3, 10} 
is not odd-heavy because the even element 10 is greater than the odd element 9.  

Write a function called isOddHeavy that accepts an integer array and returns 1 if the array is odd-heavy; otherwise it returns 0.  
Some other examples: {1} is odd-heavy, {2} is not odd-heavy, {1, 1, 1, 1} is odd-heavy, {2, 4, 6, 8, 11} is odd-heavy, {-2, -4, -6, -8, -11} is not odd-heavy. 

If you are programming in Java or C#, the function signature is:  
    int isOddHeavy(int[] a)
*/
public class OddHeavyDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isOddHeavy(new int[] {1})); //1
        System.out.println(isOddHeavy(new int[] {2})); //0
        System.out.println(isOddHeavy(new int[] {1, 1, 1, 1, 1, 1})); //1
        System.out.println(isOddHeavy(new int[] {2, 4, 6, 8, 11})); //1
        System.out.println(isOddHeavy(new int[] {-2, -4, -6, -8, -11})); //0
        System.out.println(isOddHeavy(new int[] {11, 4, 9, 2, 8})); //1
        System.out.println(isOddHeavy(new int[] {11, 4, 9, 2, 3, 10})); //0
    }
    static int isOddHeavy(int[] a)
    {
        int oddCount = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length; j++)
                if(a[i] % 2 != 0 && a[j] % 2 == 0 && a[i] <= a[j]) return 0;

            if(a[i] % 2 != 0) oddCount++; //It counts the number of odd elements in the array!
        }
        if(oddCount == 0) return 0; //The array MUST contain at least 1 odd element!

        return 1;
    }
}