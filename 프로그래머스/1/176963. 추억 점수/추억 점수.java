class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int p_len = photo.length;
        int[] answer = new int[p_len];
        
        for(int i=0; i<p_len; i++){
            String[] ph = photo[i];
            
            for(int j=0; j<name.length; j++){
                for(int k=0; k<ph.length; k++){
                    if(name[j].equals(ph[k])){
                        answer[i] += yearning[j];
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}