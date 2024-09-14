/**
 * Problem : https://leetcode.com/problems/roman-to-integer/description/
 * Solution : https://leetcode.com/problems/roman-to-integer/submissions/1378495962/
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

public class RomanToInt {
    public int romanToInt(String s) {
        int  n=0;
        char[] ch;
        ch = s.toCharArray();
        for(int i=0; i< ch.length; i++){
            if(ch[i] == 'I')
            {
                if(i < ch.length-1 && (ch[i+1] == 'V' || ch[i + 1] == 'X')) {
                    if (ch[i + 1] == 'V') {
                        n = n + 4;
                        i = i + 1;
                    } else if (ch[i + 1] == 'X') {
                        n = n + 9;
                        i = i + 1;
                    }
                }
                else
                    n = n+1;
            }
            else if(ch[i] == 'X' ){
                if(i < ch.length -1 && (ch[i + 1] == 'L' || ch[i + 1] == 'C')) {
                    if (ch[i + 1] == 'L') {
                        n = n + 40;
                        i = i + 1;
                    } else if (ch[i + 1] == 'C') {
                        n = n + 90;
                        i = i + 1;
                    }
                }
                else
                    n= n+10;
            }
            else if(ch[i] == 'C') {

                if(i < ch.length-1 && (ch[i + 1] == 'D' || ch[i+1] == 'M')) {
                    if (ch[i + 1] == 'D'){
                        n= n + 400;
                        i = i+1;
                    }
                    else if(ch[i+1] == 'M'){
                        n = n+900;
                        i=i+1;
                    }
                }
                else
                    n=n+100;
            }
            else{
                if(ch[i] == 'I')
                    n = n+1;
                else if(ch[i] == 'V')
                    n=n+5;
                else if(ch[i] == 'L')
                    n = n+50;
                else if(ch[i] == 'D')
                    n = n+500;
                else if(ch[i] == 'M')
                    n = n+1000;
            }
        }
        return n;
    }
}
