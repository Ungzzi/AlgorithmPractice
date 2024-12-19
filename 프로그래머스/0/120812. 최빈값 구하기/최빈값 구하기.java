import java.util.*;

class Solution {
    public int solution(int[] array) {
        boolean flag = true;
        int answer = -1;
        int max_n = Integer.MIN_VALUE;
        int[] check = new int[1000];
        
        for(int i=0; i<array.length; i++){
            check[array[i]] += 1;
        }
        
        for(int i=0; i<1000; i++){
            if(check[i] > max_n){
                max_n = check[i];
                answer = i;
                flag = true;                
            }
            else if(check[i] == max_n) {
                flag = false;
            }
        }
        
        return flag ? answer : -1;
    }
}