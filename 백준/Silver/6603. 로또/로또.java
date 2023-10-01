import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int[] ans;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            if(n == 0) break;

            arr = new int[n];
            ans = new int[6];

            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int depth, int at) {
        if(depth >= 6){
            for(int i=0; i<6; i++){
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = at; i <n; i++){
            ans[depth] = arr[i];
            dfs(depth+1, i+1);
        }
    }
}