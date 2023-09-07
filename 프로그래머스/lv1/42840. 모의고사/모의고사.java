import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        int[] correct = {0, 0, 0};
        int[][] pattern = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        for (int i = 0; i < 3; i++) {
            int div = pattern[i].length;
            for (int j = 0; j < answers.length; j++) {
                if (pattern[i][j % div] == answers[j]) {
                    correct[i]++;
                }
            }
        }

        int maxScore = Arrays.stream(correct).max().getAsInt();
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] >= maxScore) {
                answerList.add(i+1);
            }
        }
        answer = answerList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}