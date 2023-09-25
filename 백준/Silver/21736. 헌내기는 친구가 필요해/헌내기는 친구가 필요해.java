//OXIP
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int N = 0;
    static int M = 0;
    static String[][] map;
    static int x;
    static int y;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new String[N][M];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                String info = arr[j];
                map[i][j] = info;
                if (info.equals("I")) {
                    x = j;
                    y = i;
                }
            }
        }
        bfs(x, y);
        if (cnt == 0) {
            System.out.println("TT");
        } else {
            System.out.println(cnt);
        }
    }

    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        map[y][x] = "X";

        while (!q.isEmpty()) {
            Point pos = q.poll();

            for (int i = 0; i < 4; i++) {
                int nX = pos.x + dx[i];
                int nY = pos.y + dy[i];

                if (nX < 0 || nX >= M || nY < 0 || nY >= N) {
                    continue;
                }

                String cur = map[nY][nX];

                if (cur.equals("X")) {continue;}
                if (cur.equals("P")) {
                    cnt++;
                }
                map[nY][nX] = "X";

                q.add(new Point(nX, nY));
            }
        }
    }
}