import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_Main_BJ_1978_소수찾기_0918 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int res = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		int maxnum = arr[N - 1];

		boolean isPrime[] = new boolean[1001];
		Arrays.fill(isPrime, true);

		// true : 소수
		for (int i = 2; i <= maxnum; i++) {
			if (isPrime[i]) {
				for (int j = (i + i); j < 1001; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		for(int x: arr) {
			if(isPrime[x])
				res++;
		}
		
		System.out.println(res);

	}

}
