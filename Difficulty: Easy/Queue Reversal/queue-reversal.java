import java.util.*;

class Solution {

    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        if(queue.isEmpty()){
            return queue;
        }
        int front = queue.poll();
        reverseQueue(queue);
        queue.offer(front);

        return queue;
    }
}