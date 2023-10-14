import java.util.*;
import java.io.*;

public class Main {
    static HashSet<String> set = new HashSet<>();
    static Boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int nums[] = new int[n];
        visit = new Boolean[n];
        Arrays.fill(visit, false);

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        dfs(nums,"",0, n, k);
        System.out.println(set.size());
    }
    public static void dfs(int[] nums, String num, int depth, int n, int cnt){
        if(depth == cnt){
            set.add(num);
            return;
        }
        for(int i=0; i<n; i++){
            if(!visit[i]) {
                visit[i] = true;
                dfs(nums, num + nums[i], depth + 1, n, cnt);
                visit[i] = false;
            }
        }
    }
}