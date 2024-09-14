/**
 * submission : https://leetcode.com/problems/excel-sheet-column-title/submissions/1384508799/
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 *
 * For example:
 *
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 *
 *
 * Example 1:
 *
 * Input: columnNumber = 1
 * Output: "A"
 * Example 2:
 *
 * Input: columnNumber = 28
 * Output: "AB"
 * Example 3:
 *
 * Input: columnNumber = 701
 * Output: "ZY"
 *
 *
 * Constraints:
 *
 * 1 <= columnNumber <= 231 - 1
 */
public class ExcelNumbertoColumn {
    public String convertToTitle(int columnNumber) {
        char[] ch = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U',
                'V','W','X','Y','Z'};
        StringBuilder sb= new StringBuilder();
        int q = columnNumber,r = 0;
        do{
            q-=1;
            r = q % 26;
            q = q/26;
            sb.append(ch[r]);
        }while ( q > 0 );
        return sb.reverse().toString();
    }
}
