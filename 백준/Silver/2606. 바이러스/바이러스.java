import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int result = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        bfs(1);

        System.out.println(result);
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            Iterator<Integer> it = graph[node].listIterator();
            while (it.hasNext()) {
                int w = it.next();
                if (!visited[w]) {
                    visited[w] = true;
                    result++;
                    q.add(w);
                }
            }
        }

    }
}
