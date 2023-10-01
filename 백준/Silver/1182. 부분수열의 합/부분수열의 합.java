import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static int s, n;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        System.out.println(cnt);
    }
    public static void dfs(int idx, int sum){
        if(idx == n){return;}
        else{
            if(sum + arr[idx] == s) cnt++;

            dfs(idx+1, sum + arr[idx]);
            dfs(idx+1, sum);
        }
    }
}