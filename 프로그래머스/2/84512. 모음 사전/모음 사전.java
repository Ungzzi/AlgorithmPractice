import java.util.*;

class Solution {
    static String[] dict = {"A", "E", "I", "O", "U"};
    static int answer = 0;
    static boolean isFind = false;
    
    public int solution(String word) {     
        
        rec(word, new StringBuilder(), 0);
        
        return answer;
    }
    public void rec(String word, StringBuilder sb, int depth){
        if(word.equals(sb.toString())){
            isFind = true;
            return;
        }
        
        if(depth == 5) return;
        
        for(int i=0; i<5; i++){
            answer++;
            sb.append(dict[i]);
            rec(word, sb, depth+1);
            if(isFind) return;
            sb.delete(sb.length()-1, sb.length());
        }
    }
}