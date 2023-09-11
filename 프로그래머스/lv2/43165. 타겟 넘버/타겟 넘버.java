class Solution {
    public static int tarNum;
    public static int answerCnt = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int max_cnt = numbers.length - 1;
        tarNum = target;

        dfs(max_cnt, -1, numbers, 0);

        answer = answerCnt;
        return answer;
    }

    public void dfs(int maxCnt, int depth, int[] numbers, int sum) {
        if (depth == maxCnt) {
            if (tarNum == sum) {
                answerCnt++;
            }
        } else {
            dfs(maxCnt, depth+1, numbers, sum + numbers[depth+1]);
            dfs(maxCnt, depth+1, numbers, sum - numbers[depth+1]);
        }
    }
}