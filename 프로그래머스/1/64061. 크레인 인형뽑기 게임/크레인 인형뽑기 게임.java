import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int w = board[0].length;
        int h = board.length;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<moves.length; i++){
            int idx = moves[i] - 1;
            for(int j=0; j<h; j++){
                int doll = board[j][idx];
                if(doll > 0){
                    if(!stack.empty() && stack.peek() == doll){
                        stack.pop();
                        answer+=2;
                    } else{
                        stack.add(doll);
                    }
                    board[j][idx] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}