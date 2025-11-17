/* An array a is called paired if its even numbered elements (a[0], a[2], etc.) are odd and its  odd numbered elements (a[1], a[3], etc.) are even.  

Write a function named isPaired that accepts an array of integers and returns 1 if the array is paired, otherwise it returns 0. 

Examples: {7, 2, 3, 6, 7} is paired since a[0], a[2] and a[4] are odd, a[1] and a[3] are even. 
          {7, 15, 9, 2, 3} is not paired since a[1] is odd. {17, 6, 2, 4} is not paired since a[2] is even.

If you are programming in Java or C#, the function signature is: 
    int isPaired(int[] a)
*/
public class PairedDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isPaired(new int[] {7, 2, 3, 6, 7})); //1
        System.out.println(isPaired(new int[] {7, 15, 9, 2, 3})); //0
    }   
    static int isPaired(int[] a)
    {
        for(int i = 0; i < a.length; i++)
            if(i % 2 == 0 && a[i] % 2 == 0 || i % 2 != 0 && a[i] % 2 != 0) return 0;
        return 1;
    }
}
