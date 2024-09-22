public class Atoi {
    public int myAtoi(String s) {
        long i=0;
        int j=0,neg=0;
        s=s.trim();
        if(s.length() <= 0) return 0;
        if(s.charAt(j) == 45 || s.charAt(j) == 43) {
            if(s.charAt(j) == 45)
                neg =1;
            j++;
        }
        if(j >= s.length()) return 0;
        while (s.charAt(j) == 48) {
            j++;
            if(j >= s.length())
                return 0;
        }
        for(int k = j; k < s.length(); k++){
            if((s.charAt(k)>=48 && s.charAt(k)<=57)){
                i = (i*10) + (s.charAt(k)-48);
                if(neg == 1 && i > 2147483647)
                    return Integer.MIN_VALUE;
                if(neg !=1 && i >= 2147483647 )
                    return Integer.MAX_VALUE;
            }
            else
                break;
        }
        if(neg == 1) return (int) -i;
        return (int) i;
    }
}
