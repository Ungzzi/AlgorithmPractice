import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static boolean[] visit; static int[] num;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N + 1];
        num = new int[N + 1];

        backTracking(0);

        System.out.println(sb);
    }
    public static void backTracking(int cnt) {
        if (cnt == M){
            for(int i = 0; i<M; i++){
                sb.append(num[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= N; i++){
            if(visit[i]) continue;
            visit[i] = true;
            num[cnt] = i;
            backTracking(cnt + 1);
            visit[i] = false;
        }
    }
}