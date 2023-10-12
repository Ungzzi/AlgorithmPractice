class Solution {
    static int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        int length = arr.length;
        quad(0, 0, length, arr);
        return answer;
    }

    public void quad(int r, int c, int length, int[][] arr){
        int val = arr[r][c];
        if(check(r, c, length, arr, val)){
            answer[val]++;
            return;
        }

        length/=2;

        quad(r, c, length, arr);
        quad(r+length, c, length, arr);
        quad(r, c+length, length, arr);
        quad(r+length, c+length, length, arr);

    }

    public boolean check(int r, int c, int length, int[][] arr, int val) {
        for(int i=r; i<r+length; i++){
            for(int j=c; j<c+length; j++){
                if(arr[i][j] != val) return false;
            }
        }
        return true;
    }
}