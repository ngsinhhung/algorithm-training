
import java.util.Arrays;



public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }


        int[] newNums = new int[digits.length + 1];
        newNums[0] = 1;
        return newNums;
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        System.out.println(Arrays.toString(po.plusOne(new int[]{9})));
    }

}
