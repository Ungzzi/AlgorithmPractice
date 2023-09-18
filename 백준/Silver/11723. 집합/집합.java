import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static HashSet<Integer> SS = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> S = new HashSet<>();
        int num = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ord = st.nextToken();
            if (st.hasMoreTokens()) {
                 num = Integer.parseInt(st.nextToken());
            }

            switch (ord) {
                case "add":  S.add(num); break;
                case "remove": S.remove(num); break;
                case "check":
                    if (S.contains(num)) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "toggle":
                    if (S.contains(num)) {
                        S.remove(num);
                    } else {
                        S.add(num);
                    }
                    break;
                case "all": S = (HashSet<Integer>) SS.clone(); break;
                case "empty": S.clear(); break;
            }
        }
        System.out.println(sb);
    }
}