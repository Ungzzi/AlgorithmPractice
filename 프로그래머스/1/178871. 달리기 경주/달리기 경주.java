import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int playerN = players.length;
        String[] answer = new String[playerN];
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> reverseMap = new HashMap<>();
        
        for (int i=0; i<playerN; i++){
            map.put(players[i], i);
            reverseMap.put(i, players[i]);
        }
        
        for(String call : callings){
            int curIdx = map.get(call);
            String prevPlayer = reverseMap.get(curIdx-1);
            
            map.replace(call, curIdx-1);
            map.replace(prevPlayer, curIdx);
            
            reverseMap.remove(curIdx-1);
            reverseMap.put(curIdx-1, call);
            reverseMap.put(curIdx, prevPlayer);
        }
        
        for(int i=0; i<playerN; i++){
            answer[i] = reverseMap.get(i);
        }
        
        
        return answer;
    }
}