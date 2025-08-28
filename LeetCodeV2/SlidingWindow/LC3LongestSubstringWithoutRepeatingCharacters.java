package LeetCodeV2.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LC3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        int l = 0, r = 0;
        int maxLength = 0;

        Set<Character> setChars = new HashSet<>();

        while(r < chars.length){
            while(setChars.contains(chars[r])){
                setChars.remove(chars[l]);
                l++;
            }

            setChars.add(chars[r]);
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        

        return maxLength;
    }

    public static void main(String[] args) {
        LC3LongestSubstringWithoutRepeatingCharacters lc3 = new LC3LongestSubstringWithoutRepeatingCharacters();
        System.out.println(lc3.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lc3.lengthOfLongestSubstring("abcdedabcfak"));
    }

}
