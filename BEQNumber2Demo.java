/* A BEQ number is one whose cube contains exactly four 6’s. For example, 806 is a BEQ number 
because 806*806*806 = 523,606,616 which has four 6’s. But 36 is not a BEQ number because its cube is 46,656 which has only three 6’s. 
And neither is 1,118 because its cube is 1,676,676,672 which contains five 6’s. 

Write a function named findSmallestBEQ that returns the smallest BEQ number. The function signature is:
   int findSmallestBEQnumber()

Hint use modulo base 10 arithmetic and integer division to get the digits of an integer.
*/
public class BEQNumber2Demo
{
    public static void main(String[] args)
    {
        System.out.println(findSmallestBEQnumber());
    }
    static long findSmallestBEQnumber()
    {
        long BEQ = 1;

        while(true)
        {
            System.out.println("BEQ: "+BEQ+", Prod: "+BEQ*BEQ*BEQ);
            if(numOfSix(BEQ*BEQ*BEQ) == true) break;
            BEQ++;
        }  
        return BEQ; 
    }
    static boolean numOfSix(long prod)
    {
        int count = 0;
        while(true)
        {
            
            if(prod % 10 == 6) count++;
            prod = prod / 10; 
            if(prod < 10 && prod == 6)
            {
                count++;
                break;
            }
            if(prod < 10 && prod != 6) break;
        }
        if(count == 4) return true;
        else return false;
    }
}