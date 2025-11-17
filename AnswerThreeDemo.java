/* Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
    1. it has even numbers of elements
    2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array.

If you are programming in Java, the function Signature is:
    int answerThree(int[] a)
Examples:
a                   return      reason
{5,4,3,2,3,4,6,1}   1           *There are 8 (even) number of elements in the array. Thus condition 1 satisfied.                                                            |
                                *The sum of all the numbers in the first half = 5+4+3+2 = 14 
*/
public class AnswerThreeDemo
{
    public static void main(String[] args)
    {
        System.out.println(answerThree(new int[] {5,4,3,2,3,4,6,1})); //1
    }
    static int answerThree(int[] a)
    {
        if(a.length % 2 != 0) return 0; // If it has odd number of elts in the array -> a.length == 8

        int sum1stHalf = 0, sum2ndHalf = 0;

        for(int i = 0, j = a.length/2; i < a.length/2 && j < a.length; i++, j++)
        {
            sum1stHalf += a[i]; 
            sum2ndHalf += a[j];     
        }
        //System.out.println("sum1stHalf: "+sum1stHalf+", sum2ndHalf: "+sum2ndHalf);
        if(sum1stHalf != sum2ndHalf) return 0;
        else return 1;
    }
}