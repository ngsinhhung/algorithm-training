

public class ValidPalindrome {
    public boolean  isPalindrome(String s) {
        char[] cha = s.trim().toLowerCase().toCharArray();
        if(cha.length == 0){return true;}
        String temp = new String();
        for (int i = 0; i < cha.length; i++) {
            if(Character.isLetterOrDigit(cha[i])){
                temp = temp.concat(Character.toString(cha[i]));
            }
        }
        
        char [] chaTemp = temp.toCharArray();
        int i = 0;
        int j = chaTemp.length - 1;
        while (i < j) { 
            if(chaTemp[i] != chaTemp[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome(" "));
    }

}
