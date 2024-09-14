/**
 * Problem : https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
 * My submission : https://leetcode.com/problems/greatest-common-divisor-of-strings/submissions/1376264381/
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 *
 *
 * Example 1:
 *
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 *
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 *
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 *
 * Constraints:
 *
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */
public class GCDString {
    public String gcdOfStrings(String str1, String str2) {
        String GCD = "";
        StringBuilder str11 = new StringBuilder(str1);
        StringBuilder str12 = new StringBuilder(str2);
        String strToCompare= str1.length() < str2.length() ? str1 : str2;
        String str="";
        StringBuilder constructedWord= new StringBuilder();
        for(int i=0;i<strToCompare.length();i++){
            constructedWord.setLength(0);
            str = str+strToCompare.charAt(i);
            while (constructedWord.length()<str1.length()){
                constructedWord.append(str);
            }
            if(constructedWord.compareTo(str11)==0){
                constructedWord.setLength(0);
                while (constructedWord.length()<str2.length())
                    constructedWord.append(str);
                if(constructedWord.compareTo(str12) == 0)
                    GCD = str;
            }
        }
        return GCD;
    }
}
