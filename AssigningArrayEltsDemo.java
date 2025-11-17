/* Write a function that takes an array of integers, length of array and assign the elements for the return array as an argument and 
returns an array of integer based on the following condition.

The signature of the function is:
    int[] func5(int[] array, int lengthArray, int k) where k is the assigning elements for return array
Examples:
                                                  how many elements are assigning to      
If input array is            length of array      return array from the original array    return array
{1,2,5,9,16,17,3}                   4                      3                              {1, 2, 5, 1}
{1,2,5,10,16,17,3}                  5                      2                              {1, 2, 1, 2, 1}
null                                2                      1                              null
{1,2,13,216,30,7,90}      if length greater than           2                              null
                          the original length array                                      
{1,2,13,21,9,30,90}                 3                      k >= the length of             null
                                                           original array
{1,2,13,21,9,30,90,3}               2                      k < 0                          null
{1,2,13,21,9,30,90,3,7}       if length of array           3                              null
                              less than 1
{1,2,13,21,9,30,90,3,7}             3                      k >= length of array           null
//{1,2,5,9,16,17,3}                 4                      2                              {1, 2, 1, 2}
*/
import java.util.Arrays;
public class AssigningArrayEltsDemo 
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(func5(new int[] {1,2,5,9,16,17,3}, 4, 3)));
        System.out.println(Arrays.toString(func5(new int[] {1,2,5,10,16,17,3}, 5, 2)));
        System.out.println(Arrays.toString(func5(new int[] {}, 2, 1)));
        System.out.println(Arrays.toString(func5(new int[] {1,2,13,216,30,7,90}, 10, 2)));
        System.out.println(Arrays.toString(func5(new int[] {1,2,13,21,9,30,90}, 3, 10)));
        System.out.println(Arrays.toString(func5(new int[] {1,2,13,21,9,30,90,3}, 2, -3)));
        System.out.println(Arrays.toString(func5(new int[] {1,2,13,21,9,30,90,3,7}, 0, 3)));
        System.out.println(Arrays.toString(func5(new int[] {1,2,13,21,9,30,90,3,7}, 3, 3)));
        System.out.println(Arrays.toString(func5(new int[] {1,2,5,9,16,17,3}, 4, 2)));
    }
    static int[] func5(int[] a, int lengthArray, int k)
    {
        if(a.length == 0 || a == null || lengthArray > a.length || k >= a.length || k < 0 || lengthArray < 1 || k >= lengthArray) return null;

        int[] temp = new int[lengthArray];

        int count = 0, lenArr = lengthArray;
        boolean flag = true;

        for(;;)
        {
            int j = 0;
            while(j < k)
            {
                temp[count] = a[j];
                count++; // I missed it here!
                if(count == lengthArray)
                {
                    flag = false;
                    break;
                }
                j++;
            }
            if(flag == false) break;
            lenArr = lenArr - k;
        }
        return temp;
    }
}
