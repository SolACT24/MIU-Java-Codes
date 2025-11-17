 /* Write a function named nextPerfectSquare that returns the first perfect square that is greater than its integer argument. 
 A perfect square is an integer that is equal to some integer squared. For example, 16 is a perfect square because 16 = 4 * 4. 
 However, 15 is not a perfect square because there is no integer n such that 15 = n * n. 

 The signature of the function is:
    int isPerfectSquare(int n)
Examples
n       next perfect square
6       9
36      49
0       1
-5      0
 */
 public class NextPerfectSquareDemo2 //Perfect Answer!
 {
     public static void main(String[] args)
     {
        System.out.println(isPerfectSquare(6)); //9
        System.out.println(isPerfectSquare(36)); //49
        System.out.println(isPerfectSquare(0)); //1
        System.out.println(isPerfectSquare(-5)); //0
        System.out.println(isPerfectSquare(15)); //16
     }
     static int isPerfectSquare(int n)
     {
        if(n < 0) return 0;

        int i = 0;
        while(true)
        {
            if(i * i > n) return i * i;
            i++;
        }
     }
 }