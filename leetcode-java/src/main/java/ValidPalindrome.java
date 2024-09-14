/**
 * https://leetcode.com/problems/valid-palindrome/submissions/1383497716/
 *A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int j = s.length()-1, i=0 , x,y;
        while(i < j){
            x = s.charAt(i);
            y = s.charAt(j);
            if(!((x>=97 && x<=122) || (x>=65 && x<=90) || (x>=48 && x<=57))) {
                i += 1;
                continue;
            }
            else if(!((y>=97 && y<=122) || (y>=65 && y<=90) || (y>=48 && y<=57))){
                j-=1;
                continue;
            }
            else {
                if(x>=65 && x<=90)
                    x+=32;
                if(y>=65 && y<=90)
                    y+=32;
                if(x != y)
                    return false;
            }
            i++;
            j--;
        }
        return Boolean.TRUE;
    }
}
