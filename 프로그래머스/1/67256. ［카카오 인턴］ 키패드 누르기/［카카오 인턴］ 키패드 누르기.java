import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] pad = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        int r_len = pad.length;
        int c_len = pad[0].length;
        int[] l_pos = {3,0};
        int[] r_pos = {3,2};
        
        for(int num : numbers){
            for(int i=0; i<r_len; i++){
                for(int j=0; j<c_len; j++){
                    if(pad[i][j] == num){
                        if(j == 0){
                            answer += "L";
                            l_pos[0] = i;
                            l_pos[1] = j;
                        } else if(j == 2){
                            answer += "R";
                            r_pos[0] = i;
                            r_pos[1] = j;
                        } else{
                            int l_dist = Math.abs(i - l_pos[0]) + Math.abs(j - l_pos[1]);
                            int r_dist = Math.abs(i - r_pos[0]) + Math.abs(j - r_pos[1]);
                            
                            if(l_dist < r_dist){
                                answer += "L";
                                l_pos[0] = i;
                                l_pos[1] = j;
                            } else if(l_dist > r_dist){
                                answer += "R";
                                r_pos[0] = i;
                                r_pos[1] = j;
                            } else{
                                if(hand.equals("left")){
                                    answer += "L";
                                    l_pos[0] = i;
                                    l_pos[1] = j;
                                } else{
                                    answer += "R";                           
                                    r_pos[0] = i;
                                    r_pos[1] = j;
                                }
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}