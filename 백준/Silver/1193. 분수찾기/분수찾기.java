import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int[] fraction = {1, 1};
        int cnt = 1;
        int lineCnt = 1;

        while (cnt < X) {
            if (lineCnt % 2 == 1) {
                fraction[0] += 0;
                fraction[1] += 1;
                cnt++;
                for (int i = 0; i < lineCnt; i++) {
                    if (cnt >= X) {break;}
                    fraction[0] += 1;
                    fraction[1] -= 1;
                    cnt++;
                }
            } else {
                fraction[0] += 1;
                fraction[1] += 0;
                cnt++;
                for (int i = 0; i < lineCnt; i++) {
                    if (cnt >= X) {break;}
                    fraction[0] -= 1;
                    fraction[1] += 1;
                    cnt++;
                }
            }
            lineCnt++;
        }
        System.out.println(fraction[0] + "/" + fraction[1]);
    }


    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}