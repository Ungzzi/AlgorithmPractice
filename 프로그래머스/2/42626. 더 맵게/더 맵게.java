import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int s : scoville){
            pq.add(s);
        }
        
        while(pq.size() > 1 && pq.peek() < K){
            int value = pq.poll() + (pq.poll() * 2);
            pq.add(value);
            answer++;
        }
        
        if (pq.peek() < K) return -1;
        
        
        return answer;
    }
}