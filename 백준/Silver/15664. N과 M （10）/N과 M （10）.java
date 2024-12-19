import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int arr[];
    static int store[];
    static boolean isUsed[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        store = new int[M];
        isUsed = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        go(0, 0);

        System.out.println(sb);
    }

    static void go(int dep, int num) {
        if (dep == M) {
            for (int i = 0; i < M; i++) {
                sb.append(store[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = -1;

        for (int i = num; i < N; i++) {
            if (!isUsed[i] && before != arr[i]) {
                isUsed[i] = true;
                store[dep] = arr[i];
                before = arr[i];
                go(dep + 1, i + 1);
                isUsed[i] = false;
            }
        }
    }

}