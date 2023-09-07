import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxA = 0;
        int maxB = 0;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        for (int i = 0; i < sizes.length; i++) {
            maxA = Math.max(sizes[i][0], maxA);
            maxB = Math.max(sizes[i][1], maxB);
        }

        answer = maxA * maxB;

        return answer;
    }
}