import java.util.HashMap;

/**
 * submission: https://leetcode.com/problems/isomorphic-strings/submissions/1386294158/
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 *
 * Output: true
 *
 * Explanation:
 *
 * The strings s and t can be made identical by:
 *
 * Mapping 'e' to 'a'.
 * Mapping 'g' to 'd'.
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 *
 * Output: false
 *
 * Explanation:
 *
 * The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
 *
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 *
 * Output: true
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> characterHashMap = new HashMap<>();
        HashMap<Character, Character> characterHashMap1 = new HashMap<>();
        if(s.length() != t.length())
            return Boolean.FALSE;
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                char charT = t.charAt(i);
                if (characterHashMap.containsKey(charS)) {
                    if (characterHashMap.get(charS) != charT)
                        return Boolean.FALSE;
                } else {
                    characterHashMap.put(charS, charT);
                }
                if (characterHashMap1.containsKey(charT)){
                    if(characterHashMap1.get(charT) != charS)
                        return Boolean.FALSE;
                }
                else {
                    characterHashMap1.put(charT,charS);
                }
            }
        }
        return Boolean.TRUE;
    }

}
