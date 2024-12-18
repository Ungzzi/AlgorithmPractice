import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb;
    static boolean[] isUsed;
    static int[] arr;
    static int M, N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        isUsed = new boolean[N + 1];
        arr = new int[M];

        go(0, 1);

        System.out.println(sb);
    }

    static void go(int dep, int num) {
        if (dep == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = num; i <= N; i++) {
            arr[dep] = i;
            go(dep + 1, i);
        }
    }
}