import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();
        
        for (int price : prices) {
            queue.add(price);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < prices.length; i++) {
                int cnt = 0;
                int cur_val = queue.poll();
                for (int compare_val : queue) {
                    cnt++;
                    if (cur_val > compare_val) {
                        break;
                    }
                }
                answer[i] = cnt;
            }
        }

        return answer;
    }
}