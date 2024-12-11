import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = Map.of(
                "black", 0,
                "brown", 1,
                "red", 2,
                "orange", 3,
                "yellow", 4,
                "green", 5,
                "blue", 6,
                "violet", 7,
                "grey", 8,
                "white", 9);

        int count = 3;
        String[] colors = new String[count];
        for (int i = 0; i < count; i++) {
            colors[i] = br.readLine();
        }

        int n1 = map.get(colors[0]);
        int n2 = map.get(colors[1]);
        int n3 = map.get(colors[2]);
        long num = Integer.parseInt(Integer.toString(n1) + Integer.toString(n2)) * (long) Math.pow(10, n3);

        System.out.println(num);

    }
}