import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (map.containsKey(num)) {
                int cnt = map.get(num);
                map.replace(num, ++cnt);
            } else {
                map.put(num, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int find = Integer.parseInt(st.nextToken());
            if (map.containsKey(find)) {
                sb.append(map.get(find) + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
    }
}