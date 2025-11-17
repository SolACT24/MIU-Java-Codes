/* An array can hold the digits of a number. For example, the digits of the number 32053 are stored in the array {3, 2, 0, 5, 3}.

Write a method call repsEqual that takes an array and an integer, and returns 1 if the array contains only the digits of the number 
in the same order that they appear in the number. Otherwise it returns 0.

If you are programming in Java or C#, the function prototype is:
   int repsEqual(int[] a, int n)

Examples (note: your program must work for all values of a and n, not just those given here!)
if a is	           and n is	    Return	reason
{3, 2, 0, 5, 3}	    32053	    1	    the array contains only the digits of the number, in the same order as they are in the number.
{3, 2, 0, 5}	    32053	    0	    the last digit of the number is missing from the array.
{3, 2, 0, 5, 3, 4}	32053	    0	    an extra number (4) is in the array.
{2, 3, 0, 5, 3}	    32053	    0	    the array elements are not in the same order as the digits of the number
{9, 3, 1, 1, 2}	    32053	    0	    elements in array are not equal to digits of number.
{0, 3, 2, 0, 5, 3}	32053	    1	    you can ignore leading zeroes.
*/
class RepsEqualDemo2 //Perfect Answer!!!!
{
    public static void main(String args[])
    {
        System.out.println(repsEqual(new int[] {3,2,0,5,3}, 32053)); //1
        System.out.println(repsEqual(new int[] {3,2,0,5}, 32053)); //0
        System.out.println(repsEqual(new int[] {3,2,0,5,3,4}, 32053)); //0
        System.out.println(repsEqual(new int[] {2,3,0,5,3}, 32053)); //0
        System.out.println(repsEqual(new int[] {9,3,1,1,2}, 32053)); //0
        System.out.println(repsEqual(new int[] {0,3,2,0,5,3}, 32053)); //1
        System.out.println(repsEqual(new int[] {3,2,0,5,3}, 532053)); //0
    }
    static int repsEqual(int[] a, int n)
    {
        for(int i = a.length-1; i>= 0; i--)
        {
            if(n % 10 != a[i]) return 0;
            n = n / 10;
        }
        if(n != 0) return 0; //e.g: {3,2,0,5,3}, 532053 --- At the end, 5 will be left not mached!

        return 1;
    }
}
 