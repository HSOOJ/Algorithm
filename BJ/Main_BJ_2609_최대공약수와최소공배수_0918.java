import java.util.Scanner;

public class Main_BJ_2609_최대공약수와최소공배수_0918 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int max = 1;
		int min = 1;
		
		int n = Math.min(N, M);
		int m = Math.max(N, M);
		
		for (int i = 1; i < Math.min(N, M); i++) {
			for (int j = 1; j <= n; j++) {
				if(n % j == 0 && m % j == 0) {
					max *= j;
					n /= j;
					m /= j;
				}
			}
		}
		
		// 1 이외에 공배수가 없는 경우
		if(max == 1)
			min = n * m;
		else
			min = max * n * m;
		
		System.out.println(max + " " + min);

		sc.close();
	}
}
