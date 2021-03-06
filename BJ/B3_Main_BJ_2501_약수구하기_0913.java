import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_Main_BJ_2501_약수구하기_0913 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) {
//				System.out.println(i);
				cnt++;
				if(cnt == K) {
					System.out.println(i);
				}
			}
		}
		if(cnt < K) {
			System.out.println(0);
		}
	}
}
