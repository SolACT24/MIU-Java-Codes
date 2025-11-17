/* Let us define two arrays as SET EQUAL if every element in one is also in the other and vice-versa. 
For example, any two of the following are equal to one another: {1, 9, 12}, {12, 1, 9}, {9, 1, 12, 1}, {1, 9, 12, 9, 12, 1, 9}. 
Note that {1, 7, 8} is not set equal to {1, 7, 1} or {1, 7, 6}.   

Write a function named isSetEqual(int[] a, int[] b) that returns 1 if its array arguments are set equal, otherwise it returns 0. 
*/
public class SetEqualDemo2 //Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(isSetEqual(new int[] {1, 9, 12}, new int[] {12, 1, 9})); //1
        System.out.println(isSetEqual(new int[] {1, 9, 12}, new int[] {9, 1, 12, 1})); //1
        System.out.println(isSetEqual(new int[] {1, 9, 12}, new int[] {1, 9, 12, 9, 12, 1, 9})); //1
        System.out.println(isSetEqual(new int[] {9, 1, 12, 1}, new int[] {1, 9, 12, 9, 12, 1, 9})); //1      
        System.out.println(isSetEqual(new int[] {1, 7, 8}, new int[] {1, 7, 1})); //0
        System.out.println(isSetEqual(new int[] {1, 7, 8}, new int[] {1, 7, 6})); //0
    }
    static int isSetEqual(int[] a, int[] b)
    {
        for(int i = 0; i < a.length; i++) //This is to check a with b!
        {
            boolean flag = false;
            for(int j = 0; j < b.length; j++)
                if(a[i] == b[j]) flag = true;
            if(flag == false) return 0;
        }
        for(int i = 0; i < b.length; i++) //This is to b with a (vice-versa)!
        {
            boolean flag = false;
            for(int j = 0; j < a.length; j++)
                if(b[i] == a[j]) flag = true;
            if(flag == false) return 0;
        }
        return 1;
    }
}
