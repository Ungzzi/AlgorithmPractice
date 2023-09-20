import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;
    static int[][] dist;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        dist = new int[N][M];
        int[] t = new int[2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if (num == 2) {
                    t[0] = i;
                    t[1] = j;
                }
            }
        }

        bfs(t);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1 && dist[i][j] == 0) {
                    bw.write("-1 ");
                }else {
                    bw.write(dist[i][j] + " ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    public static void bfs(int[] t) {
        Queue<Point> q = new LinkedList<Point>();
        q.add(new Point(t[1], t[0]));

        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (!(nx == t[1] && ny == t[0]) && ny >= 0 && nx >= 0 && nx < M && ny < N && map[ny][nx] != 0 && dist[ny][nx] == 0) {
                    int preVal = dist[ny][nx];
                    int newVal = dist[p.y][p.x] + 1;
                    if (preVal == 0) {
                        dist[ny][nx] = newVal;
                        q.add(new Point(nx, ny));
                    }

                }
            }
        }
    }
}