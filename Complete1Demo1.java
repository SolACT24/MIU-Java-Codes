/* An array is defined to be complete if all its elements are greater than 0 and 
all even numbers that are less than the maximum even number are in the array. 
For example {2, 3, 2, 4, 11, 6, 10, 9, 8} is complete because: 
  a. all its elements are greater than 0
  b. the maximum even integer is 10
  c. all even numbers that are less than 10 (2, 4, 6, 8) are in the array.
But {2, 3, 3, 6} is not complete because the even number 4 is missing. {2, -3, 4, 3, 6} is not complete because it contains a negative number.
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.

If you are writing in Java or C#, the function signature is
   int isComplete (int[] a)
*/
public class Complete1Demo1 
{
    public static void main(String[] args)
    {
        System.out.println(isComplete(new int[] {2, 3, 2, 4, 11, 6, 10, 9, 8})); //1
        System.out.println(isComplete(new int[] {2, 3, 3, 6})); //0
        System.out.println(isComplete(new int[] {2, -3, 4, 3, 6})); //0
    }
    static int isComplete(int[] a)
    {
        int maxEven = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] <= 0) return 0;
            if(a[i] % 2 == 0 && maxEven < a[i]) maxEven = a[i];
        }
        for(int i = 2; i <= maxEven; i += 2)
        {
            boolean flag = false;
            for(int j = 0; j < a.length; j++)
                if(i == a[j]) flag = true;

            if(flag == false) return 0;
        }
        return 1;
    }
}
