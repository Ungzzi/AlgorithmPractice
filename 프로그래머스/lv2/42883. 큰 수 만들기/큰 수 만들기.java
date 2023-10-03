import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        int start = 0;
        int length = number.length();
        
        while(cnt < length-k){
            int max_n = 0;
            for(int i = start; i <= k + cnt; i++){
                int num = number.charAt(i) - '0';
                if (num > max_n){
                    max_n = num;
                    start = i + 1;
                }
            }
            answer.append(max_n);
            cnt++;
        }
        return answer.toString();
    }
}