import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long roomN = Integer.parseInt(br.readLine());
        int[] cnt = new int[11];
        int max = 0;
        while (roomN > 0) {
            int n = (int) roomN % 10;
            if (n == 6 || n == 9) {
                if (cnt[6] < cnt[9]) {
                    n = 6;
                } else if (cnt[9] < cnt[6]) {
                    n = 9;
                }
            }
            cnt[n]++;
            max = Math.max(max, cnt[n]);
            roomN /= 10;
        }
        System.out.println(max);
    }
}