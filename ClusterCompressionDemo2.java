/* Define a cluster in an integer array to be a maximum sequence of elements that are all the same value. For example, in the array 
{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4} there are 5 clusters, {3, 3, 3}, {4, 4}, {3}, {2, 2, 2, 2} and {4}. A cluster-compression of an array 
replaces each cluster with the number that is repeated in the cluster. So, the cluster compression of the previous array would be {3, 4, 3, 2, 4}. 
The first cluster {3, 3, 3} is replaced by a single 3, and so on.

Write a function named clusterCompression with the following signature

If you are programming in Java or C#, the function signature is:
    int[] clusterCompression(int[] a)
Examples
a is 	                                    then function returns 
{0, 0, 0, 2, 0, 2, 0, 2, 0, 0}	            {0, 2, 0, 2, 0, 2, 0}
{18}	                                    {18}
{}	                                        {}
{-5, -5, -5, -5, -5}	                    {-5}
{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1}	    {1, 2, 1}
{8, 8, 6, 6, -2, -2, -2}	                {8, 6, -2}
*/
import java.util.Arrays;
public class ClusterCompressionDemo2 
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(clusterCompression(new int[] {0,0,0,2,0,2,0,2,0,0}))); //{0, 2, 0, 2, 0, 2, 0}
        System.out.println(Arrays.toString(clusterCompression(new int[] {18}))); //{18}
        System.out.println(Arrays.toString(clusterCompression(new int[] {}))); //{}
        System.out.println(Arrays.toString(clusterCompression(new int[] {-5,-5,-5,-5,-5}))); //{-5}
        System.out.println(Arrays.toString(clusterCompression(new int[] {1,1,1,1,1,2,1,1,1,1,1,1,1}))); //{1, 2, 1}
        System.out.println(Arrays.toString(clusterCompression(new int[] {8,8,6,6,-2,-2,-2}))); //{8, 6, -2}
        System.out.println(Arrays.toString(clusterCompression(new int[] {3,3,3,4,4,3,2,2,2,2,4}))); //{3, 4, 3, 2, 4}
    }
    static int[] clusterCompression(int[] a)
    {
        int[] output = {};
        if(a.length == 0) return output;

        int[] arr = new int[1];
        
        int count = 0;
        boolean flag = false;
        for(int i = 0; i < a.length; i++)
        {
            if(flag == true && arr[arr.length-1] != a[i])
            {
                count++;
                arr = arraySizeGrow(arr);
                arr[count] = a[i];
            }
            if(count == 0 && flag == false)
            {
                arr[count] = a[i];
                flag = true;
            }
        }
        return arr;
    }
    static int[] arraySizeGrow(int[] arr)
    {
        int[] temp = new int[arr.length+1];

        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr = temp;

        return arr;
    }
}
  