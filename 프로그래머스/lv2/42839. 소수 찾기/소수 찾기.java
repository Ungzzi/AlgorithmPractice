import java.util.*;

class Solution {
    
    static HashSet<Integer> numberSet = new HashSet<>();
    static boolean[] visited;
    static char[] arr;
    
    public int solution(String numbers) {
        int answer = 0;
        int size = numbers.length();
        visited = new boolean[size];
        arr = new char[size];

        for (int i = 0; i < size; i++) {
            arr[i] = numbers.charAt(i);
        }

        getList("", 0);
        
        answer = numberSet.size();
        return answer;
    }

    public static void getList(String str, int depth) {

        if (str != "") {
            int num = Integer.parseInt(str);
            if(checkPrime(num)) {numberSet.add(num);}
        }

        if (depth == arr.length) return;
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            getList(str + arr[i], depth+1);
            visited[i] = false;
        }
    }

    public static boolean checkPrime(int n) {
    if(n == 0 || n == 1) return false;
    for (int i = 2; i < n; i++) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;

    }
}