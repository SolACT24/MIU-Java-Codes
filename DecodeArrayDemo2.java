/* A number can be encoded as an integer array as follows. The first element of the array is any number and if it is negative 
then the encoded number is negative. Each digit of the number is the absolute value of the difference of two adjacent elements 
of the array. The most significant digit of the number is the absolute value of the difference of the first two elements of 
the array. For example, the array {2, -3, -2, 6, 9, 18} encodes the number 51839 because 
•	5 is abs(2 - (-3)) 
•	1 is abs(-3 - (-2)) 
•	8 is abs(-2 - 6) 
•	3 is abs(6-9) 
•	9 is abs(9-18) 
The number is positive because the first element of the array is >= 0.

If you are programming in Java or C#, the function prototype is:
    int decodeArray(int[] a) 

You may assume that the encoded array is correct, i.e., the absolute value of the difference of any two adjacent elements is between 
0 and 9 inclusive and the array has at least two elements.
Examples:
a is 	           then function returns 	reason 
{0, -3, 0, -4, 0}	        3344	        because abs(0-(-3)=3, abs(-3-0)=3, abs(0-(-4))=4, abs(-4-0)=4
{-1, 5, 8, 17, 15}      	-6392	        because abs(-1-5)=6, abs(5-8)=3, abs(8-17)=9, abs(17-15)=2; the number is negative because the first element of the array is negative
{1, 5, 8, 17, 15}	        4392	        because abs(1-5)=4, remaining digits are the same as previous example; the number is positive because the first element of the array is >=0.
{111, 115, 118, 127, 125}	4392	        because abs(111-115)=4, abs(115-118)=3, abs(118-127)=9, abs(127-125)=2; the number is positive because the first element of the array is >=0.
{1, 1}	                    0	            because abs(1-1) = 0
*/
import java.util.Arrays;
public class DecodeArrayDemo2 //Perfect Answer
{
    public static void main(String[] args)
    { 
        System.out.println(decodeArray(new int[] {0,-3,0,-4,0})); //3344
        System.out.println(decodeArray(new int[] {-1,5,8,17,15})); //-6392
        System.out.println(decodeArray(new int[] {1,5,8,17,15})); //4392
        System.out.println(decodeArray(new int[] {111,115,118,127,125})); //4392
        System.out.println(decodeArray(new int[] {1,1})); //0
        System.out.println(decodeArray(new int[] {2,-3,-2,6,9,18})); //51839
    }
    static int decodeArray(int[] a)
    {
        int[] arr = new int[1];

        int count = 0;
        boolean flag = false;
        for(int i = 0; i < a.length-1; i++)
        {
            if(flag == true)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = Math.abs(a[i]-a[i+1]);
            }
            if(count == 0 && flag == false)
            {
                arr[count] = Math.abs(a[i]-a[i+1]);
                flag = true;
            }
        }
        //System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i = arr.length-1, j = 0; i >= 0 && j < arr.length; i--, j++)
        {
            int k = 0, prod = 1;
            while(k < j)
            {
                prod = prod * 10;
                k++;
            }
            sum += arr[i] * prod;
            //System.out.println("Sum: "+sum);
        }
        if(a[0] < 0) sum = -(sum);

        return sum;
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
