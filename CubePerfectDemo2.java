/* An array is called cube-perfect if all its elements are cubes of some integer. For example, {-1, 1, -8, -27, 8} is cube-perfect 
because: -1 = -1 * -1 * -1, 1 = 1 * 1 * 1, -8 = -2 * -2 * -2, -27 = -3 * -3 * -3, 8 = 2 * 2 * 2, But {27, 3} is not cube-perfect 
because 3 is not the cube of any integer. Write a function named isCubePerfect that returns 1 if its argument is cube-perfect, 
otherwise it returns 0.

If you are programming in Java or C#, the function signature is:
   int isCubePerfect(int[] a)  
*/
public class CubePerfectDemo2 
{
    public static void main(String[] args)
    {
        System.out.println(isCubePerfect(new int[] {-1, 1, -8, -27, 8})); //1
        System.out.println(isCubePerfect(new int[] {27, 3})); //0
    }
    static int isCubePerfect(int[] a) // Perfect Answer
    {
        int num = 0;
        for(int i = 0; i < a.length; i++)
        {
            num = Math.abs(a[i]);
            boolean flag = false;
            for(int j = 0; j <= num; j++)
            {
                if(j * j * j == num) 
                {
                    flag = true;
                    break;
                }
                if(j * j * j > num) break; //For efficiency reason
            }
            if(flag == false) return 0;
        }
        return 1;
    }
}
