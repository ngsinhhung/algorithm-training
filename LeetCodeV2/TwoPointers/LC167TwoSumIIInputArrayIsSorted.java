public class LC167TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int [] rs = new int[2];

        while(l <= r){
            int sum = numbers[r] + numbers[l];

            if(sum == target) {
                rs[0] = l + 1;
                rs[1] = r + 1;
                break;
            }

            if(sum < target){
                l++;

            }

            if(sum > target){
                r--;
            }

        }

        return rs;
    }

    public static void main(String[] args) {
        LC167TwoSumIIInputArrayIsSorted lc167 = new LC167TwoSumIIInputArrayIsSorted();
        int [] rs = lc167.twoSum(new int[] {-1,0}, -1);

        for (Object elem : rs) {
            System.out.println(elem);
        }
    }

}
