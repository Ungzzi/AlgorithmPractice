import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Long minN = 1000001L;
        Long maxN = -1000001L;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            minN = Math.min(num, minN);
            maxN = Math.max(num, maxN);
        }
        System.out.println(minN + " " + maxN);
    }
    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}