import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;

        boolean[] arr = new boolean[N + 1];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= N; i++) {
            for (int j = 1; i * j <= N; j++) {
                if (!arr[i * j]) {
                    arr[i * j] = true;
                    cnt++;
                    if (cnt == K) {
                        System.out.println(i * j);
                        return;
                    }
                }
            }
        }

    }
}