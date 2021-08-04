import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Implement a stack with any data structure of your choice. The stack stores
 * integer values and each element must be unique.
 */
public class StackImplementation {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.toString());

        stack.pull();

        System.out.println("After pull");
        System.out.println(stack.toString());
    }
}

class MyStack {
    private HashMap<Integer, Integer> map;
    private Integer lastElement = 0; // Keep track of the last element
    private Integer size = 0; // number of elements, also act as index

    public MyStack() {
        /**
         * This stack uses a LinkedHashMap to implement as every key in a hashmap is
         * unique, and LinkedHashMap keeps the order of insertion.
         */
        map = new LinkedHashMap<>();
    }

    public void push(Integer num) {
        if (!map.containsKey(num)) {
            map.put(num, num);
            ++size;
            lastElement = num;
        } else {
            System.out.println(num + " is already in the stack.");
        }
    }

    public Integer pull() {
        if (size == 0) {
            System.out.println("The stack is empty");
            return -1;
        }
        // return the last element
        Integer pulledInt = map.get(lastElement);
        map.remove(lastElement);
        --size;
        lastElement = (Integer) map.keySet().toArray()[size - 1];
        return pulledInt;
    }

    public Integer size() {
        return this.size();
    }

    public String toString() {
        Set<Integer> set = map.keySet();
        String result = "";
        for (Integer key : set) {
            result += (key + "\n");
        }
        return result;
    }
}