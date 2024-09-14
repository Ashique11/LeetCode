public class MergeStringsAlternatively {
        public String mergeAlternately(String word1, String word2) {
            int i=0;
            StringBuilder sb = new StringBuilder();

            if(word1.length() > word2.length())
            {

                for(i=0;i<word2.length(); i++) {
                    sb.append(word1.charAt(i));
                    sb.append(word2.charAt(i));
                }
                sb.append(word1.substring(i));
            }
            else if(word1.length() < word2.length()){
                for(i=0; i<word1.length(); i++){
                    sb.append(word1.charAt(i));
                    sb.append(word2.charAt(i));
                }
                sb.append(word2.substring(i));
            }
            else if(word1.length() == word2.length()){
                for(i=0;i<word2.length(); i++) {
                    sb.append(word1.charAt(i));
                    sb.append(word2.charAt(i));
                }
                sb.append(word1.substring(i));
            }

            return sb.toString();
        }
}
