import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int fee[] = new int[3];
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            fee[i] = Integer.parseInt(st.nextToken()) * (i+1);
        }

        int t[][] = new int[3][2];
        int minT = 100;
        int maxT = 1;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                int num = Integer.parseInt(st.nextToken());
                t[i][j] = num;
                if (j == 0 && num < minT) {
                    minT = num;
                } else if (j == 1 && num > maxT) {
                    maxT = num;
                }
            }
        }

        for (int i = minT; i <= maxT; i++) {
            int cnt = 0;
            for (int j = 0; j < 3; j++) {
                if (t[j][0] < i && t[j][1] >= i) {
                    cnt++;
                }
            }

            switch (cnt) {
                case 1: {sum += fee[0]; break;}
                case 2: {sum += fee[1]; break;}
                case 3: {sum += fee[2]; break;}
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}