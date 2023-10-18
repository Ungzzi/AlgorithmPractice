import java.util.*;

class Solution {
    static int total_pick = 0;
    static int mineralN = 0;
    static int total_mineral = 0;
    static int hp = 0;
    static int answer = Integer.MAX_VALUE;
    static int[][] minus = {{1,1,1},{5,1,1},{25,5,1}};
    
    public int solution(int[] picks, String[] minerals) {
        total_mineral = minerals.length;
        
        for(int pick : picks) total_pick += pick;
        
        dfs(picks, minerals, 0);
        
        return answer;
    }
    
    public static void dfs(int[] picks, String[] minerals, int used){
        if(used == total_pick || mineralN >= total_mineral){
            answer = Math.min(hp, answer);
            return;
        }
        
        for(int i=0; i<3; i++){
            if(picks[i] == 0) continue;
            int minedCnt = 0;         
            picks[i]--;
            minedCnt = mine(minerals, i);
            
            dfs(picks, minerals, used+1);
    
            unmine(minedCnt, minerals, i);            
            picks[i]++;
        }
    };
    
    public static int mine(String[] minerals, int pickType){
        int cnt = 0;
        for(int i=0; i<5; i++){
            if(mineralN >= total_mineral || mineralN < 0) return cnt;
            
            String mineral = minerals[mineralN];
            int minType = 0;        

            if(mineral.equals("diamond")){
                minType = 0;
            } else if(mineral.equals("iron")){
                minType = 1;
            } else{
                minType = 2;
            }
        
            hp += minus[pickType][minType];
            cnt++;
            mineralN++;
        
        }
        return cnt;
    }
    
    public static void unmine(int n, String[] minerals, int pickType){
        for(int i=0; i<n; i++){
            if(--mineralN < 0) break;
            
            String mineral = minerals[mineralN];
            int minType = 0;        

            if(mineral.equals("diamond")){
                minType = 0;
            } else if(mineral.equals("iron")){
                minType = 1;
            } else{
                minType = 2;
            }


            hp -= minus[pickType][minType];
        }
    }
}