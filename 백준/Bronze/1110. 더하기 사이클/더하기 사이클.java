import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int initNum = Integer.parseInt(br.readLine());
        int cycle = 0;
        int sum = -1;
        int num = initNum;

        while (cycle == 0 || num != initNum) {
            sum = num / 10 + num % 10;
            num = (num % 10) * 10 + sum % 10;
            cycle++;
        }
        System.out.println(cycle);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}