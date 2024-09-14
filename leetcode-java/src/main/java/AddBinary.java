/**
 * submission : https://leetcode.com/problems/add-binary/submissions/1382977157/
 *Given two binary strings a and b, return their sum as a binary string.
 *
 *
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 *
 * Constraints:
 *
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        char ch1, ch2;
        boolean carryOver = Boolean.FALSE;
        int len = Math.max(a.length(), b.length());
        int currentLen = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder a1 = new StringBuilder(a);
        StringBuilder b1 = new StringBuilder(b);
        if (a.length() > b.length()) {
            currentLen = a.length() - b.length();
            for (int i = 0; i < currentLen; i++)
                b1.insert(i, '0');
            b1.setLength(a.length());
        } else if (b.length() > a.length()) {
            currentLen = b.length() - a.length();
            for (int i = 0; i < currentLen; i++)
                a1.insert(i, '0');
            a1.setLength(b.length());
        }
        for (int i = (len - 1); i >= 0; i--) {
            ch1 = a1.charAt(i);
            ch2 = b1.charAt(i);
            if (ch1 == '1' && ch2 == '1' && carryOver) {
                sb.append('1');
                carryOver = Boolean.TRUE;
            } else if (((ch1 == '1' && ch2 == '0') || (ch1 == '0' && ch2 == '1')) && carryOver) {
                sb.append('0');
            } else if ((ch1 == '0' && ch2 == '0') && carryOver) {
                sb.append('1');
                carryOver = Boolean.FALSE;
            } else if (ch1 == '1' && ch2 == '1') {
                sb.append('0');
                carryOver = Boolean.TRUE;
            } else if ((ch1 == '1' && ch2 == '0') || (ch1 == '0' && ch2 == '1')) {
                sb.append('1');
            } else
                sb.append('0');
        }
        if (carryOver)
            sb.append(1);
        return sb.reverse().toString();
    }
}
