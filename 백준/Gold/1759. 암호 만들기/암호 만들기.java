import java.util.*;
import java.io.*;

public class Main {
    static String[] word;
    static int l, c;
    static String[] ans;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        word = new String[c];
        ans = new String[l];

        st = new StringTokenizer(br.readLine());
        br.readLine();
        for(int i=0; i<c; i++){
            word[i] = st.nextToken();
        }
        Arrays.sort(word);

        dfs(0, 0);

        System.out.println(sb);
    }

    public static void dfs(int at, int depth){
        if(depth == l){
            if (isValid()) {
                for(int i=0; i<l; i++){
                    sb.append(ans[i]);
                }
                sb.append("\n");
            }
            return;
        }

        for(int i=at; i<c; i++){
            ans[depth] = word[i];
            dfs(i+1,depth+1);
        }
    }

    public static boolean isValid(){
        int ja = 0;
        int mo = 0;
        for (int i = 0; i < l; i++) {
            String w = ans[i];
            if (w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u")) {
                mo++;
            } else {
                ja++;
            }
        }
        if (mo >= 1 && ja >= 2) {
            return true;
        }
        return false;
    }
}