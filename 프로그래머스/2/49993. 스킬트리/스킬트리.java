import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        boolean flag = true;
        for(int i=0; i<skill_trees.length; i++){
            String skill_tree = skill_trees[i];
            int turn = 0;

            for(int j=0; j<skill_tree.length(); j++){
                char cur = skill_tree.charAt(j);
                flag = true;
                for(int k=0; k< skill.length(); k++){
                    char sk = skill.charAt(k);
                    if(cur == sk){
                        if(turn == k){
                            turn++;
                        } else{
                            flag = false;
                            break;
                        }
                    }
                }
                if(!flag) break;
            }
            if(!flag) continue;
            answer++;
        }

        return answer;
    }
}