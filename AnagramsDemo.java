/* One word is an anagram of another word if it is a rearrangement of all the letters of the second word. 
For example, the character arrays {'s', 'i', 't'} and {'i', 't', 's'} represent words that are anagrams of one another 
because "its" is a rearrangement of all the letters of "sit" and vice versa. Write a function that accepts two character arrays 
and returns 1 if they are anagrams of one another, otherwise it returns 0. For simplicity, if the two input character arrays are equal, 
you may consider them to be anagrams.

If you are programming in Java or C#, the function signature is:
    int areAnagrams(char[] a1, char[] a2) 
    
Hint: Please note that "pool" is not an anagram of "poll" even though they use the same letters. Please be sure that your function 
returns 0 if given these two words! You can use another array to keep track of each letter that is found so that you don't count 
the same letter twice (e.g., the attempt to find the second "o" of "pool" in "poll" should fail.) 
Hint: do not modify either a1 or a2, i.e., your function should have no side effects! If your algorithm requires modification of 
either of these arrays, you must work with a copy of the array and modify the copy! 
*/
public class AnagramsDemo
{
    public static void main(String[] args)
    {
        System.out.println(areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 't', 's'}));
        System.out.println(areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[] {'b', 'o', 'g'}, new char[] {'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[] {}, new char[] {}));
        System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 'g'}));

        System.out.println(areAnagrams(new char[] {'p', 'o', 'o', 'l'}, new char[] {'p', 'o', 'l', 'l'}));
    }
    static int areAnagrams(char[] a1, char[] a2) 
    {
        if(a1.length != a2.length) return 0;

        for(int i = 0; i < a1.length; i++)
        {
            int freq1 = 0, j = 0;
            while(j < a1.length)
            {
                if(a1[i] == a1[j]) freq1++;
                j++;
            }
            int freq2 = 0, k = 0;
            while(k < a2.length)
            {
                if(a1[i] == a2[k]) freq2++;
                k++;
            }
            if(freq1 != freq2) return 0; //{System.out.println("freq1: "+freq1+", freq2: "+freq2); return 0;}
        }
        return 1;
    }
}