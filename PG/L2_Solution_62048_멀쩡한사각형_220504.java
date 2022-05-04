class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long max = 0;
        long min = 0;
        
        if(w >= h){
            max = w;
            min = h;
        }
        else {
            max = h;
            min = w;
        }
                
        long tmp = 0;
        while(min != 0) {
            tmp = max % min;
            max = min;
            min = tmp;
        }
        
        long gcd = max;
//        long a = (long)h / gcd;
//        long b = (long)w / gcd;
//        answer = (long)w * (long)h - (a + b - 1) * gcd;
        answer = (long)w * (long)h - (h + w - gcd) ;
        
        return answer;
    }
}
