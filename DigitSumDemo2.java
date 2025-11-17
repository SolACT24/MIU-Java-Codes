/* Write a function named isDigitSum that returns 1 if sum of all digits of the first argument is less than the second argument 
and 0 otherwise. For example isDigitSum(32121,10 ) would return 1 because 3+2+1+2+1 = 9 < 10. 

More examples:
    isDigitSum(32121,9) returns 0, 
    isDigitSum(13, 6) returns 1, 
    isDigitSum(3, 3) returns 0

The function should return -1 if either argument is negative, so isDigitSum(-543, 3) returns -1.

The function signature is: 
	int isDigitSum(int n, int m)
*/
public class DigitSumDemo2 //Perfect Answer
{
    public static void main(String[] args)
    {
        System.out.println(isDigitSum(32121, 9)); //0
        System.out.println(isDigitSum(13, 6)); //1
        System.out.println(isDigitSum(3, 3)); //0
        System.out.println(isDigitSum(-543, 3)); //-1
        System.out.println(isDigitSum(32121, 10)); //1        
    }
    static int isDigitSum(int n, int m)
    {
        if(n < 0) return -1;

        int sum = 0, num = n;
        while(true)
        {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
            if(num == 0) break;
        }
        if(sum < m) return 1;

        return 0;
    }
}
