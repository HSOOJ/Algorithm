import java.util.Scanner;

public class Main_BJ_3460_이진수_0913 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int cnt = 0;
			
			while(n != 1) {
				if(n % 2 == 1) {
					System.out.print(cnt + " ");					
				}
				n /= 2;
				cnt++;
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}

}
