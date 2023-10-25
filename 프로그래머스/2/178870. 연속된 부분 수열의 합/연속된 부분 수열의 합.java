class Solution {
    public int[] solution(int[] sequence, int k) {
        int start = 0;
        int end = 0;
        int length = sequence.length;
        int[] answer = {0, length};
        int sum = 0;
        
        for(int i=0; i<length; i++){
            end = i;
            sum += sequence[end];
            
            while(sum > k){
                sum -= sequence[start++];
            }
            
            if(sum == k){
                if(end-start < answer[1] - answer[0]){
                    answer[0] = start;
                    answer[1] = end;
                }
            }
        }
        return answer;
    }
}