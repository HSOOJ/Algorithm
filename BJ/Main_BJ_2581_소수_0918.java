import java.util.Arrays;
import java.util.Scanner;

public class Main_BJ_2581_소수_0918 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		int min = 0;
		boolean isPrime[] = new boolean[10001];
		
		Arrays.fill(isPrime, true);
		
		isPrime[0] = isPrime[1] = false;
		
		for(int i = 2; i <= N; i++) {
			if(isPrime[i]) {
				for (int j = (i+i); j <= N; j += i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = M; i <= N; i++) {
			if(isPrime[i]) {
				if(sum == 0) {
					min = i;
				}
				sum += i;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
 