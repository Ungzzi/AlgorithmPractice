import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double numA = Integer.parseInt(st.nextToken());
        double numB = Integer.parseInt(st.nextToken());
        double result = numA / numB;

        System.out.printf("%.9f", result);
    }
    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}