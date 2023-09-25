import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            if (N > 32) {System.out.println(0); continue;}

            String[] MBTI = new String[N];
            for (int j = 0; j < N; j++) {
                MBTI[j] = st.nextToken();
            }
            int minV = Integer.MAX_VALUE;

            for (int j = 0; j < N-2; j++) {
                for (int k = j+1; k < N-1; k++) {
                    for (int l = k+1; l < N; l++) {
                        int cnt = 0;
                        for (int m = 0; m < 4; m++) {
                            if (MBTI[j].charAt(m) != MBTI[k].charAt(m)){cnt++;}
                            if (MBTI[k].charAt(m) != MBTI[l].charAt(m)){cnt++;}
                            if (MBTI[l].charAt(m) != MBTI[j].charAt(m)){cnt++;}
                        }
                        minV = Math.min(minV, cnt);
                        if(minV == 0){break;}
                    }
                }
            }
            System.out.println(minV);
        }
    }
}