import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int cnt = 0;
    static String[][] map;
    static String[][] map2;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new String[N][N];
        map2 = new String[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                String color = arr[j];
                map[i][j] = color;
                if (color.equals("R")) {
                    map2[i][j] = "G";
                } else {
                    map2[i][j] = color;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 1) {
                for (boolean[] v : visited) {
                    Arrays.fill(v, false);
                }
                map = map2;
                cnt = 0;
            }
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (!visited[j][k]) {
                        bfs(k, j);
                        cnt++;
                    }
                }
            }
            System.out.print(cnt + " ");
        }
    }
    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        visited[y][x] = true;
        String color = map[y][x];
        q.add(new Point(x, y));

        while (!q.isEmpty()) {
            Point pos = q.poll();

            for (int i = 0; i < 4; i++) {
                int nX = pos.x + dx[i];
                int nY = pos.y + dy[i];

                if(nX < 0 || nX >= N || nY < 0 || nY >= N || visited[nY][nX]){continue;}

                String nColor = map[nY][nX];
                if (color.equals(nColor)) {
                    q.add(new Point(nX, nY));
                    visited[nY][nX] = true;
                }
            }
        }


    }
}