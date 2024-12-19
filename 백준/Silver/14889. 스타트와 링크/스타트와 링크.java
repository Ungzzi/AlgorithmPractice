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
            ArrayList<Integer> start = new ArrayList<>();
            ArrayList<Integer> link = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (isSelected[i]) {
                    start.add(i);
                } else {
                    link.add(i);
                }
            }
            diff = Math.min(diff, Math.abs(getScore(start) - getScore(link)));
            return;
        }

        for (int i = num; i < N; i++) {
            isSelected[i] = true;
            go(dep + 1, i + 1);
            isSelected[i] = false;
        }
    }

    static int getScore(ArrayList<Integer> score) {
        int sum = 0;
        for (int i = 0; i < N / 2; i++) {
            for (int j = i + 1; j < N / 2; j++) {
                int x = score.get(i);
                int y = score.get(j);
                sum += ability[x][y];
                sum += ability[y][x];
            }
        }
        return sum;
    }
}