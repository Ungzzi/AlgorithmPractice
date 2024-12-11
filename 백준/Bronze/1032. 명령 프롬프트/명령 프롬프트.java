import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "";
        Set<String> set = new HashSet<String>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        int len = set.size();

        Iterator<String> it = set.iterator();
        String original = it.next();
        boolean[] check = new boolean[original.length()];

        while (it.hasNext()) {
            String value = it.next();
            for (int i = 0; i < original.length(); i++) {
                if (!check[i] && original.charAt(i) != value.charAt(i)) {
                    check[i] = true;
                }
            }
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i]) {
                result += "?";
            } else {
                result += original.charAt(i);
            }
        }

        System.out.println(result);

    }
}