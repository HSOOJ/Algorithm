import java.util.*;

class L2_Solution_42888_오픈채팅방_220507 {
    public String[] solution(String[] record) {
        
        HashMap<String, String> name = new HashMap<>(); // 아이디-이름 저장
        Queue<String[]> queue = new LinkedList<>(); // 입퇴장-아이디 저장
        int len = 0; // 출력할 길이
        
        for(String r : record) {
            String[] cur = r.split(" ");

            // change 인 경우에는 이름 값만 변경하기
            if(cur[0].equals("Change")) {
                name.put(cur[1], cur[2]);
            }
            else {
                // Enter 인 경우에는 이름 값 추가하기
                if(cur[0].equals("Enter"))
                    name.put(cur[1], cur[2]);
                // Enter or Leave 인 경우에는 큐에 저장
                queue.offer(new String[] {cur[0], cur[1]});
                len++;
            }
        }
        
        String[] answer = new String[len];
        for(int i = 0; i < len; i++) {
            String[] cur = queue.poll(); // 현재 기록
            String type = cur[0]; // 입/퇴장
            String uid = cur[1]; // 유저 아이디
            String result = ""; // 출력할 결과
            
            if(type.equals("Enter")) {
                result = name.get(uid) + "님이 들어왔습니다.";
            }
            else {
                result = name.get(uid) + "님이 나갔습니다.";
            }
            
            answer[i] = result;
        }
        return answer;
    }
}
