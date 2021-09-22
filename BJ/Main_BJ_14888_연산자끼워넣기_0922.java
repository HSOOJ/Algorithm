import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BJ_14888_연산자끼워넣기_0922 {

	static int[] operand, number, res;
	static boolean isSelected[];
	static int size, N, maxres = Integer.MIN_VALUE, minres = Integer.MAX_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());

		number = new int[N]; // 피연산자
		int count[] = new int[4]; // 연산자 넣을 배열

		// 피연산자
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}

		// 연산자
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			count[i] = Integer.parseInt(st.nextToken());
		}
		size = Arrays.stream(count).sum(); // 연산자 개수

		operand = new int[size];
		res = new int[size];
		isSelected = new boolean[size];
		
		int idx = 0;
		for (int i = 0; i < 4; i++) {
			int tmp = count[i];

			if (tmp != 0) {
				int cnt = tmp;
				while (cnt-- > 0) {
					operand[idx++] = i; // 연산자 개수만큼 해당 연산자 추가
				}
			}
		}
		
		// 연산자 순서 -> 순열
		permu(0);
		
		// 결과 출력
		System.out.println(maxres);
		System.out.println(minres);
	}

	private static void permu(int cnt) {
		if (cnt == size) {
			int tmpres = calc();
			minres = Math.min(tmpres, minres);
			maxres = Math.max(tmpres, maxres);
			return;
		}

		for (int i = 0; i < size; i++) {
			if (!isSelected[i]) {
				res[cnt] = operand[i];
				isSelected[i] = true;
				permu(cnt + 1);
				isSelected[i] = false;
			}
		}
	}

	private static int calc() {
		int total = number[0]; // 결과 
		int operator = 0; // 연산자
		int idx = 0; // 연산자 배열 인덱스
		
		for (int i = 1; i < size+1; i++) {
			operator = res[idx++];
			switch (operator) {
			case 0:
				total += number[i];
				break;
			case 1:
				total -= number[i];
				break;
			case 2:
				total *= number[i];
				break;
			case 3:
				int tmpoperand = number[i];
				if (total > 0)
					total /= tmpoperand;
				else {
					total = -1 * (total * -1 / tmpoperand);
				}
				break;
			}
		}
		return total;
	}

}
