public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = (l + r) / 2;
            
            if(target == nums[mid]){
                return mid;
            }

            if(target < nums[mid]){
                r = mid - 1;
            }

            if(target > nums[mid]){
                l = mid + 1;
            }
        }

        if(target > nums[l]){
            return l+1; 
        } 
        else {
            return l;
        }
        
    }

    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        System.out.println(s.searchInsert(new int[] {1}, 2));
        
    }

}
