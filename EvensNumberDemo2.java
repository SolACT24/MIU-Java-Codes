/* Evens number is an integer whose digits are all even. For example 2426 is an Evens number but 3224 is not.
Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it returns 0.

The function signature is:
   int isEvens(int n)
*/
public class EvensNumberDemo2 // Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isEvens(2426));
        System.out.println(isEvens(3224));
    }
    static int isEvens(int n)
    {
        while(n != 0)
        {
            int rem = n % 10;
            if(rem % 2 != 0) return 0;
            n = n / 10;
        }
        return 1;
    }
}
