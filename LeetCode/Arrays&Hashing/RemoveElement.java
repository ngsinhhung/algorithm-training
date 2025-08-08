public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        while(k < n){
            if(nums[k] == val){
                nums[k] = nums[n - 1];
                n--;
            } else {
                k++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        System.out.println(re.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }
}
