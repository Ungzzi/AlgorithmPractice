import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        
        Queue<Integer> wait = new LinkedList<>();
        for (int w : truck_weights) {
            wait.add(w);
        }
        
        Queue<Integer> br = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            br.add(0);
        }
        
        while (!br.isEmpty()) {
            br.poll();
            answer++;
            sum = br.stream().mapToInt(i -> i).sum();
            if (!wait.isEmpty()) {
                if (wait.peek() + sum <= weight) {
                    br.add(wait.poll());
                } else {
                    br.add(0);
                }
            }
        }
        return answer;
    }
}