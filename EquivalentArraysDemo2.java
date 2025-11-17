/* Write a function named equivalentArrays that has two array arguments and returns 1 if the two arrays contain the same values 
(but not necessarily in the same order), otherwise it returns 0. Your solution must not sort either array or a copy of either array! 
Also you must not modify either array, i.e., the values in the arrays upon return from the function must be the same as when the function was called. 
Note that the arrays do not have to have the same number of elements, they just have to have one of more copies of the same values.

If you are programming in Java or C#, the function prototype is:
    int equivalentArrays(int[] a1, int[] a2)

Hint: If your solution compares the length of the first array with the length of the second array or vice versa, you have misunderstood the problem!! 
Your solution does not need to determine which array is bigger!
*/
public class EquivalentArraysDemo2 //Perfect Answer!
{
    public static void main(String args[])
    {
        System.out.println(equivalentArrays(new int[] {0,1,2}, new int[] {2,0,1})); //1
        System.out.println(equivalentArrays(new int[] {0,1,2,1}, new int[] {2,0,1})); //1
        System.out.println(equivalentArrays(new int[] {2,0,1}, new int[] {0,1,2,1})); //1
        System.out.println(equivalentArrays(new int[] {0,5,5,5,1,2,1}, new int[] {5,2,0,1})); //1
        System.out.println(equivalentArrays(new int[] {5,2,0,1}, new int[] {0,5,5,5,1,2,1})); //1        
        System.out.println(equivalentArrays(new int[] {0,2,1,2}, new int[] {3,1,2,0})); //0
        System.out.println(equivalentArrays(new int[] {3,1,2,0}, new int[] {0,2,1,0})); //0
        System.out.println(equivalentArrays(new int[] {1,1,1,1,1,1}, new int[] {1,1,1,1,2})); //0
        System.out.println(equivalentArrays(new int[] {}, new int[] {3,1,1,1,1,2})); //0
        System.out.println(equivalentArrays(new int[] {}, new int[] {})); //1
        System.out.println(equivalentArrays(null, null)); //1
    }
    static int equivalentArrays(int[] a1, int[] a2)
    {
        if(a1 == null && a2 == null || a1.length == 0 && a2.length == 0) return 1;
        if(a1.length == 0 || a2.length == 0) return 0;

        for(int i = 0; i < a1.length; i++)
        {
            boolean flag1 = false;
            for(int j = 0; j < a2.length; j++)
                if(a1[i] == a2[j]) flag1 = true;
            if(flag1 == false) return 0;
        }
        for(int i = 0; i < a2.length; i++)
        {
            boolean flag2 = false;
            for(int j = 0; j < a1.length; j++)
                if(a2[i] == a1[j]) flag2 = true;
            if(flag2 == false) return 0;
        }

        return 1;
    }
}
