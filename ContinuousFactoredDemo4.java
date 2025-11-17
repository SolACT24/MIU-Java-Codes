/* An integer is defined to be CONTINUOUS FACTORED if it can be expressed as the product of two or more continuous integers greater than 1. 
Examples of CONTINUOUS FACTORED integers are:
6 = 2 * 3. 
60 = 3 * 4 * 5
120 = 4 * 5 * 6
90 = 9 * 10
Examples of integers that are NOT CONTINUOUS FACTORED are: 99 = 9*11, 121 = 11*11, 2 = 2, 13 = 13.

Write a function named:
    int isContinuousFactored(int n) that returns 1 if n is continuous factored and 0 otherwise.
*/
import java.util.Arrays;
public class ContinuousFactoredDemo4 //Simple and Prefect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(isContinuousFactored(6)); //6 = 2*3
        System.out.println(isContinuousFactored(60)); //60 = 3*4*5
        System.out.println(isContinuousFactored(120)); //120 = 3*5*8
        System.out.println(isContinuousFactored(90));  //90 = 2*5*9      
        System.out.println(isContinuousFactored(99)); //99 = 9*11
        //System.out.println();     
        System.out.println(isContinuousFactored(121)); //121 = 11*11
        System.out.println(isContinuousFactored(2)); //2 = 2
        System.out.println(isContinuousFactored(13)); //13 = 13
    }
    static int isContinuousFactored(int n)
    {
        int[] arr = new int[1];

        int i = 2, count = 0, num = n;
        boolean flag = false;
        while(num != 1)
        {
            if(count == 0 && flag == false && num % i == 0)
            {
                arr[count] = i;
                flag = true;
                num = num / i;
            }
            while(flag == true && num % i == 0)
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = i;
                num = num / i;
            }
            i++;
        }
        
        int counter = 1;
        for(int j = 0; j < arr.length-1; j++)
            if(arr[j] != arr[j+1]) counter++;

        if(counter >= 2) return 1;

        return 0;
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
