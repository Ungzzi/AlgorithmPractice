import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visit;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        list = new ArrayList[M+1];
        visit = new boolean[M + 1];
        for (int i = 0; i <= M; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list[u].add(v);
            list[v].add(u);
        }
        int cnt = 0;
        for (int i = 1; i <= M; i++) {
            if (!visit[i]) {
                Queue<Integer> q = new LinkedList();
                bfs(q, i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void bfs(Queue<Integer> q, int num) {
        q.add(num);
        while (!q.isEmpty()) {
            int n = q.poll();
            ArrayList<Integer> newList = list[n];
            for (int i = 0; i < newList.size(); i++) {
                Integer node = newList.get(i);
                if (!visit[node]) {
                    visit[node] = true;
                    q.add(node);
                }
            }

        }
    }
}