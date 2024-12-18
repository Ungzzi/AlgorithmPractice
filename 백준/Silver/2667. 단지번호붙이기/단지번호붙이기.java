import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

class Point {
    int x;
    int y;

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
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> result = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            map[i] = row
                    .chars()
                    .map(c -> c - '0')
                    .toArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j] && map[i][j] == 1) {
                    result.add(bfs(new Point(j, i)));
                }
            }
        }

        Collections.sort(result);

        sb.append(result.size());
        for (Integer num : result) {
            sb.append("\n").append(num);
        }

        System.out.println(sb.toString());
    }

    static int bfs(Point p) {
        int cnt = 1;
        Deque<Point> q = new ArrayDeque<>();
        q.add(p);
        visit[p.getY()][p.getX()] = true;

        while (!q.isEmpty()) {
            Point pos = q.poll();
            pos.getX();
            pos.getY();

            for (int i = 0; i < 4; i++) {
                int new_x = pos.getX() + dx[i];
                int new_y = pos.getY() + dy[i];

                if (new_x < 0 || new_y < 0 || new_x >= N || new_y >= N) {
                    continue;
                }

                if (!visit[new_y][new_x] && map[new_y][new_x] == 1) {
                    visit[new_y][new_x] = true;
                    q.add(new Point(new_x, new_y));
                    cnt++;
                }
            }
        }
        return cnt;
    }
}