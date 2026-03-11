import java.util.*;

class Solution {

    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

      
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

       
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        return queue;
    }
}