import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class QueueImplementation {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(13);
        queue.push(15);
        queue.push(153);
        queue.push(11);
        queue.push(13);

        prt("Size of queue: " + queue.size());
        prt(queue.toString());

        queue.pop();

        prt("After pop, size = " + queue.size());
        prt(queue.toString());
    }

    public static void prt(String str) {
        System.out.println(str);
    }
}

class MyQueue {
    private HashMap<Integer, Integer> map;
    private Integer size = 0;
    private Integer firstElement = 0;

    public MyQueue() {
        map = new LinkedHashMap<>();
    }

    public void push(Integer num) {
        if (size == 0) {
            firstElement = num;
        }
        if (map.containsKey(num)) {
            System.out.println(num + " is already in the queue");
            return;
        }
        map.put(num, num);
        ++size;
    }

    public Integer pop() {
        if (size == 0) {
            System.out.println("There is no element in the queue");
            return -1;
        }
        Integer resultToReturned = map.get(firstElement);
        map.remove(firstElement);
        --size;
        firstElement = (Integer) map.keySet().toArray()[0];
        return resultToReturned;
    }

    public Integer size() {
        return this.size;
    }

    @Override
    public String toString() {
        String result = "";
        Set<Integer> set = map.keySet();

        if (size == 0) {
            return "Empty queue";
        }
        for (Integer key : set) {
            result += (key + "\n");
        }
        return result;
    }
}
