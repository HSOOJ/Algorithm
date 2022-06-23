class L2_Solution_13704_124나라의숫자_220505 {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        while(n > 3) {
            int tmp = n % 3;
            if(tmp == 0) {
                tmp = 4;
                sb.insert(0, tmp);
                n = n / 3 - 1;
            } else {
                sb.insert(0, n % 3);
                n /= 3;
            }
        }
        
        int add = n;
        if(n == 3)
            add = 4;
        
        sb.insert(0, add);
            
        answer = sb.toString();
        
        return answer;
    }
}
