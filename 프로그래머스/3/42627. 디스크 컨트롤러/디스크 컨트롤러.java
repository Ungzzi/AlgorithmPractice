import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int length = jobs.length;
        int idx = 0;
        int end = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((o1, o2) -> o1[1] - o2[1]);
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        
        while(idx < length || !pq.isEmpty()){
            while(idx < length && jobs[idx][0] <= end){
                pq.add(jobs[idx++]);
            }
            if(pq.isEmpty()){
                end = jobs[idx][0];
            } else{
                int[] job = pq.poll();
                end += job[1];
                answer += end - job[0];
            }
        }
        return answer / length;
    }
}