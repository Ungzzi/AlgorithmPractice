import java.util.*;
class Solution {
    public class Number {
        int num;
        int idx;
        
        public Number(int num, int idx){
            this.num = num;
            this.idx = idx;
        }
        
    }
    public int[] solution(int[] numbers) {
        int N = numbers.length;
        int[] answer = new int[N];
        Arrays.fill(answer, -1);
        
        PriorityQueue<Number> pq = new PriorityQueue<>((o1, o2) -> o1.num - o2.num);
        
        for(int i=0; i<N; i++){
            int cur = numbers[i];
            
            while(!pq.isEmpty() && pq.peek().num < cur){
                Number pick = pq.poll();
                answer[pick.idx] = cur;
            }
            pq.add(new Number(numbers[i], i));
        }
        
        return answer;
    }
}