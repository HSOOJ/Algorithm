import java.util.*;

class L2_Solution_42583_다리를지나는트럭_0503 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        // 다리 길이만큼 큐 생성
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }
        
        int total = 0; // 다리에 있는 트럭 무게 합
        int idx = 0; // 트럭 인덱스
        while(idx != truck_weights.length) {
            int cur = truck_weights[idx];
            answer++; // 시간 

            // 다 건넌 트럭의 무게 빼기
            int out = queue.poll();
            total -= out;

            // 다리에 올라가 있는 트럭 무게 합 + 다음에 올라갈 트럭 무게 <= 다리 최대 하중
            if(total + cur <= weight) {
                queue.offer(cur); // 다리에 트럭 올리기
                total += cur; // 트럭 무게 추가
                idx++; // 다음 트럭
            }
            // 트럭 무게 합이 다리 최대하중보다 무거우면
            else { 
                queue.offer(0); // 빈 값을 의미하는 0 입력
            }
        }
        // 마지막 트럭이 다리에 다 올라가면 다리 길이 만큼 더해줌
        answer += queue.size();
        
        return answer;
    }
}
