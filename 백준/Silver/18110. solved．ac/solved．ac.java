import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        float sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int delSize = (int) Math.round(N * 0.15);

        for (int i = delSize; i < N - delSize; i++) {
            sum += arr[i];
        }
        sum = Math.round(sum / (N-delSize*2));
        System.out.println((int)sum);
    }
}