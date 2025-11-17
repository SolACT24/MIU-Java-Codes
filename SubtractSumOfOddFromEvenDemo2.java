/* Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array.

Let X = the sum of the odd numbers in the array and 
    Y = the sum of the even numbers.
The function should return X - Y.

The signature of the function is:
    int f(int[] a)

Examples:
If input array is   return 
{1}                 1
{1,2}               -1
{1,2,3}             2
{1,2,3,4}           -2
{3,3,4,4}           -2
{3,2,3,4}           0
{4,1,2,3}           -2
{1,1}               2
{}                  0
*/
class SubtractSumOfOddFromEvenDemo2 //Perfect Answer!!!
{
    public static void main(String args[]) 
    {        
        System.out.println(f(new int[] {1})); //1
        System.out.println(f(new int[] {1,2})); //-1
        System.out.println(f(new int[] {1,2,3})); //2
        System.out.println(f(new int[] {1,2,3,4})); //-2
        System.out.println(f(new int[] {3,3,4,4})); //-2
        System.out.println(f(new int[] {3,2,3,4})); //0
        System.out.println(f(new int[] {4,1,2,3})); //-2
        System.out.println(f(new int[] {1,1})); //2
        System.out.println(f(new int[] {})); //0
    }
    static int f(int[] a) 
    {
        if(a.length == 0) return 0;

        int sumOdd = 0, sumEven = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 != 0) sumOdd += a[i];
            if(a[i] % 2 == 0) sumEven += a[i];
        }
        return (sumOdd-sumEven); 
    }
}