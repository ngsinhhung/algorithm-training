package LeetCodeV2.TwoPointers;

public class LC344ReverseString {
    public char[] reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while(l <= r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }

        return s;
    }

    public static void main(String[] args) {
        LC344ReverseString lc344 = new LC344ReverseString();
        char [] rs = lc344.reverseString(new char[]{'h','e','l','l','o'});

        for (char elem : rs) {
            System.out.println(elem);
        }

    }
}
