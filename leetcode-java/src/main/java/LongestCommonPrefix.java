import java.util.Arrays;

/**
 * Problem : https://leetcode.com/problems/longest-common-prefix/description/
 * Submission : https://leetcode.com/problems/longest-common-prefix/submissions/1378941505/
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int count;
        Arrays.sort(strs);
        String str = "";
        String strCompare = strs[0];
        for(int i = strCompare.length(); i>=0; i--){
            count = 0;
            str = strCompare.substring(0,i);
            for(String str1 : strs){
                if(str1.startsWith(str))
                    count = count + 1;
            }
            if(count == strs.length)
                return str;
        }
        return "";
    }
}
