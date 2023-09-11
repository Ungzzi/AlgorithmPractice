import java.util.*;

class Solution {
    
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int N;
    public static int M;

    public int solution(int[][] maps) {
        int answer = 0;
        N = maps.length - 1;
        M = maps[0].length - 1;

        int[][] visited = new int[N+1][M+1];

        bfs(maps, visited);

        answer = visited[N][M];

        if (answer == 0){
            answer = -1;
        }

        return answer;
    }

    public void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int cX = pos[0];
            int cY = pos[1];

            for (int i = 0; i < 4; i++) {
               int nX = cX + dx[i];
               int nY = cY + dy[i];

                if (nX >= 0 && nX <= N && nY >= 0 && nY <= M && visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }
        }
    }
}