/* A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9. 
For example, 24 is digit-increasing because it equals 2 + 22 (here n = 2). 
Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise, it returns 0. 

The signature of the method is: 
    int isDigitIncreasing(int n)
Examples:
if n is 	then function returns 	reason 
7	        1	                    because 7 = 7 (here n is 7)
36	        1	                    because 36 = 3 + 33
984	        1	                    because 984 = 8 + 88 + 888
7404	    1	                    because 7404 = 6 + 66 + 666 + 6666
*/
public class DigitIncreasingDemo3 //Perfect Answer
{
    public static void main(String[] args)
    {
        System.out.println(isDigitIncreasing(7)); //1
        System.out.println(isDigitIncreasing(36)); //1
        System.out.println(isDigitIncreasing(984)); //1
        System.out.println(isDigitIncreasing(7404)); //1
        System.out.println(isDigitIncreasing(100)); //0
        System.out.println(isDigitIncreasing(24)); //1
    }
    static int isDigitIncreasing(int n)
    {
        for(int i = 1; i < 10; i++)
        {
            int sum = 0, prod = i;
            while(true)
            {
                sum += prod;
                if(sum >= n) break;
                prod = prod * 10 + i;                
            }
            //System.out.println("i: "+i+", totalSum: "+totalSum);
            if(sum == n) return 1;
        }
        return 0;
    }
}