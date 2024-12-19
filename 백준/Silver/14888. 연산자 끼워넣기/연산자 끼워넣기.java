import java.util.*;
import java.io.*;

public class Main {
    static int[] num;
    static int[] cal = new int[4];
    static int N;
    static int max_n = Integer.MIN_VALUE;
    static int min_n = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            cal[i] = Integer.parseInt(st.nextToken());
        }

        go(1, num[0]);

        StringBuilder sb = new StringBuilder();
        sb.append(max_n).append("\n").append(min_n);
        System.out.println(sb);
    }

    static void go(int dep, int prev) {
        if (dep >= N) {
            max_n = Math.max(max_n, prev);
            min_n = Math.min(min_n, prev);
            return;
        }

        for (int j = 0; j < 4; j++) {
            if (cal[j] > 0) {
                cal[j]--;
                int val = calculate(prev, num[dep], j);
                go(dep + 1, val);
                cal[j]++;
            }
        }
    }

    static int calculate(int a, int b, int calIdx) {
        int val = 0;
        switch (calIdx) {
            case 0:
                val = a + b;
                break;
            case 1:
                val = a - b;
                break;
            case 2:
                val = a * b;
                break;
            case 3:
                val = a / b;
                break;
        }
        return val;
    }

}