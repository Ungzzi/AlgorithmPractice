import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max_v = Integer.MAX_VALUE - 1;
        int dp[] = new int[5001];

        dp[0] = max_v;
        dp[1] = max_v;
        dp[2] = max_v;
        dp[3] = 1;
        dp[4] = max_v;
        dp[5] = 1;

        if (N > 5) {
            for (int i = 6; i <= N; i++) {
                dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
            }
        }

        System.out.println(dp[N] >= max_v ? -1 : dp[N]);
    }
}