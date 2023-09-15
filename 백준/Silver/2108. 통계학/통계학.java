import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final Long M = 1234567891L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] res = new int[N];
        int[] cntArr = new int[8001];
        Long sum = 0L;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
            cntArr[num + 4000]++;
        }

        int prev = 0;
        for (int i = 0; i < 8001; i++) {
            cntArr[i] += prev;
            prev = cntArr[i];
        }

        for (int i = N-1; i >= 0; i--) {
            int num = arr[i];
            res[--cntArr[num+4000]] = num;
        }

        int mode = 10000;
        int mode_max = 0;
        boolean flag = true;

        for (int i = 0; i < N; i++) {
            int jump = 0;
            int cnt = 1;
            int i_value = res[i];
            for (int j = i+1; j < N; j++) {
                if (i_value != res[j]) {
                    break;
                }
                cnt++;
                jump++;
            }
            if (cnt > mode_max) {
                mode_max = cnt;
                mode = i_value;
                flag = true;
            } else if (cnt == mode_max && flag == true) {
                mode = i_value;
                flag = false;
            }
            i += jump;
        }

        System.out.println(Math.round(sum / (double) N));
        System.out.println(res[N/2]);
        System.out.println(mode);
        System.out.println(res[N-1] - res[0]);

    }
}