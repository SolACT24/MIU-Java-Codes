/* An integer number can be encoded as an array as follows. Each digit n of the number is represented by n zeros followed by a 1. So,
the digit 5 is represented by 0, 0, 0, 0, 0, 1. The encodings of each digit of a number are combined to form the encoding of the number. 
So, the number 1234 is encoded as the array {0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}. The first 0, 1 is contributed by the digit 1, 
the next 0, 0, 1 is contributed by the digit 2, and so on. There is one other encoding rule: if the number is negative, 
the first element of the encoded array must be -1, so -201 is encoded as {-1, 0, 0, 1, 1, 0, 1}. 
Note that the 0 digit is represented by no zeros, i.e. there are two consecutive ones! Write a method named encodeArray that takes an 
integer as an argument and returns the encoded array.

If you are programming in Java or C#, the function prototype is: 
    int[] encodeArray(int n) 
Hints: Use modulo 10 arithmetic to get digits of number 
Make one pass through the digits of the number to compute the size of the encoded array.
Make a second pass through the digits of the number to set elements of the encoded array to 1.
Examples: 
n is 	then function returns 	                                        reason 
0	    {1}	                                                            because the digit 0 is represented by no zeros and the representation of each digit ends in one.
1	    {0, 1}	                                                        because the digit 1 is represented by one zero and the representation of each digit ends in one.
-1	    {-1, 0, 1}	                                                    because the encoding of a negative number begins with a -1 followed by the encoding of the absolute 
                                                                        value of the number.
100001	{0, 1, 1, 1, 1, 1, 0, 1}	                                    because the encoding of the first 1 is 0, 1, the encoding of each of the four 0s is just a 1 and the 
                                                                        encoding of the last 1 is 0, 1.
999	    {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}	because each 9 digit is encoded as 0,0,0,0,0,0,0,0,0,1.
*/
import java.util.Arrays;
public class EncodeArrayDemo2 // Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(encodeArray(0))); //{1}
        System.out.println(Arrays.toString(encodeArray(1))); //{0, 1}
        System.out.println(Arrays.toString(encodeArray(-1))); //{-1, 0, 1}
        System.out.println(Arrays.toString(encodeArray(100001))); //{0, 1, 1, 1, 1, 1, 0, 1}
        System.out.println(Arrays.toString(encodeArray(999))); //{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}
        //System.out.println();
        System.out.println(Arrays.toString(encodeArray(5))); //{0, 0, 0, 0, 0, 1}
        System.out.println(Arrays.toString(encodeArray(1234))); //{0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}
        System.out.println(Arrays.toString(encodeArray(-201))); //{-1, 0, 0, 1, 1, 0, 1}
    }
    static int[] encodeArray(int n)
    {
        int[] arr = new int[1];
        if(n == 0) //Attention here!
        {
            arr[0] = 1;
            return arr;
        }
        int count = 0, num = Math.abs(n);
        boolean flag = false;
        while(num != 0)
        {
            if(flag == true)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = num % 10;
            }
            if(count == 0 && flag == false)
            {
                arr[count] = num % 10;
                flag = true;
            }
            num = num / 10;
        }

        int[] newArr = new int[1];
        count = 0;
        flag = false;
        if(n < 0) 
        {
            newArr[count] = -1;
            flag = true;
        }
        for(int i = arr.length-1; i >= 0; i--)
        {
            int j = 0;
            while(j < arr[i])
            {
                if(flag == true)
                {
                   count++;
                   newArr = arraySizeGrow(newArr);
                   newArr[count] = 0; 
                }
                if(count == 0 && flag == false)
                {
                    newArr[count] = 0;
                    flag = true;
                }
                j++;
            }
            count++;
            newArr = arraySizeGrow(newArr);
            newArr[count] = 1;
        }
        return newArr;
    }
    static int[] arraySizeGrow(int[] arr)
    {
        int[] temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}