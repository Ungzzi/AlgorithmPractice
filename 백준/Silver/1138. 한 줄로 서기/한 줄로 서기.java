import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        boolean[] visit = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int curNum = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (!visit[j]) {
                    cnt++;
                    if (cnt == curNum + 1) {
                        answer[j] = i+1;
                        visit[j] = true;
                        break;
                    }
                }
            }
        }

        for (int n : answer) {
            System.out.print(n+" ");
        }
    }


    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}