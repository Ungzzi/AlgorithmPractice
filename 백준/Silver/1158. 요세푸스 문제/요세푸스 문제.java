import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        Queue<Integer> QA = new LinkedList<>();
        Queue<Integer> QB = new LinkedList<>();
        List<Integer> ans = new LinkedList<>();

        for (int i = 1; i < M + 1; i++) {
            QA.add(i);
        }

        int cnt = 0;
        boolean isATurn = true;

        while (!QA.isEmpty() || !QB.isEmpty()) {
            cnt++;
            if (QA.isEmpty()) {
                isATurn = false;
            } else if (QB.isEmpty()) {
                isATurn = true;
            }

            if (isATurn) {
                if (cnt % N == 0) {
                    ans.add(QA.poll());
                } else {
                    QB.add(QA.poll());
                }
            } else {
                if (cnt % N == 0) {
                    ans.add(QB.poll());
                } else {
                    QA.add(QB.poll());
                }
            }
        }
        System.out.print("<");
        for (int i = 0; i < ans.size(); i++) {
            if (i == ans.size() - 1) {
                System.out.print(ans.get(i));
            } else {
                System.out.print(ans.get(i) + ", ");
            }
        }
        System.out.print(">");

    }


    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}