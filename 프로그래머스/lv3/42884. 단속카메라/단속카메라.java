import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        int length = routes.length;
        Arrays.sort(routes, (o1, o2) -> {
            return o1[1] - o2[1];
        });
        for (int i=0; i<length; i++){
            int jump = 0;
            for (int j=i+1; j<length; j++){
                if(routes[j][0] <= routes[i][1]){
                    jump++;
                } else {
                    i += jump;
                    answer += 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}