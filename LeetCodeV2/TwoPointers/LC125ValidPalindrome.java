package LeetCodeV2.TwoPointers;

public class LC125ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] chs = s.toCharArray();
        int l = 0, r = chs.length - 1;

        while(l <= r){
            
            if(!Character.isLetterOrDigit(chs[l])) {
                l++;
                continue;
            }

            if(!Character.isLetterOrDigit(chs[r])) {
                r--;
                continue;
            }

            if(Character.toLowerCase(chs[l]) != Character.toLowerCase(chs[r])){
                return false;
            }
            l++;
            r--;
        }

        return true;

    }

    public static void main(String[] args) {
        LC125ValidPalindrome lc125 = new LC125ValidPalindrome();

        System.out.println(lc125.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(lc125.isPalindrome("race a car"));
        
    }
}
