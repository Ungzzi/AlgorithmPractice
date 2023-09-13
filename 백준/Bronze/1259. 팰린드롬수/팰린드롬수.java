import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String num = br.readLine();
            int mid = (int) Math.floor(num.length() / 2);

            if (num.equals("0")) {
                return;
            }

            StringBuilder palNumA = new StringBuilder(num.substring(0, mid));
            StringBuilder palNumB = new StringBuilder(num).reverse();
            palNumB = new StringBuilder(palNumB.substring(0, mid));

            if (palNumA.toString().equals(palNumB.toString())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}