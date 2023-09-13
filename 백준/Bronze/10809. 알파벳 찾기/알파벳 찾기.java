import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] pos = new int[26];
        Arrays.fill(pos, -1);

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (pos[idx] == -1) {
                pos[idx] = i;
            }
        }

        for (int n : pos) {
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}