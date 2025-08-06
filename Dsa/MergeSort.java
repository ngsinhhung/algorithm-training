public class MergeSort {
    public static void mergeSort(int [] array){
        int length = array.length;
        if(length <= 1){
            return; //base case
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // index right
        int j = 0; // index left

        for(; i < length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int [] leftArray, int [] rightArray, int[] array){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
         
        int i = 0; 
        int r = 0; // index of right array
        int l = 0; // index of left array

        // check condition for merging
        while (l < leftSize && r < rightSize) { 
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                l++;
                i++;
            }else {
                array[i] = rightArray[r];
                r++;
                i++;
            }
        }

        while(l < leftSize){
            array[i] = leftArray[l];
            l++;
            i++;
        }

        while(r < rightSize){
            array[i] = rightArray[r];
            r++;
            i++;
        }



    }


    public static void main(String[] args) {
        int [] arr = new int[] {3,7,8,5,4,2,6,1};

        MergeSort.mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
