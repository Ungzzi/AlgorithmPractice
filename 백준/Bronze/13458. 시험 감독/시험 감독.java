import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] room = new long[N];
        long[] mng = new long[2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        mng[0] = Integer.parseInt(st2.nextToken());
        mng[1] = Integer.parseInt(st2.nextToken());
        long cnt = N;

        for(int i=0; i<N; i++) {
            room[i] = Integer.parseInt(st.nextToken()) - mng[0];
            if (room[i] > 0) {
                cnt += Math.ceil(room[i] / mng[1]);
                if (room[i] % mng[1] != 0) {
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }
}
