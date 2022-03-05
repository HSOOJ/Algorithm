import java.util.Scanner;

public class B2_Main_BJ_10870_피보나치수5_0913 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(fibo(sc.nextInt()));
	}

	private static int fibo(int n) {
		if(n <= 1)
			return n;
		else return fibo(n-1) + fibo(n-2);		
	}
}
