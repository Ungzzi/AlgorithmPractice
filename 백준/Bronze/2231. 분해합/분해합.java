import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int sum = 0;
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 1; i < N; i++) {
            int tmp = i;
            sum = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (sum == N) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}