import java.util.HashSet;
import java.util.Set;

public class MinimumNumberOfOperationsToMakeElementsInArrayDistinct {
    public int minimumOperations(int[] nums) {
        int countOpe = 0;
        Set<Integer> hashSet = new HashSet<>();
        boolean isDictinct = false;

        int i = 0;
        int firstIndex = 0;
        while(i < nums.length){
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            } else {
                isDictinct = true;
                countOpe++;
                firstIndex = firstIndex + 3;
            }

            if(isDictinct){
                i = firstIndex;
                isDictinct = false;
                hashSet = new HashSet<>();
                continue;
            }
            i++;
        }
        return countOpe;
    }

    public static void main(String[] args) {
        MinimumNumberOfOperationsToMakeElementsInArrayDistinct obj = new MinimumNumberOfOperationsToMakeElementsInArrayDistinct();
        int rs = obj.minimumOperations(new int[]{6,7,8,9});
        System.out.println(rs);
        
    }

}