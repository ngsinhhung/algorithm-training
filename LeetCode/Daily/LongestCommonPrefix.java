import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public String getPrefix(String s1, String s2){
        List<Character> rs = new ArrayList<>();
        int size = Integer.min(s1.length(), s2.length());
        for (int i = 0; i < size; i++) {
            if(s1.charAt(i) == s2.charAt(i)){
                rs.add(Character.valueOf(s1.charAt(i)));
            }
            
        }
        return rs.stream().map(ch -> String.valueOf(ch)).collect(Collectors.joining());
        
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs.length == 1){return "";}
        String prefix = getPrefix(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            prefix = this.getPrefix(prefix, strs[i]);
            
        }
        return prefix;
    }

    public String longestCommonPrefixSolution1(String[] strs){
        if(strs.length == 0){
            return "";
        }
        
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }  
        }


        return prefix;
    }

    public String longestCommonPrefixSolution2(String[] strs){
        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);

            for (int i = 1; i < strs.length; i++) {
                
                if(strs[i].length() == j || strs[i].charAt(j) != c){
                    return strs[0].substring(0, j);
                }
            }
        }


        return strs[0];
    }


    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefixSolution2(new String[]{"dog","racecar","car"}));
    }

}
