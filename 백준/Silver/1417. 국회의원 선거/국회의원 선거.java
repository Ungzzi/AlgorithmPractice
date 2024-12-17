import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static int N;
    static Integer[] M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int DS = -1;
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        Integer[] votes = new Integer[N - 1];

        if (N == 1) {
            System.out.println(0);
            return;
        }

        DS = Integer.parseInt(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            votes[i] = Integer.parseInt(br.readLine());
        }

        while (true) {
            Arrays.sort(votes, Collections.reverseOrder());
            if (DS > votes[0]) {
                break;
            }
            DS++;
            votes[0]--;
            cnt++;
        }

        System.out.println(cnt);
    }
}
