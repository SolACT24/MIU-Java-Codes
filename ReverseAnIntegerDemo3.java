/* Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.

The signature of the function is:
   int f(int n)

Examples:
If the input integer is    return
1234                       4321
12005                      50021
1                          1
1000                       1
0                          0
-12345                     -54321
*/
import java.util.Arrays;
public class ReverseAnIntegerDemo3 //The instruction says - using numeric operators and without using any arrays or other data structures!
{
   public static void main(String args[]) 
   {
       System.out.println(f(1234)); //4321
       System.out.println(f(12005)); //50021
       System.out.println(f(1)); //1
       System.out.println(f(1000)); //1
       System.out.println(f(0)); //0
       System.out.println(f(-12345)); //-54321
   }
   static int f(int n)
   {
       int count = 0, num = Math.abs(n);
       while(num >= 10)
       {
           num = num / 10;
           count++;
       }
       num = Math.abs(n);
       int sum = 0;
       while(num != 0)
       {
           int j = 0, prod = 1;
           while(j < count)
           {
                prod = prod * 10;
                j++;
           }
           sum += (num % 10) * prod;
           num = num / 10; 
           count--;
       }
       sum += num;

       if(n < 0) sum = -(sum);

       return sum;
   }
}
