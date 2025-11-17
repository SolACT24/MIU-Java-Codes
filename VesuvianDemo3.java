/* A number n is vesuvian if it is the sum of TWO different PAIRS of SQUARES. 
For example, 50 is vesuvian because 50 == 25 + 25 and 1 + 49. 
The numbers 65 (1+64, 16+49) and 85 (4+81, 36+49) are also vesuvian. 

{789 of the first 10,000 integers are vesuvian.} ----- What does it mean???????

Write a function named isVesuvian that returns 1 if its parameter is a vesuvian number, otherwise it returns 0. 

Hint: be sure to verify that your function detects that 50 is a vesuvian number!
*/
public class VesuvianDemo3
{
    public static void main(String[] args)
    {
        System.out.println(isVesuvian(50)); //1
        System.out.println(isVesuvian(65)); //1
        System.out.println(isVesuvian(85)); //1
        System.out.println(isVesuvian(100)); //0
    }
    static int isVesuvian(int n)
    {
        int count = 0;
        for(int i = 1, j = n-1; i <= n/2 && j >= n/2; i++, j--)
            if(isSquare(i) == true && isSquare(j) == true) count++;
        if(count == 2) return 1;

        return 0;
    }
    static boolean isSquare(int n)
    {
        int i = 1, prod = 0;
        while(prod < n)
        {
            prod = i * i;
            i++;
        }
        if(prod == n) return true;
        
        return false;
    }
}