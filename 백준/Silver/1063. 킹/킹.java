import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] K = st.nextToken().toCharArray();
        char[] S = st.nextToken().toCharArray();
        int N = Integer.parseInt(st.nextToken());

        // move
        for (int i = 0; i < N; i++) {
            String D = br.readLine();

            char[] kClone = K.clone();
            char[] sClone = S.clone();

            move(D, kClone);

            if (!isInRange(kClone)) {
                continue;
            } else {
                if (kClone[0] == sClone[0] && kClone[1] == sClone[1]) {
                    move(D, sClone);
                    if (!isInRange(sClone)) {
                        continue;
                    }
                }
            }
            K = kClone;
            S = sClone;
        }

        System.out.println(K);
        System.out.println(S);
    }
    public void move(String D, char[] next) {
        switch (D) {
            case "L": next[0]--; break;
            case "R": next[0]++; break;
            case "B": next[1]--; break;
            case "T": next[1]++; break;
            case "LB": next[0]--; next[1]--; break;
            case "LT": next[0]--; next[1]++; break;
            case "RB": next[0]++; next[1]--; break;
            case "RT": next[0]++; next[1]++; break;
        }
    }

    public boolean isInRange(char[] pos) {
        return pos[0] >= 'A' && pos[0] <= 'H' && pos[1] > '0' &&  pos[1] <= '8';
    }


    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}