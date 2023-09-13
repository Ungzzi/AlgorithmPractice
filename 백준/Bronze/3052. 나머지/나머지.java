import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public void solution() throws IOException {
        HashSet<Integer> hashSet = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine()) % 42;
            hashSet.add(num);
        }
        System.out.println(hashSet.size());
    }
    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}