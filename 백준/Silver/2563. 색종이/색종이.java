import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean square[][] = new boolean[101][101];
        long result = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for (int j = L; j < L + 10; j++) {
                for (int j2 = B; j2 < B + 10; j2++) {
                    if (!square[j][j2]) {
                        square[j][j2] = true;
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}