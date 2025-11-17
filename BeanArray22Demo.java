/* An array is defined to be a Bean array if it meets the following conditions:
   a. If it contains a 9 then it also contains a 13.
   b. If it contains a 7 then it does not contain a 16.

So {1, 2, 3, 9, 6, 13}  and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are Bean arrays. 
The following arrays are not Bean arrays:
   a. {9, 6, 18} (contains a 9 but no 13)
   b. {4, 7, 16} (contains both a 7 and a 16)

Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is:
   int isBean(int[] a)
*/
public class BeanArray22Demo
{
    public static void main(String[] args)
    {
        System.out.println(isBean(new int[] {1, 2, 3, 9, 6, 13})); //1
        System.out.println(isBean(new int[] {3, 4, 6, 7, 13, 15})); //1
        System.out.println(isBean(new int[] {1, 2, 3, 4, 10, 11, 12})); //1
        System.out.println(isBean(new int[] {3, 6, 9, 5, 7, 13, 6, 17})); //1
        System.out.println(isBean(new int[] {9, 6, 18})); //0
        System.out.println(isBean(new int[] {4, 7, 16})); //0
    }
    static int isBean(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 9 && findNum(a, 13) == false) return 0;
            if(a[i] == 7 && findNum(a, 16) == true) return 0;
        }
        return 1;
    }
    static boolean findNum(int[] a, int n)
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] == n) return true;
        
        return false;
    }
}