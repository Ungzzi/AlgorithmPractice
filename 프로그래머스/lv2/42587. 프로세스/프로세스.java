import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }
        while (!queue.isEmpty()) {
            int max_num = 0;
            for (int num : queue) {
                if (num > max_num) {
                    max_num = num;
                }
            }

            if (queue.peek() >= max_num) {
                answer++;
                if (location == 0) {
                    break;
                }
                queue.poll();
                location--;
            } else {
                queue.add(queue.poll());
                if (location == 0) {
                    location = queue.size() - 1;
                } else {
                    location--;
                }
            }
        }
        return answer;
    }
}