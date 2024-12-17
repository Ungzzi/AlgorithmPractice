import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int cnt = 1;
        int result = 0;
        int next = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(A, 0);

        while (true) {
            next = 0;
            while (A > 0) {
                next += Math.pow(A % 10, P);
                A /= 10;
            }
            A = next;
            if (map.get(next) != null) {
                result = map.get(next);
                break;
            }
            map.put(next, cnt++);
        }

        System.out.println(result);
    }
}
