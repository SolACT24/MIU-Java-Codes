/* A number n is triangular if n == 1 + 2 +...+j for some j. 

Write a function int isTriangular(int n) that returns 1 if n is a triangular number, otherwise it returns 0. 

The first 4 triangular numbers are 1 (j=1), 3 (j=2), 6, (j=3), 10 (j=4).
*/
public class TriangularNumberDemo2 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(isTriangular(10)); //1
        System.out.println(isTriangular(20)); //0

        System.out.println(isTriangular(1)); //1
        System.out.println(isTriangular(3)); //1
        System.out.println(isTriangular(6)); //1
        System.out.println(isTriangular(10)); //1
    }
    static int isTriangular(int n)
    {
         int sum = 0, j = 1;
         while(sum < n)
         {
             sum += j;
             j++;
         }
         //System.out.println("Sum: "+sum);
         if(sum == n) return 1;

         return 0;
    }
}