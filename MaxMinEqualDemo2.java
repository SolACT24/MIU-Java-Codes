/* An array is defined to be maxmin equal if it contains at least two different elements and the number of times the maximum value occur is the same as 
the number of times the minimum value occur. So, {11, 4, 9, 11, 8, 5, 4, 10} is maxmin equal, because the max value 11 and min value 4 both appear 
two times in the array. Write a function called isMaxMinEqual that accepts an integer array and returns 1 if the array is maxmin equal; otherwise it returns 0. 

If you are programming in Java or C#, the function signature is:
	int isMaxMinEqual(int[] a) 

Some other examples:
if the input array is           isMaxMinEqual should return
{}                              0 (array must have at least two different elements)
{2}                             0 (array must have at least two different elements)
{1, 1, 1, 1, 1, 1}              0 (array must have at least two different elements)
{2, 4, 6, 8, 11}                1 (Both max value (11) and min value 2 appear exactly one time)
{-2, -4, -6, -8, -11}           1 (Both max value (-2) and min value -11 appear exactly one time)
*/
public class MaxMinEqualDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isMaxMinEqual(new int[] {})); //0
        System.out.println(isMaxMinEqual(new int[] {2})); //0              
        System.out.println(isMaxMinEqual(new int[] {1, 1, 1, 1, 1, 1})); //0      
        System.out.println(isMaxMinEqual(new int[] {2, 4, 6, 8, 11})); //1       
        System.out.println(isMaxMinEqual(new int[] {-2, -4, -6, -8, -11})); //1
        System.out.println(isMaxMinEqual(new int[] {11, 4, 9, 11, 8, 5 , 4, 10})); //1
        System.out.println(isMaxMinEqual(new int[] {2,1})); //1
    }
    static int isMaxMinEqual(int[] a)
    {
       boolean flag = false;
       for(int i = 0; i < a.length-1; i++)
       {
            if(a[i] != a[i+1])
            {
                flag = true;
                break;
            }
       }
       if(flag == false) return 0;

       int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
       for(int i = 0; i < a.length; i++)
       {
           if(maxVal < a[i]) maxVal = a[i];
           if(minVal > a[i]) minVal = a[i];
       }
       //System.out.println("maxVal: "+maxVal+", minVal: "+minVal);
       int maxFreq = 0, minFreq = 0;
       for(int i = 0; i < a.length; i++)
       {
            if(maxVal == a[i]) maxFreq++;
            if(minVal == a[i]) minFreq++;
       }
       //System.out.println("maxFreq: "+maxFreq+", minFreq: "+minFreq);
       if(maxFreq != minFreq) return 0;

       return 1;

    }
}
