/* Write a function named minDistance that returns the smallest distance between two factors of a number. 
For example, consider 13013 = 1*7*11*13... Its factors are 1, 7, 11, 13, ... and 13013. minDistance(13013) would return 2 
because the smallest distance between any two factors is 2 (13 - 11 = 2). 
As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8 and 
the smallest distance between any two factors is 1 (2 – 1 = 1).

The function signature is
   int minDistance(int n)
*/
import java.util.Arrays;
public class MinDistanceDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(minDistance(13013)); //2
        System.out.println(minDistance(8)); //1
    }
    static int minDistance(int n)
    {
      int[] arr = new int[1];
      arr[0] = 1;

      int count = 0;
      for(int i = 2; i < n; i++)
      {
          if(n % i == 0) 
          {
              count++;
              arr = arraySizeGrow(arr);
              arr[count] = i;
          }
          if(i > n/2) 
          {
              count++;
              arr = arraySizeGrow(arr);
              arr[count] = n;
              break; // For efficiency purpose!
          }
      }
      //System.out.println(Arrays.toString(arr));

      int minDiff = Integer.MAX_VALUE;
      for(int i = 0; i < arr.length-1; i++)
          if(minDiff > arr[i+1]-arr[i]) minDiff = arr[i+1]-arr[i]; //System.out.println("minDiff: "+minDiff);}

      return minDiff;
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
