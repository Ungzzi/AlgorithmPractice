import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[26];
        boolean flag = false;

        for (int i = 0; i < N; i++) {
            char fName = br.readLine().charAt(0);
            int n = fName - 'a';
            list[n]++;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 5) {
                flag = true;
                System.out.print((char)('a' + i));
            }
        }

        if (!flag) {
            System.out.print("PREDAJA");
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}