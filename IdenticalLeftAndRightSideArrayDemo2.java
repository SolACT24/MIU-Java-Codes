/* Write a function that takes an array of integers as an argument and returns an integer value based on which 
left side array element is identical or not to the right side of array element.

The signature of the function is:
    int func2(int[] array)
Examples:
                                                        Check an array if it contain       If mid element appears 
If input array is       If an array is identical?       exact mid element or not?          one of side?
{1,2,3,1,2,3}           Yes, return 1                   Not found exact mid element             -
{1,2,3,4,5,6}           No, return 0                    Not found exact mid element             -
{1,2,3,2,3,1}           No, return 0                    Not found exact mid element             -
{1,2,3,9,1,2,3}         Yes, return 1                   found exact mid element             No, return 1
{4,7,8,9,4,9,8}         No, return 0                    found exact mid element             Yes, return 0
{1}                     No, return 0                    Not found exact mid element             -
{1,2}                   No, return 0                    Not found exact mid element             -
{1,2,1}                 Yes, return 1                   found exact mid element             No, return 1
{11,0,45,0,11,21,45}    No, return 0                    found exact mid element             Yes, return 0
{}                      No, return 0                    Not found exact mid element             -
{10,10}                 Yes, return 1                   Not found exact mid element             -
*/
public class IdenticalLeftAndRightSideArrayDemo2 //Perfect Answer!
{
    public static void main(String args[])
    {
        System.out.println(fun2(new int[] {1,2,3,1,2,3})); //1
        System.out.println(fun2(new int[] {1,2,3,4,5,6})); //0
        System.out.println(fun2(new int[] {1,2,3,2,3,1})); //0
        System.out.println(fun2(new int[] {1,2,3,9,1,2,3})); //1
        System.out.println(fun2(new int[] {4,7,8,9,4,9,8})); //0
        System.out.println(fun2(new int[] {1})); //0
        System.out.println(fun2(new int[] {1,2})); //0
        System.out.println(fun2(new int[] {1,2,1})); //1
        System.out.println(fun2(new int[] {11,0,45,0,11,21,45})); //0
        System.out.println(fun2(new int[] {})); //0
        System.out.println(fun2(new int[] {10,10})); //1
    }
    static int fun2(int[] a)
    {
        if(a.length == 0 || a.length == 1) return 0;

        if(a.length % 2 == 0)
        {
            for(int i = 0, j = a.length/2; i < a.length/2 && j < a.length; i++, j++)
                if(a[i] != a[j]) return 0;
        }
        else
        {
            for(int i = 0, j = a.length/2+1; i < a.length/2 && j < a.length; i++, j++)
                if(a[i] != a[j]) return 0;
        }
        return 1;
    }
}
