import java.util.*;

class Data {
    int idx;
    double value;
    
    public Data(int idx, double value){
        this.idx = idx;
        this.value = value;
    }
    
    int getIdx(){
        return this.idx;
    }
    
    double getValue(){
        return this.value;
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] clear = new int[N+2];
        int[] challenger = new int[N+2];
        double[] rate = new double[N+2];
        ArrayList<Data> list = new ArrayList<>();
        
        for(int i=0; i<stages.length; i++){
            int stage = stages[i];
            challenger[stage] += 1;
            clear[stage-1] += 1;
        }
        
        for(int i=N-1; i>=0; i--){
            clear[i] += clear[i+1];
        }
        
        
        for(int i=1; i<N+1; i++){
            if(challenger[i] == 0){
                rate[i] = 0.00;
            }else{
                rate[i] = (double) challenger[i] / (double) (clear[i] + challenger[i]);
            }
            list.add(new Data(i, rate[i]));
        }
        
        list.sort((d1, d2)-> {
            if (Double.compare(d2.value, d1.value) != 0){
                return Double.compare(d2.value, d1.value);
            } else {
                return Integer.compare(d1.idx, d2.idx);
            }
        });
        
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).getIdx(); 
        }
        
        return answer;
    }
}