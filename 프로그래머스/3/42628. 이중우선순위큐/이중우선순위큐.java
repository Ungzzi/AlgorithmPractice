import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> reverseQ = new PriorityQueue<>((o1,o2) -> o2 - o1);
        for(String operation : operations){
            String[] op = operation.split(" ");  
            switch(op[0]){
                case "I":
                    pq.offer(Integer.parseInt(op[1]));
                    break;
                case "D":
                    if(op[1].equals("1")){
                        reverseQ.addAll(pq);
                        reverseQ.poll();
                        pq.clear();
                        pq.addAll(reverseQ);
                        reverseQ.clear();
                    } else{
                       pq.poll(); 
                    }
                    break;
            }
        }
        if(pq.size() > 1){
            answer[1] = pq.poll();
            reverseQ.addAll(pq);
            answer[0] = reverseQ.poll();
        } else if(pq.size() == 1){
            answer[0] = pq.poll();
            answer[1] = answer[0];
        }
        else {
            answer[0] = 0;
            answer[1] = 0;
        }
        
        return answer;
    }
}