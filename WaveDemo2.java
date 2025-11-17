/* A wave array is defined to an array which does not contain two even numbers or two odd numbers in adjacent locations. 
So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave arrays. 
But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each other.

Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isWave(int[] a)
*/
public class WaveDemo2 //Perfect Answer!!!
{
    public static void main(String[] args)
    {
        System.out.println(isWave(new int[] {7, 2, 9, 10, 5})); //1
        System.out.println(isWave(new int[] {4, 11, 12, 1, 6})); //1
        System.out.println(isWave(new int[] {1, 0, 5})); //1
        System.out.println(isWave(new int[] {2})); //1
        System.out.println(isWave(new int[] {2, 6, 3, 4})); //0
    }
    static int isWave(int[] a)
    {
        for(int i = 0; i < a.length-1; i++)
            if(a[i] % 2 == 0 && a[i+1] % 2 == 0 || a[i] % 2 != 0 && a[i+1] % 2 != 0) return 0;

        return 1;
    }
}
