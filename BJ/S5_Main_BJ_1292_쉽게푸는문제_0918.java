import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_Main_BJ_1292_쉽게푸는문제_0918 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int arr[] = new int[10000];
		int idx = 1;
		for (int i = 1; i <= B; i += idx - 1) {
			for (int j = 0; j < idx; j++) {
				arr[i + j] = idx;
			}
			idx++;
		}
		int res = 0;
		for(int i = A; i <= B; i++) {
			res += arr[i];
		}
		
		System.out.println(res);
	}

}
