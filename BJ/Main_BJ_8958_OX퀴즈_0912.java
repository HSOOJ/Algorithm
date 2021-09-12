import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_BJ_8958_OX퀴즈_0912 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int [N];
		
		for (int i = 0; i < N; i++) {
			int sum = 0;
			int cnt = 0;
			
			String str = br.readLine();
			
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			arr[i] = sum;
		}
		
		for(int x: arr) {
			System.out.println(x);
		}
	}

}
