import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] board;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void partition(int row, int column, int size) {
        if (checkBoard(row, column, size)) {
            if (board[row][column] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        size /= 2;
        if (size > 0) {
            partition(row, column, size);
            partition(row + size, column, size);
            partition(row, column + size, size);
            partition(row + size, column + size, size);
        }
    }
    public static boolean checkBoard(int row, int column, int size) {
        int flag = board[row][column];
        for (int i = row; i < row + size; i++) {
            for (int j = column; j < column + size; j++) {
                if (flag != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}