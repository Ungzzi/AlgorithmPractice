import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final Long M = 1234567891L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long sum = 0;
        long pow = 1;

        for (int i = 0; i < N; i++) {
            char c = str.charAt(i);
            int num = c - 'a' + 1;
            sum += num * pow % M;
            pow = pow * 31 % M;
        }
        System.out.println(sum);
    }
}