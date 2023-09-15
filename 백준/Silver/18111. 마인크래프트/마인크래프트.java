import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int maxH = 0;
        int minH = 501;
        int minT = Integer.MAX_VALUE;
        int ansH = 1;
        int sum = 0;

        // map 만들기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int h = Integer.parseInt(st.nextToken());
                map[i][j] = h;
                sum += h;
                maxH = Math.max(maxH, h);
                minH = Math.min(minH, h);
            }
        }

        for (int i = minH; i <= maxH; i++) {
            int t = 0;
            int Block = B;
            
            // 블록이 부족한 경우
            if ((N * M * i) > (sum + Block)) {
                continue;
            }

            // 목표 높이 i, 현재 높이 h
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int h = map[j][k];
                    // 블록 제거 작업 2초
                    if (h > i) {
                        t += (h - i) * 2;
                        Block += h - i;
                    }
                    // 블록 추가 작업 1초
                    else if(h < i) {
                        t += i - h;
                        Block -= i - h;
                    }
                }
            }
            minT = Math.min(t, minT);
            if (t == minT) {
                ansH = i;
            }
        }
        System.out.println(minT + " " + ansH);
    }
}