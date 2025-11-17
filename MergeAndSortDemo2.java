/* int[] a1 = {1, 3, 5, 7}, a2 = {3, 6, 8, 9}, a3 = {} ... Merge first two arrays in a sorted order result put it in 
third array output will be {1, 3, 3, 5, 7, 8}. Write a code for this one?
*/
import java.util.Arrays;
public class MergeAndSortDemo2 //Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(mergeArray(new int[] {1, 3, 5, 7}, new int[] {3, 6, 8, 9}))); //{1, 3, 3, 5, 6, 7, 8, 9}
        //System.out.println();
        System.out.println(Arrays.toString(mergeArray(new int[] {3, 1, 5}, new int[] {3, 6, 8, 9}))); //{1, 3, 3, 5, 6, 8, 9}
    }
    static int[] mergeArray(int[] a1, int[] a2)
    {
        int[] a3 = new int[a1.length+a2.length];

        for(int i = 0; i < a1.length; i++)
            a3[i] = a1[i];            
        for(int i = 0, j = a1.length; i < a2.length && j < a3.length; i++, j++)
            a3[j] = a2[i];
        
        //System.out.print("Original array: ");
        //System.out.println(Arrays.toString(a3));
        
        for(int i = 0; i < a3.length-1; i++)
        {
            for(int j = i+1; j < a3.length; j++)
            {
                if(a3[i] > a3[j])
                {
                    int temp = a3[i];
                    a3[i] = a3[j];
                    a3[j] = temp;
                }
            }
        }
        //System.out.print("Sorted array: ");
        return a3;        
    }
}