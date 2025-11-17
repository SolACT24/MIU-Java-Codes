/* A number with a base other than 10 can be written using its base as a subscript. For example, 1011 base 2  represents 
the binary number 1011 which can be converted to a base 10 number as follows:
	(1 * 2 ^ 0) + (1 * 2 ^ 1) + (0 * 2 ^ 2) + (1 * 2 ^ 3) = 1 + 2 + 0 + 8 = 11 base 10
Similarily, the base 3 number 112 can be converted to base 10 as follows:   
	 (2 * 3 ^ 0) + (1 * 3 ^ 1) + (1 * 3 ^ 2) = 2 + 3 + 9 = 14 base 10
And the base 8 number 325 can be converted to base 10 as follows:
	(5 * 8 ^ 0) + (2 * 8 ^ 1) + (3 * 8 ^ 2) = 5 + 16 + 192 = 213 base 10
Write a method named convertToBase10 that  converts its <array, base> arguments to a base 10 number if the input is legal for the specified base. 
If it is not, it returns -1.
Some examples:
convertToBase10(new int[  ] {1, 0, 1, 1}, 2) returns 11
convertToBase10(new int[  ] {1, 1, 2}, 3) returns 14
convertToBase10(new int[  ] {3, 2, 5}, 8) returns 213
convertToBase10 (new int[ ] {3, 7, 1},  6) returns 0 because 371 is not a legal base 6 number.
Your convertToBase10 method must call the isLegalNumber method that you wrote for question 2.
If you are programming in Java or C#, the function signature is:
	int convertToBase10(int[] a, int base)
*/
public class ConvertToBase10Demo1 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(convertToBase10(new int[] {1,0,1,1}, 2)); //11
        System.out.println(convertToBase10(new int[] {1,1,2}, 3)); //14
        System.out.println(convertToBase10(new int[] {3,2,5}, 8)); //213
        System.out.println(convertToBase10(new int[] {3,7,1}, 6)); //-1 (each digit shouldn't be greater than or equal to its base!)
        System.out.println(convertToBase10(new int[] {3,-1,7,1}, 6)); //-1 (each digit shouldn't be greater than or equal to its base!)
    }
    static int convertToBase10(int[] a, int base)
    {
        if(isLegalNumber(a, base) == false) return -1;

        int pow = 0, sum = 0;
        for(int i = a.length-1; i >= 0; i--)
        {
            int count = 0, prod = 1;
            while(count < pow)
            {
                prod = prod * base;
                count++;
            }
            sum += a[i] * prod;
            pow++;
        }
        return sum;
    }
    static boolean isLegalNumber(int[] a, int base)
    {
        
        for(int i = 0; i < a.length; i++)
            if(a[i] >= base || a[i] < 0) return false;

        return true;
    }
}