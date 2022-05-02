import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, HashSet<String>> map = new HashMap<>(); // 신고받은 ID : 신고한 ID
        Map<String, Integer> res = new HashMap<>(); // 처리 결과 받을 ID
        
        // 초기화
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            res.put(id_list[i], i); // 각 이름별로 인덱스 값을 넣어놓기
        }
        
        for(int i = 0; i < report.length; i++) {
            StringTokenizer st = new StringTokenizer(report[i]);
            String from = st.nextToken(); // 신고한 사람
            String to = st.nextToken(); // 신고 받은 사람
            
            map.get(to).add(from); // 신고 받은 사람을 key로 신고한 사람을 value로 입력
        }
        
        for(int i = 0; i < id_list.length; i++) {
            HashSet<String> cur = map.get(id_list[i]);

            // k번 이상 신고 받은 사람을 신고한 사람에게 보낼 메일 개수 +1
            if(cur.size() >= k) {
                for(String name: cur) {
                    // 이름을 보고 인덱스를 찾아서 + 1
                    answer[res.get(name)]++;
                }
            }
        }
        return answer;
    }
}
