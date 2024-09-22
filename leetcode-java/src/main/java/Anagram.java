
public class Anagram {

    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if((slen != tlen)) return false;
        int[] charIntArr = new int[27];
        int i,el;
        for(i=0; i<slen; i++)
            charIntArr[s.charAt(i)-'a']++;
        for(i=0; i<tlen; i++){
            el = --charIntArr[t.charAt(i)-'a'];
            if(el < 0) return false;
        }
        return true;
    }
}
