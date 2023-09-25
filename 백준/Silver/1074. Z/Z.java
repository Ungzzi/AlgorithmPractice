import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int r;
    static int c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, N);

        int solve = solve(0, 0, size);
        System.out.println(solve);


    }
    public static int solve(int nr, int nc, int size) {
        if (size == 1) {
            return 0;
        }

        if (r < nr + size / 2 && c < nc + size / 2) {
            return solve(nr, nc, size / 2);
        } else if (r < nr + size / 2 && c < nc + size) {
            return solve(nr, nc + size / 2, size / 2) + (int)Math.pow(size / 2, 2);
        } else if (r < nr + size && c < nc + size / 2) {
            return solve(nr + size / 2, nc, size / 2) + (int) Math.pow(size / 2, 2) * 2;
        } else {
            return solve(nr + size / 2, nc + size / 2, size / 2) + (int) Math.pow(size / 2, 2) * 3;
        }
    }
}