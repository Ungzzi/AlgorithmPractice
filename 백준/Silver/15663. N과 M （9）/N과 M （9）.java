import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int arr[];
    static int store[];
    static Map<String, String> map = new HashMap<>();
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

        go(0);

        System.out.println(sb);
    }

    static void go(int dep) {
        if (dep == M) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb2.append(store[i]).append(" ");
            }
            String num = sb2.toString();
            if (map.get(num) != null) {
                return;
            }
            map.put(num, "!");
            sb.append(num).append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                store[dep] = arr[i];
                go(dep + 1);
                isUsed[i] = false;
            }
        }
    }

}