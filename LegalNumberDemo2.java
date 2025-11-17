/* A number with a base other than 10 can be written using its base as a subscript. For example, 1011 base 2  represents the binary number 1011 which can be 
converted to a base 10 number as follows:
	(1 * 2 ^ 0) + (1 * 2 ^ 1) + (0 * 2 ^ 2) + (1 * 2 ^ 3) = 1 + 2 + 0 + 8 = 11 base 10
Similarily, the base 3 number 112 base 3 can be converted to base 10 as follows:
	 (2 * 3 ^ 0) + (1 * 3 ^ 1) + (1 * 3 ^ 2) = 2 + 3 + 9 = 14 base 10
And the base 8 number 325 base 8 can be converted to base 10 as follows:
	(5 * 8 ^ 0) + (2 * 8 ^ 1) + (3 * 8 ^ 2) = 5 + 16 + 192 = 213 base 10

Write a method named isLegalNumber that takes two arguments. The first argument is an array whose elements are the digits of the number to test. 
The second argument is the base of the number represented by the first argument. The method returns 1 if the number represented by the array is a legal number 
in the given base, otherwise it returns 0. 

For example the number 321 base 4 can be passed to the method as follows:
        isLegalNumber(new int[] {3, 2, 1},  4)
This call will return 1 because 321 base 4 is a legal base 4 number. However, since all digits of a base n number must be less than n, 
the following call will return 0 because 371 base 6 is not a legal base 6 number (the digit 7 is not allowed).
      isLegalNumber(new int[] {3, 7, 1},  6)

If you are programming in Java or C#, the signature of the method is:
	int isLegalNumber(int[] a, int base)
*/
public class LegalNumberDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isLegalNumber(new int[] {3, 2, 1}, 4)); //1       
        System.out.println(isLegalNumber(new int[] {3, 7, 1}, 6)); //0       
        System.out.println(isLegalNumber(new int[] {1, 0, 1, 1}, 2)); //1
        System.out.println(isLegalNumber(new int[] {1, 1, 2}, 3)); //1
        System.out.println(isLegalNumber(new int[] {3, 2, 5}, 8)); //1
    }
    static int isLegalNumber(int[] a, int base)
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] >= base || a[i] < 0) return 0;
        return 1;
    }
}
