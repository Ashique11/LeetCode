/**
 * My submission : https://leetcode.com/problems/valid-parentheses/submissions/1379695729/
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParanthesis {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        StringBuilder closedString = new StringBuilder();
        for(int i=0; i<chars.length;i++){
            if(chars[i] == '(' )
                closedString.append(')');
            else if(chars[i] == '{')
                closedString.append('}');
            else if(chars[i] == '[')
                closedString.append(']');
            else if(closedString.length() > 0){
                if (chars[i] == ')' && closedString.charAt(closedString.length() - 1) == ')') {
                    closedString.setLength(closedString.length() - 1);
                } else if (chars[i] == ']' && closedString.charAt(closedString.length() - 1) == ']') {
                    closedString.setLength(closedString.length() - 1);
                } else if (chars[i] == '}' && closedString.charAt(closedString.length() - 1) == '}') {
                    closedString.setLength(closedString.length() - 1);
                } else {
                    return false;
                }
            }
            else
                return false;
        }
        if(closedString.length()>0)
            return false;
        return true;
    }

}
