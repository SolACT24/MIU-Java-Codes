/* Write a function named eval that returns the value of the polynomial an*x^n + an-1*x^n-1 + ... + a1*x^1 + a0. 

If you are programming in Java or C#, the function signature is:
    double eval(double x, int[] a)
Examples: 
x 	        if the input array is	this represents	              eval should return
1.0	        {0, 1, 2, 3, 4}	        4x^4 + 3x^3 + 2x^2 + x^1 + 0	    10.0
3.0	        {3, 2, 1}	            x^2 + 2x^1 + 3	                    18.0
2.0	        {3, -2, -1}	            -x^2 - 2x^1 + 3	                   -5.0
-3.0	    {3, 2, 1}	            x^2 + 2x^1 + 3	                    6.0
2.0	        {3, 2}	                2x^1 + 3	                        7.0
2.0	        {4, 0, 9}	            9x^2 + 4	                        40.0
2.0	        {10}	                10	                                10.0
10.0	    {0, 1}	                x	                                10.0
*/
public class PolynomialEvalDemo2 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(eval(1.0, new int[] {0, 1, 2, 3, 4})); //10.0
        System.out.println(eval(3.0, new int[] {3, 2, 1})); //18.0
        System.out.println(eval(2.0, new int[] {3, -2, -1})); //-5.0
        System.out.println(eval(-3.0, new int[] {3, 2, 1})); //6.0
        System.out.println(eval(2.0, new int[] {3, 2})); //7.0
        System.out.println(eval(2.0, new int[] {4, 0, 9})); //40.0
        System.out.println(eval(2.0, new int[] {10})); //10.0
        System.out.println(eval(10.0, new int[] {0, 1})); //10.0
    }
    static double eval(double x, int[] a)
    {
        int pow = 0;
        double sum = 0.0;
        for(int i = 0; i < a.length; i++)
        {
            int j = 0;
            double prod = 1.0;
            while(j < pow)
            {
                prod = prod * x;
                j++;
            }
            sum += a[i] * prod;
            pow++;
        }
        return sum;
    }
}