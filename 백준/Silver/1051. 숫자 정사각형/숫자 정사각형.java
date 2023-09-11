import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        int minNum = Math.min(M, N);
        int maxSq = 0;
        int cnt = 0;
        int[][] sq = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                sq[i][j] = str.charAt(j) - '0';
            }
        }

        while (minNum > cnt) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (i + cnt >= N || j + cnt >= M) {
                        continue;
                    } else {
                        if (sq[i][j] == sq[i + cnt][j] &&
                                sq[i + cnt][j] == sq[i][j + cnt] &&
                                sq[i][j + cnt] == sq[i + cnt][j + cnt]) {
                                maxSq = cnt+1;
                        }
                    }
                }
            }
            cnt++;
        }

        answer = maxSq * maxSq;
        System.out.println(answer);
    }
    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}