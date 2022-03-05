import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B2_Main_BJ_3052_나머지_0912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer arr[] = new Integer[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		Set<Integer> res = new HashSet<>(Arrays.asList(arr));

		System.out.println(res.size());
		sc.close();
	}

}
