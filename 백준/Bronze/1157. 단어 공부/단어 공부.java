import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        char[] charArr = str.toCharArray();

        int cnt[] = new int[26];
        int maxV = -1;
        char ans = '?';

        for (int i = 0; i < charArr.length; i++) {
            cnt[charArr[i] - 65]++;
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > maxV) {
                maxV = cnt[i];
                ans = (char) (i + 65);
            } else if (cnt[i] == maxV) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}