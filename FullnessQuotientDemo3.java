/* Define the full quotient of an integer n > 0 to be the number of representations of n in 
base 2 through 9 that have no zeros anywhere after the most significant digit. For example, 
to see why the fullness quotient of 94 is 6. Examine the following table which shows the 
representations of 94 in bases 2 through 9.
94 = (1011110)2, 94 = (10111)3, 94 = (1132)4, 94 = (334)5, 94 = (234)6, 94 = (163)7,
94 = (136)8, & 94 =(114)9.

Notice that the representations of 94 in base 2 and 3 both have 0s somewhere after the most
significant digit, but the representations in bases 4,5,6,7,8,9 do not. Since there are 6 such
representations, the fullness quotient of 94 is 6.
Examples:
if n is	    return	Because
1	        8	Because all of its representations do not have a 0 anywhere after the most significant digit: 
                2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9
9	        5	Because 5 of the representations (4, 5, 6, 7, 8) do not have a 0 anywhere after the most significant digit: 
                2: 1001, 3: 100, 4: 21, 5: 14, 6: 13, 7: 12, 8: 11, 9: 10
360	        0	All its representations have a 0 somewhere after the most significant digit: 
                2: 101101000, 3: 111100, 4: 11220, 5: 2420, 6: 1400, 7: 1023,8: 550, 9: 440
-4	        -1	The argument must be > 0
*/
public class FullnessQuotientDemo3 
{
    public static void main(String[] args)
    {  
        System.out.println(fullnessQuotient(1)); //8
        System.out.println(fullnessQuotient(9)); //5
        System.out.println(fullnessQuotient(360)); //0
        System.out.println(fullnessQuotient(-4)); //-1
        System.out.println(fullnessQuotient(94)); //6
    }
    static int fullnessQuotient(int n)
    {
        if(n < 1) return -1;

        int count = 0;
        for(int i = 2; i < 10; i++)
            if(isThereZero(n, i) == false) count++;

        return count;
    }
    static boolean isThereZero(int num, int base)
    {
        while(num >= base)
        {
            if(num % base == 0) return true;
            num = num/base;
        }
        return false;
    }
}
