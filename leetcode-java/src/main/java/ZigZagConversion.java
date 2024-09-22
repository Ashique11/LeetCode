
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows > s.length())
            return s;
        int n = 0,i=0,j=0;
        char[][] multiCharArr = new char[numRows][s.length()];
        StringBuilder sb = new StringBuilder();
        while(n < s.length()){
            if(i == numRows)
            {
                i--;
                while (i>1){
                    i--;
                    j++;
                    multiCharArr[i][j] = s.charAt(n);
                    n++;
                    if(n > (s.length()-1))
                        break;
                }
                i=0;
                j++;
            }
            else {
                multiCharArr[i][j] = s.charAt(n);
                i++;
                n++;
            }
        }
        int maxColumn = j;
        j =0;
        for(i=0; i<numRows; i++){
            while(j<=maxColumn) {
                if(multiCharArr[i][j] != '\0') {
                    sb.append(multiCharArr[i][j]);
                }
                j++;
            }
            j=0;
        }
        return sb.toString();
    }

}
