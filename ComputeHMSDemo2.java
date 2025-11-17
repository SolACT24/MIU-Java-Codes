/* Write a method named computeHMS that computes the number of hours, minutes and seconds in a given number of seconds. 

If you are programming in Java or C#, the method signature is:
    int[] computeHMS(int seconds);

The returned array has 3 elements; arr[0] is the hours, arr[1] is the minutes and arr[2] is the seconds contained within 
the seconds argument.
Recall that there are 3600 seconds in an hour and 60 seconds in a minute. You may assume that the numbers of seconds is non-negative.
Examples:
If seconds is 	then function returns 	reason 
3735	        {1, 2, 15}	            because 3735 = 1*3600 + 2*60 +15. In other words, 3,735 is the number of seconds in 1 hour 2 minutes and 15 seconds
380	            {0, 6, 20}	            because 380 = 0*3600 + 6*60 + 20
3650	        {1, 0, 50}	            because 3650 = 1*3600 + 0*60 + 50
55	            {0, 0, 55}	            because 55 = 0*3600 + 0*60 + 55
0	            {0, 0, 0}	            because 0 = 0*3600 + 0*60 + 0
*/
import java.util.Arrays;
public class ComputeHMSDemo2
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }
    static int[] computeHMS(int seconds)
    {
        int[] arr = new int[3];

        if(seconds >= 3600)
        {
            arr[0] = seconds/3600;
            seconds = seconds - arr[0] * 3600;
        }
        else arr[0] = 0;

        if(seconds >= 60)
        {
            arr[1] = seconds/60;
            seconds = seconds - arr[1] * 60;
        }
        else arr[1] = 0;
        
        if(seconds < 60) arr[2] = seconds;

        return arr;
    }
} 