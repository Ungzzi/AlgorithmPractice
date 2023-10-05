class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int step = 0;
        int del = 0;

        while(true){
            step++;
            String tmp = "";
            for(int i=0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    del++;
                } else{
                    tmp += "1";
                }
            }

            if(tmp.equals("1")) break;

            s = Integer.toBinaryString(tmp.length());
        }
        answer[0] = step;
        answer[1] = del;

        return answer;
    }
}