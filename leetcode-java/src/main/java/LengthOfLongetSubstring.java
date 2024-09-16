import java.util.*;

/**
 * s="AshiqueShereef"
 */
public class LengthOfLongetSubstring {
    public int lengthOfLongestSubstring(String s) {
        int arrlen = s.length();
        if (arrlen == 0 || arrlen == 1)
            return arrlen;
       int start = 0;
       int end;
       char ch;
       int maxLen=0;
        Set<Character> integerSet = new HashSet<>();
       for(end = 0 ; end < arrlen; end++){
           ch = s.charAt(end);
           while (integerSet.contains(ch)){
               integerSet.remove(s.charAt(start));
               start++;
           }
           integerSet.add(ch);
           maxLen = Math.max(maxLen, end-start+1);
       }
       return maxLen;
    }
}
