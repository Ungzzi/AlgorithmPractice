import java.awt.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;
    static Queue<Point> q;
    static int N;
    static int M;
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        q = new LinkedList<>();
        map = new int[N][M];
        ans = 0;

        for (int i = 0; i <N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int inf = Integer.parseInt(st.nextToken());
                map[i][j] = inf;

                if (inf == 2) {
                    q.add(new Point(j, i));
                }
            }
        }

        addWall(0);

        System.out.println(ans);
    }
    public static void addWall(int cnt) {
        if (cnt == 3){
            bfs();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 0){
                    map[i][j] = 1;
                    addWall(cnt+1);
                    map[i][j] = 0;
                }
            }
        }
    }
    public static void bfs() {
        Queue<Point> copyQ = new LinkedList<>();
        int[][] copyMap = new int[N][M];

        for (int i = 0; i < N; i++) {
            copyMap[i] = map[i].clone();
        }

        for (int i = 0; i < q.size(); i++) {
            Point tmp = q.poll();
            copyQ.add(tmp);
            q.add(tmp);
        }

        while (!copyQ.isEmpty()) {
            Point pos = copyQ.poll();

            for (int i = 0; i < 4; i++) {
                int nX = pos.x + dx[i];
                int nY = pos.y + dy[i];

                if (nX < 0 || nX >= M || nY < 0 || nY >= N || copyMap[nY][nX] != 0){continue;}

                copyQ.add(new Point(nX, nY));
                copyMap[nY][nX] = 2;

            }
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (copyMap[i][j] == 0) {
                    cnt++;
                }
            }
        }
        ans = Math.max(ans, cnt);
    }
}