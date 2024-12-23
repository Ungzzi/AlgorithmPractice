class Solution {
    public int solution(int[] bandage, int max_hp, int[][] attacks) {
        int idx = 0;
        int t = 0;
        int seq = 0;
        int hp = max_hp;
        
        while(hp > 0 && idx < attacks.length){            
            if(attacks[idx][0] == ++t){
                hp -= attacks[idx++][1];
                seq = 0;
            } else{
                hp += bandage[1];
                if(++seq == bandage[0]){
                    hp += bandage[2];
                    seq = 0;
                }
                hp = hp > max_hp ? max_hp : hp;
            }
        }
        
        
        return hp > 0 ? hp : -1;
    }
}