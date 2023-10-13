import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Stack<String> stack = new Stack<>();
        stack.push(words[0]);
        
        for(int i=1; i<words.length; i++){
            String prev = words[i-1];
            String cur = words[i];
            
            if(stack.contains(cur) || prev.charAt(prev.length()-1) != cur.charAt(0)){
                answer[0] = i % n + 1;
                answer[1] = (int) Math.ceil((i+1) / (double)n);
                break;
            }
            stack.push(cur);
        }

        return answer;
    }
}