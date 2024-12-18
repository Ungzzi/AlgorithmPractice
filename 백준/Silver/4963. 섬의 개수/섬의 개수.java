import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Point {
    private int x, y;

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

public class Main {
    static int dx[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
    static int dy[] = { 1, 1, 1, 0, 0, -1, -1, -1 };
    static int map[][];
    static boolean visit[][];
    static int w;
    static int h;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            int cnt = 0;
            if (w == 0 && h == 0) {
                break;
            }
            map = new int[h][w];
            visit = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        bfs(new Point(j, i));
                        visit[i][j] = true;
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb.toString());
    }

    static void bfs(Point p) {
        Deque<Point> q = new ArrayDeque<>();
        q.add(p);

        while (!q.isEmpty()) {
            Point point = q.poll();

            for (int i = 0; i < 8; i++) {
                int new_x = point.getX() + dx[i];
                int new_y = point.getY() + dy[i];

                if (new_x < 0 || new_y < 0 || new_x >= w || new_y >= h) {
                    continue;
                }

                if (map[new_y][new_x] == 1 && !visit[new_y][new_x]) {
                    visit[new_y][new_x] = true;
                    q.add(new Point(new_x, new_y));
                }
            }
        }
    }
}