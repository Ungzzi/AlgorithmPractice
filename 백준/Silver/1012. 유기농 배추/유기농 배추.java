import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static boolean visited[][];
    public static int map[][];
    public static int dx[];
    public static int dy[];
    public static int M;
    public static int N;
    public static int K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        dx = new int[] { 1, 0, -1, 0 };
        dy = new int[] { 0, 1, 0, -1 };

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            int cnt = 0;
            map = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            for (int j = 0; j < N; j++) {
                for (int j2 = 0; j2 < M; j2++) {
                    if (map[j][j2] == 1 && !visited[j][j2]) {
                        bfs(new Point(j2, j));
                        cnt++;
                    }
                }
            }
            sb.append(cnt);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void bfs(Point p) {
        Deque<Point> q = new ArrayDeque<>();
        q.add(p);

        while (!q.isEmpty()) {
            Point pos = q.poll();
            int x = pos.getX();
            int y = pos.getY();
            visited[y][x] = true;

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX < 0 || newX >= M || newY < 0 || newY >= N) {
                    continue;
                }
                if (map[newY][newX] == 1 && !visited[newY][newX]) {
                    q.add(new Point(newX, newY));
                    visited[newY][newX] = true;
                }
            }
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
