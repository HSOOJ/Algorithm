import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_Main_BJ_1592_영식이와친구들_0913 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		int cnt = 0;
		int idx = 0;
		while(true) {
			if(arr[idx] == M-1) {
				break;
			}
			else {
				arr[idx]++;
				cnt++;
				if(arr[idx] % 2 == 0) {
					idx += L;
					if(idx >= N) {
						idx -= N;
					}
				}
				else {
					idx -= L;
					if(idx < 0) {
						idx += N;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}
