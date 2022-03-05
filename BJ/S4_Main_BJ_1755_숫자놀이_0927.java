import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_Main_BJ_1755_숫자놀이_0927 {
	
	public static class Number implements Comparable<Number>{
		int num;
		String str;
		
		public Number(int num, String str) {
			super();
			this.num = num;
			this.str = str;
		}

		@Override
		public int compareTo(Number o) {
			return this.str.compareTo(o.str);
		}

		@Override
		public String toString() {
			return "Number [num=" + num + ", str=" + str + "]";
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int len = N - M + 1;
		
		Number str[] = new Number[len];
		String eng[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for (int i = 0; i < len; i++) {
			int num = M + i;

			String tmp = "";
			if(num / 10 != 0) {
				tmp += eng[num/10];
			}
			tmp += eng[num%10];
			
			str[i] = new Number(num, tmp);
		}
		
		Arrays.sort(str);
		int cnt = 0;
		for (int i = 0; i < len; i++) {			
			System.out.print(str[i].num + " ");
			cnt++;
			if(cnt == 10) {
				System.out.println();
				cnt = 0;
			}
				
		}
		
	}

}
