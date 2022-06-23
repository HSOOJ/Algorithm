import java.util.*;

class L2_Solution_12939_최댓값과최솟값_220502 {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while(st.hasMoreTokens()) {
            int cur = Integer.parseInt(st.nextToken());
            max = Math.max(max, cur);
            min = Math.min(min, cur);
        }
        return (min + " " + max);
    }
}
