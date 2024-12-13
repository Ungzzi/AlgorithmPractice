import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][4];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        Arrays.sort(arr, (a, b) -> {
            if (isSame(a[3], b[3])) {
                if (isSame(a[2], b[2])) {
                    return diff(a[1], b[1]);
                }
                return diff(a[2], b[2]);
            }
            return diff(a[3], b[3]);
        });

        bw.write(arr[N - 1][0]);
        bw.newLine();
        bw.write(arr[0][0]);
        bw.flush();

    }

    public static int diff(String a, String b) {
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    public static boolean isSame(String a, String b) {
        return a.equals(b);
    }
}
