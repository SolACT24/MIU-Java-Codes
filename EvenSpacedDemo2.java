/* An integer array is said to be evenSpaced, if the difference between the largest value 
and the smallest value is an even number.

Write a function isEvenSpaced(int[] a) that will return 1 if it is evenSpaced and 0 otherwise. 
If array has less than two elements, function will return 0. 
*/
public class EvenSpacedDemo2 
{
    public static void main(String[] args)
    {
        System.out.println(isEvenSpaced(new int[] {100, 19, 131, 140})); //0
        System.out.println(isEvenSpaced(new int[] {200, 1, 151, 160})); //0
        System.out.println(isEvenSpaced(new int[] {200, 10, 151, 160})); //1
        System.out.println(isEvenSpaced(new int[] {100, 19, -131, -140})); //1
        System.out.println(isEvenSpaced(new int[] {80, -56, 11, -81})); //0
    }
    static int isEvenSpaced(int[] a) 
    {
        if(a.length < 2) return 0;
        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(maxVal < a[i]) maxVal = a[i];
            if(minVal > a[i]) minVal = a[i];
        } 
        int diff = maxVal - minVal;
        
        if(diff % 2 == 0) return 1;
        return 0;
    }
}
