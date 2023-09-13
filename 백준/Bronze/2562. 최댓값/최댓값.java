import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = -1;
        int maxN = 0;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > maxN) {
                maxN = num;
                idx = i+1;
            }
        }

        System.out.println(maxN);
        System.out.println(idx);
    }
    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}