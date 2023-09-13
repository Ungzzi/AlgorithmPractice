import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        List<StringBuilder> list = new ArrayList<>();

        for (int i = 1; i < word.length()-2; i++) {
            for (int j = i+1; j < word.length(); j++) {
                StringBuilder sb1 = new StringBuilder(word.substring(0,i));
                StringBuilder sb2 = new StringBuilder(word.substring(i, j));
                StringBuilder sb3 = new StringBuilder(word.substring(j));

                list.add(sb1.reverse().append(sb2.reverse()).append(sb3.reverse()));
            }
        }

        Collections.sort(list);

        System.out.println(list.get(0));
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}