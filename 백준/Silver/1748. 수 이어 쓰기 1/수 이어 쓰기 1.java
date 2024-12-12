import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Integer.parseInt(br.readLine());
        long result = 0;
        int len = 0;

        long num = N;
        while (num > 0) {
            num /= 10;
            len++;
        }

        for (int i = 0; i < len - 1; i++) {
            result += Math.pow(10, i) * 9 * (i + 1);
        }

        result += (N - Math.pow(10, len - 1) + 1) * len;

        bw.write(String.valueOf(result));
        bw.flush();
    }
}