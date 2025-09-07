package LeetCodeV2.SlidingWindow;

public class LC424LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLength = 0;
        int [] countChar = new int [26];
        int maxCountChar = 0;

        for (int r = 0; r < s.length(); r++) {
            countChar[(int) s.charAt(r) - 65]++;

            // int maxCountChar = Arrays.stream(countChar).max().getAsInt(); // O(n)
            maxCountChar = Math.max(maxCountChar, countChar[(int) s.charAt(r) - 65]);

            while((r - l + 1) - maxCountChar > k) {
                countChar[(int) s.charAt(l) - 65]--;
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LC424LongestRepeatingCharacterReplacement lc424 = new LC424LongestRepeatingCharacterReplacement();
        System.out.println(lc424.characterReplacement("AABAAC", 2));
        
    }

}
