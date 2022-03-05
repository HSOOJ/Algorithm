import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_Main_BJ_10818_최소최대_0913 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			int t = Integer.parseInt(st.nextToken());
			
			if(t < min) min = t;
			if(t > max) max = t;
		}
		
		System.out.println(min + " " + max);
		
		
	}

}
