/* Write a function named lastEven that returns the index of the last even value in its array argument. For example, 
lastEven will return 3 if the array is {3, 2, 5, 6, 7}, because that is the index of 6 which is the last even value 
in the array. If the array has no even numbers, the function should return -1.
 
If you are programming in Java or C#, the function signature is:
   int lastEven(int[] a)
*/
public class LastEvenDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(lastEven(new int[] {3, 2, 5, 6, 7})); //3
        System.out.println(lastEven(new int[] {3, 5, 7})); //-1
    }
    static int lastEven(int[] a)
    {
        int indexEven = -1;
        for(int i = a.length-1; i >= 0; i--) //For efficient reasons
        {
            if(a[i] % 2 == 0)
            {
                indexEven = i;
                break;
            }
        }
        return indexEven;
    }
}
