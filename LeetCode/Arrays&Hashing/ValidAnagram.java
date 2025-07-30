
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        String[] splitS = s.split("");
        Map<String, Integer> mapS = new HashMap<>();

        String[] splitT = t.split("");
        Map<String, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(mapS.containsKey(splitS[i])){
                Integer val = mapS.get(splitS[i]) + 1;
                mapS.replace(splitS[i], val);
            } else {
                mapS.put(splitS[i], 1);
            }

            if(mapT.containsKey(splitT[i])){
                Integer val = mapT.get(splitT[i]) + 1;
                mapT.replace(splitT[i], val);
            } else {
                mapT.put(splitT[i], 1);
            }
        }

        return mapS.equals(mapT);
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        boolean rs = va.isAnagram("rat", "car");
        System.out.println(rs);
    }
}
