class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] n_cloth = new int[n];
        int numStudent = n_cloth.length;
        
        for(int i=0; i<lost.length; i++){
            n_cloth[lost[i]-1] -= 1;
        }
        
        for(int i=0; i<reserve.length; i++){
            n_cloth[reserve[i]-1] += 1;
        }
        
        for(int i=0; i<numStudent; i++){
            // 옷이 도난당한 경우
            if(n_cloth[i] < 0){
                if(i-1>=0 && n_cloth[i-1] > 0){
                    n_cloth[i-1]--;
                    n_cloth[i]++;
                } else if(i+1 < numStudent && n_cloth[i+1] > 0){
                    n_cloth[i+1]--;
                    n_cloth[i]++;
                } else{
                    answer--;
                }
            }
        }
        
        return answer;
    }
}