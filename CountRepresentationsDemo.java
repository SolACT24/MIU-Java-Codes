/* Write a function named countRepresentations that returns the number of ways that an amount of maney in rupees can be represented as rupee notes. 

For this problem we only use rupee notes in denominatios of 1, 2, 5 and 20 rupee notes.

The signature of the function is:
    int countRepresentations(int numRupees){}

For example, countRepresentations(12) should return 15 because 12 rupees can be represented in the following 15 ways.
1) 12 * one rupee notes
2) 10 * one rupee notes + 1 * two rupee note  
3) 8 * one rupee notes + 2 * two rupee notes  
4) 6 * one rupee notes + 3 * two rupee notes  
5) 4 * one rupee notes + 4 * two rupee notes  
6) 2 * one rupee notes + 5 * two rupee notes  
7) 6 * two rupee notes
8) 1 * five rupee notes + 7 * one rupee notes
9) 1 * five rupee note + 1 * two rupee note + 5 * one rupee notes
10) 1 * five rupee note + 2 * two rupee notes + 3 * one rupee notes
11) 1 * five rupee note + 3 * two rupee notes + 1 * one rupee notes
12) 2 * five rupee notes + 2 * one rupee notes
13) 2 * five rupee notes + 1 * two rupee note
14) 1 * ten rupee note + 2 * one rupee notes
15) 1 * ten rupee note + 1 * two rupee notes

Hint: Use a nested loop that looks like this. Please fill in the blanks intelligently, i.e. minimize the number of times that the if statement is executed.

for(int rupee20 = 0; rupee20 <= __; rupee20++)

for(int rupee10 = 0; rupee10 <= __; rupee10++)

for(int rupee5 = 0; rupee5 <= __; rupee5++)

for(int rupee2 = 0; rupee2 <= __; rupee2++)

for(int rupee1 = 0; rupee1 <= __; rupee1++)
{
    if(__) count++;
}
*/
public class CountRepresentationsDemo 
{
    public static void main(String[] args)
    {
        System.out.println(countRepresentations(12)); //15
        System.out.println(countRepresentations(20)); //41
    }    
    static long countRepresentations(int numRupees) //1, 2, 5, 10, 20
    {
        long count = 0;
        // 1*x + 2*y + 5*z + 10*s
        for(int rupee20 = 0; rupee20 <= numRupees/20; rupee20++)
        {
            for(int rupee10 = 0; rupee10 <= numRupees/10; rupee10++)
            {
                for(int rupee5 = 0; rupee5 <= numRupees/5; rupee5++)
                {
                    for(int rupee2 = 0; rupee2 <= numRupees/2; rupee2++)
                    {
                        for(int rupee1 = 0; rupee1 <= numRupees/1; rupee1++)
                            if(1*rupee1 + 2*rupee2 + 5*rupee5 + 10*rupee10 + 20*rupee20 == numRupees) count++;  
                    }
                }
            }
        }
        return count;
    }
}


