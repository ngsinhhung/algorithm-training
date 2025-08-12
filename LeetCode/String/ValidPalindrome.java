

public class ValidPalindrome {
    public boolean  isPalindrome(String s) {
        char[] cha = s.toCharArray();
        int i = 0, j = cha.length - 1;
        while(i <= j){
            if(!Character.isLetterOrDigit(cha[i])){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(cha[j])){
                j--;
                continue;
            }

            if(Character.toLowerCase(cha[i]) != Character.toLowerCase(cha[j])){
                return false;
            }
            i++;
            j--;





            // if(Character.isLetterOrDigit(cha[i]) && Character.isLetterOrDigit(cha[j])){
            //     char left = Character.isUpperCase(cha[i]) ? Character.toLowerCase(cha[i]) : cha[i];
            //     char right = Character.isUpperCase(cha[j]) ? Character.toLowerCase(cha[j]) : cha[j];
            //     if(left != right){
            //         return false;
            //     }
            //     i++;
            //     j--;
            // } else {
            //     if(!Character.isLetterOrDigit(cha[i])){
            //         i++;
            //     } else {
            //         j--;
            //     }
            // }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("race a car"));
        // System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
    }

}
