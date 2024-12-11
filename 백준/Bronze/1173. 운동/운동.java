import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int time = 0;
        int cnt = 0;
        int cur = m;

        if (M - m >= T) {
            while (cnt < N) {
                if (cur + T <= M) {
                    cur += T;
                    cnt++;
                } else {
                    cur = cur - R >= m ? cur - R : m;
                }
                time++;
            }
        }

        System.out.println(time > 0 ? time : -1);
    }
}