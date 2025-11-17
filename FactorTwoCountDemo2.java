/* Write a function named factorTwoCount that returns the number of times that 2 divides the argument.
For example, factorTwoCount(48) returns 4 because
48/2 = 24, 24/2 = 12, 12/2 = 6, 6/2 = 3 & 2 does not divide 3 evenly.
 
Another example: factorTwoCount(27) returns 0 because 2 does not divide 27.
 
The function signature is
   int factorTwoCount(int n);
*/
public class FactorTwoCountDemo2
{
    public static void main(String[] args)
    {
        System.out.println(factorTwoCount(48)); //4
        System.out.println(factorTwoCount(27)); //0
        System.out.println(factorTwoCount(12)); //2
        System.out.println(factorTwoCount(120)); //3
        System.out.println(factorTwoCount(64)); //6
    }
    static int factorTwoCount(int n)
    {
        if(n < 2) return 0;

        int countTwo = 0;
        while(true) // n % 2 == 0
        {
            if(n % 2 == 0) countTwo++;
            n = n / 2;
            if(n % 2 != 0) break; //
        }
        return countTwo;
    }
}