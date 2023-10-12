class Solution {
    static int d_len;
    static boolean[] visit;
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        d_len = dungeons.length;
        visit = new boolean[d_len];
        dfs(k, 0, dungeons);
        return answer;
    }
    public void dfs(int hp, int depth, int[][] dungeons){
        
        if(depth == d_len) return;
        
        for(int i=0; i < d_len; i++){
            if(!visit[i] && hp >= dungeons[i][0]){
                visit[i] = true;
                answer = Math.max(answer, depth+1);
                dfs(hp - dungeons[i][1], depth+1, dungeons);
                visit[i] = false;
            }
        }
    }
}