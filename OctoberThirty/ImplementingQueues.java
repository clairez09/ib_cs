package OctoberThirty;
import java.util.*;
public class ImplementingQueues {
    private Queue<Integer> queue;
    public ImplementingQueues() {
        queue = new LinkedList<>();
    }
    public void enqueue(int element){
    queue.add(element);
    }
    public Integer dequeue() {
    if(queue.isEmpty()) {
        System.out.println("Queue is empty");
        return null;
    }
    int removed = queue.remove();
    System.out.println(removed);
    return removed;
    }
    public Integer peek() {
    if (queue.isEmpty()) {
        System.out.println("Queue is empty");
        return null;
    }
    return queue.peek();
    }
    public boolean isEmpty() {
    return queue.isEmpty();
    }
    public static void main(String[] args) {
        ImplementingQueues q = new ImplementingQueues();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
    }

}
