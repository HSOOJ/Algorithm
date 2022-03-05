import java.util.Scanner;

public class B3_Main_BJ_2460_지능형기차2_0913 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int res = Integer.MIN_VALUE;
		
		for (int i = 0; i < 10; i++) {
			sum = sum - sc.nextInt() + sc.nextInt();
			res = Math.max(res, sum);
		}
		
		System.out.println(res);
		sc.close();
	}

}
