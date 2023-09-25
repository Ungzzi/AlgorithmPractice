import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int ans = 1;
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                String[] s = br.readLine().split(" ");
                String cType = s[s.length - 1];
                if (map.containsKey(cType)) {
                    map.put(cType, map.get(cType) + 1);
                } else {
                    map.put(cType, 1);
                }
            }
            for (int value : map.values()) {
                ans *= value + 1;
            }
            System.out.println(ans-1);
        }
    }
}