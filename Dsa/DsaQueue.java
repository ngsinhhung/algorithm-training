import java.util.LinkedList;
import java.util.Queue;

public class DsaQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Minecraft");
        queue.offer("GtaVice");
        queue.offer("Gta4");
        queue.offer("Gta5");

        System.out.println(queue.poll());

        System.out.println(queue);
        
    }

}
