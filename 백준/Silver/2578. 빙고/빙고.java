import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B_SIZE = 5;
        int[][] cursor = new int[B_SIZE * B_SIZE + 1][2];
        boolean[][] board = new boolean[B_SIZE][B_SIZE];
        int answer = 0;

        for (int i = 0; i < B_SIZE; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < B_SIZE; j++) {
                int num = Integer.parseInt(st.nextToken());
                cursor[num][0] = i;
                cursor[num][1] = j;
            }
        }

        for (int i = 0; i < B_SIZE; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= B_SIZE; j++) {
                int num = Integer.parseInt(st.nextToken());
                int x = cursor[num][0];
                int y = cursor[num][1];
                board[x][y] = true;
                if (bingoCheck(board) >= 3) {
                    System.out.print(B_SIZE * i + j);
                    return;
                }
                ;
            }
        }
    }

    public static int bingoCheck(boolean[][] check) {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (check[i][0] && check[i][1] && check[i][2] && check[i][3] && check[i][4]) {
                cnt++;
            }
            if (check[0][i] && check[1][i] && check[2][i] && check[3][i] && check[4][i]) {
                cnt++;
            }
        }

        if (check[0][0] && check[1][1] && check[2][2] && check[3][3] && check[4][4]) {
            cnt++;
        }
        if (check[0][4] && check[1][3] && check[2][2] && check[3][1] && check[4][0]) {
            cnt++;
        }
        return cnt;
    }
}