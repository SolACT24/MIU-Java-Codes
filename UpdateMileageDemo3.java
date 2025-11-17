/* A mileage counter can be represented as an array. The mileage counter 0 5 9 9 8 can be represented as the array
int a[] = new int[] {8, 9, 9, 5, 0};  
Note that the mileage counter is "backwards" in the array, a[0] represents ones, a[1] represents tens, a[2] represents hundreds, etc. 
Write a function named updateMileage that takes an array representation of a mileage counter (which can be arbitrarily long) and adds a given number of miles to the array. 
Since arrays are passed by reference you can update the array in the function, you do not have to return the updated array. 

You do not have to do any error checking. You may assume that the array contains non-negative digits and that the mileage is non-negative. 

If you are programming in Java or C#, the function signature is:
    void updateMileageCounter(int[] a, int miles)

Note that the mileage counter wraps around if it reaches all 9s and there is still some mileage to add.
*/
import java.util.Arrays;
public class UpdateMileageDemo3
{
    public static void main(String[] args)
    {
        updateMileageCounter(new int[] {8, 9, 9, 5, 0}, 1); //[9, 9, 9, 5, 0]
        updateMileageCounter(new int[] {8, 9, 9, 5, 0}, 2); //[0, 0, 0, 6, 0]
        updateMileageCounter(new int[] {8, 9, 9, 5, 0}, 3); //[1, 0, 0, 6, 0]
        updateMileageCounter(new int[] {9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        updateMileageCounter(new int[] {9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 13); //[2, 1, 0, 0, 0, 0, 0, 0, 0, 0]
    }
    static void updateMileageCounter(int[] a, int miles)
    {
        for(int i = 0; i < a.length; i++)
        {
            int rem = (a[i] + miles) % 10;
            int temp = (a[i] + miles) / 10;
            a[i] = rem;
            if(temp == 0) break;
            miles = temp;
        } 
        System.out.println(Arrays.toString(a));
    }
}

