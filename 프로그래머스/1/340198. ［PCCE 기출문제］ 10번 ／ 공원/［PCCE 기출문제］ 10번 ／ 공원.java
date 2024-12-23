class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int w = park[0].length;
        int v = park.length;
        for (int mat : mats) {
            for (int i = 0; i < v; i++) {
                if (i + mat > v) {
                    break;
                }
                for (int j = 0; j < w; j++) {
                    if (j + mat > w) {
                        break;
                    }
                    boolean flag = true;
                    if (!park[i][j].equals("-1")) {
                        continue;
                    }
                    for (int k = i; k < i + mat; k++) {
                        for (int l = j; l < j + mat; l++) {
                            if (!park[k][l].equals("-1")) {
                                flag = false;
                                break;
                            }
                        }
                        if (!flag) {
                            break;
                        }
                    }
                    if (flag) {
                        answer = Math.max(mat, answer);
                    }
                }
            }
        }
        return answer;
    }
}