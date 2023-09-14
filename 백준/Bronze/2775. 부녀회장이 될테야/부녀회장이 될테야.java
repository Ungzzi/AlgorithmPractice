import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] apt = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apt[0][i] = i+1;
            apt[i][0] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int K = Integer.parseInt(br.readLine());

            System.out.println(apt[N][K-1]);
        }
    }
}