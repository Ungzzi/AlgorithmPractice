import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int length = people.length;
        int last = length-1;
        boolean[] move = new boolean[length];
        Arrays.sort(people);
        for(int i=0; i<length; i++){
            for(int j=last; j>i; j--){
                last = j-1;
                if(people[i] + people[j] <= limit){
                    move[i] = true;
                    move[j] = true;
                    answer++;
                    break;
                } else {
                    move[j] = true;
                    answer++;
                }
            }
            if(i < length -1 && move[i+1]) {
                if (move[i]) {

                } else{
                    move[i] = true;
                    answer++;
                }
                break;
            }
        }

        return answer;
    }
}