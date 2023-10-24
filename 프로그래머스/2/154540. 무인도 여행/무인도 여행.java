import java.util.*;

class Solution {
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, -1, 0, 1};
    static boolean[][] visited;
    static int N;
    static int M;
    
    public int[] solution(String[] maps) {
        int[] answer = {-1};
        ArrayList<Integer> list = new ArrayList<>();
        N = maps.length;
        M = maps[0].length();
        visited = new boolean[N][M];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(maps[i].charAt(j) == 'X' || visited[i][j]) continue;
                int days = bfs(j, i, maps);
                if(days > 0){
                    list.add(days);
                }
            }
        }
        int cnt = list.size();
        
        if(cnt > 0){
            Collections.sort(list);
            answer = new int[cnt];
            for(int i=0; i<cnt; i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
    
    public static int bfs(int x, int y, String[] maps){
        int day = 0;
        
        visited[y][x] = true;
        
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x,y));
        
        while(!q.isEmpty()){
            Node cur = q.poll();
            day += maps[cur.y].charAt(cur.x) - '0';
            
            for(int i=0; i<4; i++){
                int nX = cur.x + dx[i];
                int nY = cur.y + dy[i];
                
                if(nX < 0 || nX >= M || nY < 0 || nY >= N) continue;
                if(maps[nY].charAt(nX) == 'X' || visited[nY][nX]) continue;
                
                visited[nY][nX] = true;
                q.add(new Node(nX, nY));    
            }
        }
        return day;
    }
    
    public static class Node{
        int x;
        int y;
        
        private Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}