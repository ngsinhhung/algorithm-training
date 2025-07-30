import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[]nums){
        HashSet<Integer> set = new HashSet<Integer>();

        for (int idx = 0; idx < nums.length; idx++) {
            if(set.contains(nums[idx])){
                return true;
            }
            set.add(nums[idx]);
        }
        return false;

    }

    public static void main(String[] args) {
        ContainsDuplicate s = new ContainsDuplicate();
        boolean rs = s.containsDuplicate(new int[]{1,2,3,4});
        System.out.println(rs);
    }

}
