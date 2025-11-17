/* Write a function that will return the most occurring number in an array. If there is more than one such number, 
the function may return any one of them. If you are programming in Java or C#, the function signature is:
     int answerTwo(int[] a)
*/
import java.util.Arrays;
public class AnswerTwoDemo
{
    public static void main(String[] args)
    {
        System.out.println(answerTwo(new int[] {6,8,1,8,2})); //8
        System.out.println(answerTwo(new int[] {6,8,1,8,6})); //6 or 8 - The Function may return either 8 or 6.
    }
    static int answerTwo(int[] a)
    {
        int[] arr = new int[1];

        int maxFreq = 1;

        for(int i = 0; i < a.length; i++)
        {
            int freq = 0, j = 0;
            while(j < a.length)
            {           
                if(a[i] == a[j]) freq++;
                j++;
            }
            if(freq >= maxFreq)
            {
                arr[0] = a[i];
                maxFreq = freq;
            }
        }
        return arr[0];
    }
}