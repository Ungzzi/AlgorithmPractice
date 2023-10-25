import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] arr = new int[10000001];
        
        for(int t : tangerine){
            arr[t] += 1;
        }
        
        Arrays.sort(arr);
        
        int cnt = 0;
        for(int i=arr.length-1; i>=0; i--){
            cnt += arr[i];
            answer += 1;
            if(cnt >= k) break;
        }
        return answer;
    }
}