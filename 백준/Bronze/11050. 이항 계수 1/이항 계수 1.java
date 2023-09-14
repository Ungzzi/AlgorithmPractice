import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(factorial(N) / factorial(K) / factorial(N-K));
    }
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i < n+1; i++) {
            res *= i;
        }
        return res;
    }
}