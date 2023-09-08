class Solution {
    public int[] solution(int brown, int yellow) {
       int[] answer = new int[2];

        int sum = brown + yellow;

        for (int i = 3; i < sum; i++) {
            int h = sum / i;
            if (((h - 2) * (i - 2) == yellow)) {
                answer[0] = i;
                answer[1] = h;
            }
        }

        return answer;
    }
}