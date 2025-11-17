/*A number n > 0 is called cube-powerful if it is equal to the sum of the cubes of its digits.
Write a function named isCubePowerful that returns 1 if its argument is cube-powerful; otherwise it returns 0.
The function prototype is: 
    int isCubePowerful(int n);

Hint: use modulo 10 arithmetic to get the digits of the number.
Examples:
if n is	    return	    because
153	          1	        because 153 = 1^3 + 5^3 + 3^3
370	          1	        because 370 = 3^3 + 7^3 + 0^3
371	          1	        because 371 = 3^3 + 7^3 + 1^3
407	          1	        because 407 = 4^3 + 0^3 + 7^3
87	          0	        because 87 != 8^3 + 7^3
0	          0	        because n must be greater than 0.
-81	          0	        because n must be greater than 0.
*/
public class CubePowerfulDemo2 //Perfect Answer
{
    public static void main(String[] args)
    {
        System.out.println(isCubePowerful(153)); //1
        System.out.println(isCubePowerful(370)); //1
        System.out.println(isCubePowerful(371)); //1
        System.out.println(isCubePowerful(407)); //1
        System.out.println(isCubePowerful(87)); //0
        System.out.println(isCubePowerful(0)); //0
        System.out.println(isCubePowerful(-81)); //0
    }
    static int isCubePowerful(int n)
    {
        if(n <= 0) return 0;

        int sum = 0, num = n;
        while(true)
        {
            int rem = num % 10;
            sum += rem*rem*rem;
            num = num/10;
            if(num == 0) break;
        }
        //System.out.println("Num: "+n+", Sum: "+sum);
        if(sum == n) return 1;

        return 0;
    }
}