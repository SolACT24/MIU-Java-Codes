/* An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded and followed by the same number of non-zero elements. 

Write a function named isHollow that accepts an integer array and returns 1 if it is a hollow array, otherwise it returns 0. 

The function signature is:
    int isHollow(int[] a);

Examples:  isHollow({1,2,4,0,0,0,3,4,5}) returns 1.  
           isHollow ({1,2,0,0,0,3,4,5}) returns 0. :  
           isHollow ({1,2,4,9,0,0,0,3,4,5}) returns 0.  
           isHollow ({1,2,0,0,3,4}) returns 0.
*/
public class HollowDemo3 //Perfect Answer!!!!
{
    public static void main(String[] args)
    {
        System.out.println(isHollow(new int[] {1, 2, 0, 0, 0, 3, 4})); //1
        System.out.println(isHollow(new int[] {1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18})); //1
        System.out.println(isHollow(new int[] {1, 2, 0, 0, 3, 4})); //0
        System.out.println(isHollow(new int[] {1, 2, 0, 0, 0, 3, 4, 5})); //0
        System.out.println(isHollow(new int[] {3, 8, 3, 0, 0, 0, 3, 3})); //0
        System.out.println(isHollow(null)); //0
        /*
        System.out.println(isHollow(new int[] {1,2,0,0,0,3,4,0})); //0 ---
        System.out.println(isHollow(new int[] {0,1,2,0,0,0,3,4})); //0
        System.out.println(isHollow(new int[] {0,0,0})); //1
        System.out.println(isHollow(new int[] {1,2,4,0,0,0,3,4,5})); //1
        System.out.println(isHollow(new int[] {1,2,4,9,0,0,0,3,4,5})); //0
        System.out.println(isHollow(new int[] {})); //0
        */
        
    }
    static int isHollow(int[] a)
    {
        if(a == null) return 0;

        int begin = 0, mid = 0, end = 0;
        boolean beginFlag = false, midFlag = false;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != 0 && beginFlag == false) begin++;
            if(a[i] == 0 && midFlag == false)
            {
                mid++;
                beginFlag = true;
            }
            if(a[i] != 0 && beginFlag == true)
            {
               end++;
               midFlag = true;
            }
            //if(a[i] == 0 && beginFlag == true && midFlag == true) return 0; //This is very important!!!!         
        }
        //System.out.println("begin: "+begin+", mid: "+mid+", end: "+end);
        if(mid < 3 || begin != end) return 0;

        return 1;
    }
}
