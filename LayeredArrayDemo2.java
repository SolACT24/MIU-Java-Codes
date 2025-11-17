/* An array is called layered if its elements are in ascending order and each element appears two or more times. 
For example, {1, 1, 2, 2, 2, 3, 3} is layered but {1, 2, 2, 2, 3, 3} and {3, 3, 1, 1, 1, 2, 2} are not. 
Write a method named isLayered that accepts an integer array and returns 1 if the array is layered, otherwise it returns 0. 

If you are programming in Java or C#, the function signature is:
    int isLayered(int[] a)
Examples: 
If the input array is	    return
{1, 1, 2, 2, 2, 3, 3}	    1
{3, 3, 3, 3, 3, 3, 3}	    1
{1, 2, 2, 2, 3, 3}	        0 (because there is only one occurence of the value 1)
{2, 2, 2, 3, 3, 1, 1}	    0 (because values are not in ascending order)
{2}	                        0
{}	                        0
*/
public class LayeredArrayDemo2 //Perfect Answer!
{
    public static void main(String[] args)
    {
        System.out.println(isLayered(new int[] {1, 1, 2, 2, 2, 3, 3})); //1
        System.out.println(isLayered(new int[] {3, 3, 3, 3, 3, 3, 3})); //1
        System.out.println(isLayered(new int[] {1, 2, 2, 2, 3, 3})); //0
        System.out.println(isLayered(new int[] {2, 2, 2, 3, 3, 1, 1})); //0
        System.out.println(isLayered(new int[] {2})); //0 - freq < 2
        System.out.println(isLayered(new int[] {})); //0
        System.out.println(isLayered(new int[] {3, 3, 1, 1, 1, 2, 2})); //0
    }
    static int isLayered(int[] a)
    {
        if(a.length == 0) return 0;

        for(int i = 0; i < a.length-1; i++)
            if(a[i] > a[i+1]) return 0;

        for(int i = 0; i < a.length; i++)
        {
            int freq = 0;
            for(int j = 0; j < a.length; j++)
                if(a[i] == a[j]) freq++;
            if(freq < 2) return 0;
        }
        return 1;
    }
}