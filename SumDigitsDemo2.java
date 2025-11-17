/* Write a function named sumDigits that sums the digits of its integer argument. 

For example, sumDigits(3114) returns 9, sumDigits(-6543) returns 18 and sumDigits(0) returns 0. 

The signature of the function is:
   int sumDigits(int n)
*/
public class SumDigitsDemo2 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(sumDigits(3114)); //9
        System.out.println(sumDigits(-6543)); //18
        System.out.println(sumDigits(0)); //0
        System.out.println(sumDigits(-8)); //8
    }
    static int sumDigits(int n)
    {
        if(n < 0) n = Math.abs(n);

        int sum = 0;
        while(n != 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
