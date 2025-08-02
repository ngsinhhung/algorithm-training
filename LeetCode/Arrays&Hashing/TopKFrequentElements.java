import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        maxHeap.addAll(map.keySet());


        int[] rs = new int[k];
        for (int i = 0; i < k; i++) {
            rs[i] = maxHeap.poll();
        }
        return rs;


    }
    public static void main(String[] args) {
        TopKFrequentElements t = new TopKFrequentElements();
        int [] rs = t.topKFrequent(new int[]{1}, 1);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
            
        }
    }

}
