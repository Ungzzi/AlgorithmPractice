class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video_len_s = convertToSec(video_len);
        int pos_s = convertToSec(pos);
        int op_start_s = convertToSec(op_start);
        int op_end_s = convertToSec(op_end);
            
        for(int i=0; i<commands.length; i++){
            String com = commands[i];
            
            if(pos_s >= op_start_s && pos_s <= op_end_s){
                pos_s = op_end_s;
            }
            
            if(com.equals("next")){
                pos_s += 10;
            } else {
                pos_s -= 10;
            }
            
            if(pos_s < 0){
                pos_s = 0;
            } else if(pos_s > video_len_s){
                pos_s = video_len_s;
            }
        }
        
        
            
        if(pos_s >= op_start_s && pos_s <= op_end_s){
            pos_s = op_end_s;
        }
        
        answer = converToStr(pos_s);
        
        
        
        return answer;
    }
    
    static int convertToSec(String str){
        String time[] = str.split(":");
        int sec = 0;
        sec += Integer.parseInt(time[0]) * 60;
        sec += Integer.parseInt(time[1]);
        return sec;
    }
    
    static String converToStr(int total){
        StringBuilder sb = new StringBuilder();
        int min = total / 60;
        int sec = total % 60;
        if(min < 10){
            sb.append("0").append(Integer.toString(min));
        } else if(min >= 10){
            sb.append(Integer.toString(min));
        }
        
        sb.append(":");
        
        if(sec < 10){
            sb.append("0").append(Integer.toString(sec));
        } else if(sec >= 10){
            sb.append(Integer.toString(sec));
        }
        System.out.println(sb);
        return sb.toString();
    }
}