import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        double sum = 0;

        for (int i = 0; i < N; i++) {
            char c = str.charAt(i);
            int num = c - 96;
            sum += num * Math.pow(31, i);
        }

        System.out.println((long)sum);

    }
}