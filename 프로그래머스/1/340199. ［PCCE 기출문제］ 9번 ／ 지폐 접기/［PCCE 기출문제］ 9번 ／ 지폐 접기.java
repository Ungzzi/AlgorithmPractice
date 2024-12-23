class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int max_n = Math.max(bill[0], bill[1]);
        int min_n = Math.min(bill[0], bill[1]);
        int max_w = Math.max(wallet[0], wallet[1]);
        int min_w = Math.min(wallet[0], wallet[1]);
        
        while(true){
            if(max_n > max_w || min_n > min_w){
                int tmp = max_n /= 2;
                max_n = Math.max(tmp, min_n);
                min_n = Math.min(tmp, min_n);
                answer += 1;
                continue;
            }
            break;
        }
        
        return answer;
    }
}