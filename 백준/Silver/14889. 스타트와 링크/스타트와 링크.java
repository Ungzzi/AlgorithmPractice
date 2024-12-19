import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int diff = Integer.MAX_VALUE;
    static int[][] ability;
    static boolean[] isSelected;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ability = new int[N][N];
        isSelected = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                ability[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        go(0, 0);
        System.out.println(diff);
    }

    static void go(int dep, int num) {
        if (dep == N / 2) {
            int start_team = 0;
            int link_team = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (isSelected[i] && isSelected[j]) {
                        start_team += ability[i][j];
                        start_team += ability[j][i];
                    } else if (!isSelected[i] && !isSelected[j]) {
                        link_team += ability[i][j];
                        link_team += ability[j][i];
                    }
                }
            }
            diff = Math.min(diff, Math.abs(start_team - link_team));
            return;
        }

        for (int i = num; i < N; i++) {
            isSelected[i] = true;
            go(dep + 1, i + 1);
            isSelected[i] = false;
        }
    }
}