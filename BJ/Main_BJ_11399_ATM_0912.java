import java.util.Arrays;
import java.util.Scanner;

public class Main_BJ_11399_ATM_0912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] time = new int[N];		
		int res = 0, sum = 0;
		
		for (int i = 0; i < N; i++) {
			time[i] = sc.nextInt();
		}
		
		Arrays.sort(time);
//		System.out.println(Arrays.toString(time));
		
		for (int i = 0; i < N; i++) {
			sum += (time[i]);
			res += sum;
		}
		System.out.println(res);
	}
}
