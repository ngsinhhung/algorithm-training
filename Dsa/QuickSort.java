public class QuickSort {
    public static int partition(int l, int h, int[] array){
        int pivot = array[l];

        int i = l, j = h;
        while(i < j){

            while(array[i] <= pivot){
                i++;
            }

            while(array[j] > pivot){
                j--;
            }
            
            if(i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[l];
        array[l] = array[j];
        array[j] = temp;

        return j;
    }

    public static void quickSort(int l, int h, int[] array){

        if(l < h){
            int j = partition(l, h, array);
            quickSort(l, j, array);
            quickSort(j + 1, h, array);

        }

    }

    public static void main(String[] args) {
        int [] nums = new int[] {10, 16, 8, 12, 15, 6, 3, 9, 5};
        QuickSort.quickSort(0, nums.length - 1, nums);

        for (int elem : nums) {
            System.out.println(elem);
        }
    }

}
