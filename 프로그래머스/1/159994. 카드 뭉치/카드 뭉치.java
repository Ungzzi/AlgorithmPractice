class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idxA = 0;
        int idxB = 0;
        int lenA = cards1.length;
        int lenB = cards2.length;
        
        for(String target : goal){
            if(idxA < lenA){
                if(cards1[idxA].equals(target)){
                    idxA++;
                    continue;
                }
            } 
            if(idxB < lenB){
                if(cards2[idxB].equals(target)){
                    idxB++;
                    continue;
                }
            }
            
            answer = "No";
            break;
        }
        
        return answer;
    }
}