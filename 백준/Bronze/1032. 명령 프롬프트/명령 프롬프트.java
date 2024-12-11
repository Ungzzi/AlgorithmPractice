import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

        List<String> files = new ArrayList<>(set);
        String original = files.get(0);
        
        for (int i = 0; i < original.length(); i++) {
            boolean isSame = true;
            for (int j = 0; j < set.size(); j++) {
                if (files.get(j).charAt(i) != original.charAt(i)) {
                    isSame = false;
                    break;
                }
            }
            result += isSame ? original.charAt(i) : "?";
        }

        System.out.println(result);

    }
}