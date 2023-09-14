import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int maxN = Math.max(A, B);
        int minN = Math.min(A, B);
        int div = 1;

        for (int i = 1; i <= minN; i++) {
            if (maxN % i == 0 && minN % i == 0) {
                div = i;
            }
        }
        System.out.println(div);
        System.out.println(maxN / div * minN);
    }
}