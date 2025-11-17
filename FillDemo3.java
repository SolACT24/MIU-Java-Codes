/* Write a function fill with signature int[] fill(int[] arr, int k, int n) which does the following: 
It returns an integer array arr2 of length n whose first k elements are the same as the first k elements of arr, and 
whose remaining elements consist of repeating blocks of the first k elements.  

You can assume array arr has at least k elements. The function should return null if either k or n is not positive. 

Examples:  fill({1,2,3,5,9,12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}. 
           fill({4,2,-3,12}, 1, 5)  returns {4, 4, 4, 4, 4}. 
           fill({2,6,9,0,-3}, 0, 4) returns null.
*/
import java.util.Arrays;
public class FillDemo3 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(fill(new int[] {1,2,3,5,9,12,-2,-1},3,10))); //{1,2,3,1,2,3,1,2,3,1}
        System.out.println(Arrays.toString(fill(new int[] {4,2,-3,12},1,5))); //{4, 4, 4, 4, 4}
        System.out.println(Arrays.toString(fill(new int[] {2,6,9,0,-3},0,4))); //null
    }
    static int[] fill(int[] arr, int k, int n)
    {
        if(k <= 0 || n <= 0) return null;

        int[] arr2 = new int[1];

        int count = 0;
        boolean flag = false, flag2 = false;
        while(true)
        {
            int j = 0;
            while(j < k)
            {
                if(flag == true)
                {
                    count++; 
                    arr2 = arraySizeGrow(arr2);
                    arr2[count] = arr[j];
                }
                if(count == 0 && flag == false)
                {
                    arr2[count] = arr[j];
                    flag = true;
                }
                if(arr2.length == n) 
                {
                    flag2 = true;
                    break;
                }
                j++;
            }
            if(flag2 == true) break;
        }
        return arr2;
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
