import java.util.Scanner;

public class NumberPalindrome {
    public void numPalindrome(){
        int N=121,rev=0,digit=0,copy=0;
       copy = N;
       while(N != 0){
           digit = N%10;
           rev= (rev*10) + digit;
           N=N/10;
       }
       if(copy == rev)
           System.out.println("Palindrome");
    }
}
