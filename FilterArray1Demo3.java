/* A binary representation of a number can be used to select elements from an array. For example,
  n:           88 = 2 raised 3 + 2 raised 4 + 2 raised 6  (1011000)  
  array:       8, 4, 9, 0, 3, 1, 2
  indexes:     0  1  2  3  4  5  6
  selected:             *  *     *
  result:               0, 3,    2
so the result of filtering {8, 4, 9, 0, 3, 1, 2} using 88 would be {0, 3, 2}

In the above, the elements that are selected are those whose indices are used as exponents in the binary representation of 88. 
In other words, a[3], a[4], and a[6] are selected for the result because 3, 4 and 6 are the powers of 2 that sum to 88.

Write a method named filterArray that takes an array and a non-negative integer and returns the result of filtering the array using 
the binary representation of the integer. The returned array must big enough to contain the filtered elements and no bigger. 
So in the above example, the returned array has length of 3, not 7 (which is the size of the original array.) Futhermore, 
if the input array is not big enough to contain all the selected elements, then the method returns null. For example, 
if n=3 is used to filter the array a = {18}, the method should return null because 3=20+21 and hence requires that the array have 
at least 2 elements a[0] and a[1], but there is no a[1]. 

If you are using Java or C#, the signature of the function is:
    int[] filterArray(int[] a, int n) 
Hint: Proceed as follows
a. Compute the size of the returned array by counting the number of 1s in the binary representation of n (You can use modulo 2 arithmetic to determine the 1s in the binary represention of n) 
b.  Allocate an array of the required size 
c. Fill the allocated array with elements selected from the input array 
Examples:
if a is 	        and n is 	return 	    because 
{9, -9}	            0	        {}	        because there are no 1s in the binary representation of 0
{9, -9}	            1	        {9}	        because 1 = 20 and a[0] is 9
{9, -9}	            2	        {-9}	    because 2 = 21 and a[1] is -9
{9, -9}	            3	        {9, -9}	    because 3 = 20 + 21 and a[0]=9, a[1]=-9
{9, -9}	            4	        null	    because 4 = 22 and there is no a[2]
{9, -9, 5}	        3	        {9, -9}	    because 3 = 20 + 21 and a[0]=9, a[1]=-9
{0, 9, 12, 18, -6}	11	        {0, 9, 18}	because 11 = 20 + 21 + 23 and a[0]=0, a[1]=9, a[3]=18
*/
import java.util.Arrays;
public class FilterArray1Demo3 //Short and Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(filterArray(new int[] {9,-9}, 0))); //{}
        System.out.println(Arrays.toString(filterArray(new int[] {9,-9}, 1))); //{9}
        System.out.println(Arrays.toString(filterArray(new int[] {9,-9}, 2))); //{-9}
        System.out.println(Arrays.toString(filterArray(new int[] {9,-9}, 3))); //{9, -9}
        System.out.println(Arrays.toString(filterArray(new int[] {9,-9}, 4))); // null
        System.out.println(Arrays.toString(filterArray(new int[] {9,-9,5}, 3))); //{9, -9}
        System.out.println(Arrays.toString(filterArray(new int[] {0,9,12,18,-6}, 11))); //{0, 9, 18}

        System.out.println(Arrays.toString(filterArray(new int[] {8,4,9,0,3,1,2}, 88))); //{0, 3, 2}        
    }
    static int[] filterArray(int[] a, int n)
    {
        if(n < 0) return null;

        int[] output = {};
        if(n == 0) return output;

        int[] arr = new int[1];

        int count = 0, pow = 0, num = n; //???
        boolean flag = false;
        while(num != 0)
        {
            if(flag == true && num % 2 != 0)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = pow;
            }
            if(count == 0 && flag == false && num % 2 != 0)
            {
                arr[count] = pow;
                flag = true;
            }
            num = num / 2;
            pow++;
        }
        if(arr[arr.length-1] >= a.length) return null;

        for(int i = 0; i < arr.length; i++) //Instead of creating new array, it is replaced in the previous array!
        {
            int index = arr[i];
            arr[i] = a[index];
        }
        return arr;

    } 
    static int[] arraySizeGrow(int[] arr)
    {
        int[] temp = new int[arr.length+1];

        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}
