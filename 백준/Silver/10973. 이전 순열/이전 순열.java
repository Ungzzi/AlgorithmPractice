import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        M = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            M[i] = Integer.parseInt(st.nextToken());
        }
        if (prevPermutation(M[0]) || N == 1) {
            sb.append("-1");
        } else {
            for (int i = 0; i < N; i++) {
                sb.append(M[i]);
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }

    public static boolean prevPermutation(int firstVal) {
        int tmp;
        int idx = 0;
        boolean flag = false;

        for (int i = N - 1; i >= 1; i--) {
            if (M[i - 1] > M[i]) {
                for (int j = N - 1; j > i - 1; j--) {
                    if (M[i - 1] > M[j]) {
                        tmp = M[i - 1];
                        M[i - 1] = M[j];
                        M[j] = tmp;
                        idx = i;
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                break;
            }
        }

        Integer[] subArray = Arrays.stream(M, idx, N)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(subArray, Collections.reverseOrder());

        for (int i = 0; i < subArray.length; i++) {
            M[idx + i] = subArray[i];
        }

        return M[0] > firstVal;
    }
}
