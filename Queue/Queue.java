import java.util.LinkedList;
import java.util.Queue;

public class Pila{
    public static void main(String[] args) throws Exception {
        
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Mikoy");
        queue.offer("Mhigs");
        queue.offer("Mark");
        queue.offer("Michael");

        //System.out.println(queue.isEmpty());
        //System.out.println(queue.size());
        //System.out.println(queue.contains("Mikoy"));
    }
}
