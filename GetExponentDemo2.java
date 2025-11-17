/* Write a method named getExponent(n,p) that returns the largest exponent x such that 
P raised x evenly divides n. If p is <= 1 the method should return -1.
For example, getExponent(162, 3) returns 4 because 162 = 2*3*3*3*3, therefore the value of x here
is 4.
Examples:
if n is     and p is    return      because
27          3           3           33 divides 27 evenly but 34 does not.
28          3           0           30 divides 28 evenly but 31 does not.
280         7           1           71 divides 280 evenly but 72 does not.
-250        5           3           53 divides -250 evenly but 54 does not.
18          1          -1           if p <=1 the function returns -1.
128         4           3           43 divides 128 evenly but 44 does not.
*/
public class GetExponentDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(getExponent(27, 3)); //3
        System.out.println(getExponent(28, 3)); //0
        System.out.println(getExponent(280, 7)); //1
        System.out.println(getExponent(-250, 5)); //3
        System.out.println(getExponent(18, 1)); //-1
        System.out.println(getExponent(128, 4)); //3
        System.out.println(getExponent(162, 3)); //4
    }
    static int getExponent(int num, int p)
    {
        if(p <= 1) return -1;

        int count = 0;
        while(true)
        {
            if(num % p != 0) break;
            if(num % p == 0) count++;
            num = num / p;
            if(Math.abs(num) < p) break;
        }
        return count;
    }
}
