//https://leetcode.com/problems/group-anagrams/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str :strs) {
            char[] strC = str.toCharArray();
            Arrays.sort(strC);

            String key = new String(strC);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
    

    public static void main(String[] args) {
        GroupAnagrams gA = new GroupAnagrams();

        List<List<String>> rs = gA.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        System.out.println(rs);
    }
}
