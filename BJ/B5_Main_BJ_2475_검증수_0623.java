import java.util.Scanner;

/*
 메모리 : 12848KB
 시  간 : 108ms
 */
public class B5_Main_BJ_2475_검증수_0623 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < 5; i++)
			sum += Math.pow(sc.nextInt(), 2);
		
		int res = sum % 10;
		
		System.out.println(res);
		sc.close();
	}
}
