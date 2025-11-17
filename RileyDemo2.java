/* A Riley number is an integer whose digits are all even. 
For example, 2426 is a Riley number but 3224 is not.
Write a function named isRiley that returns 1 if its integer argument is a Riley number otherwise it returns 0.
 
The function signature is:
   int isRiley(int n)
*/
public class RileyDemo2 //
{
    public static void main(String[] args)
    {
        System.out.println(isRiley(2426)); //1
        System.out.println(isRiley(3224)); //0
    }
    static int isRiley(int n)
    { 
        while(n != 0)
        {
            int rem = n % 10;
            //System.out.println("Checking ... "+rem);
            if(rem % 2 != 0) return 0;
            n = n / 10;
        }
        return 1;
    }
}
