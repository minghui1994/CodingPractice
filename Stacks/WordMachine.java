import java.util.Stack;

/**
 * You are given a list of strings ops where each element is either:
 * 
 * A non-negative integer that should be pushed into a stack "POP" meaning pop
 * the top element in the stack "DUP" meaning duplicate the top element in the
 * stack "+" meaning pop the top two and push the sum "-" meaning pop the top
 * two and push top - second Return the top element in the stack after applying
 * all operations.
 * 
 * If there are any invalid operations, return -1.
 */

public class WordMachine {

    public static final String DUP = "DUP";
    public static final String POP = "POP";
    public static final String ADD = "+";
    public static final String NEGATE = "-";

    public static void main(String[] args) {
        String[] ops = { "1", "5", "DUP", "3", "-" };
        System.out.println(solve(ops));
    }

    public static int solve(String[] ops) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < ops.length; ++i) {
            if (ops[i].equals(POP)) {
                if (stk.size() == 0) {
                    return -1;
                }
                stk.pop();
            } else if (ops[i].equals(DUP)) {
                if (stk.size() == 0) {
                    return -1;
                }
                stk.push(stk.peek());
            } else if (ops[i].equals(ADD)) {
                if (stk.size() < 2) {
                    return -1;
                }
                stk.push(stk.pop() + stk.pop());
            } else if (ops[i].equals(NEGATE)) {
                if (stk.size() < 2) {
                    return -1;
                }
                stk.push(stk.pop() - stk.pop());
            } else {
                stk.push(Integer.parseInt(ops[i]));
            }
        }

        return stk.pop();
    }
}
