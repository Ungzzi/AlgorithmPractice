class Solution {
    static int DIV = 1234567;
    public int solution(int n) {
        int answer = 0;    
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<n+1; i++){
            arr[i] = arr[i-2] % DIV + arr[i-1] % DIV;
        }
        answer = arr[n] % DIV;
        return answer;
    }
}