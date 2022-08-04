import java.util.*;

public class Presents {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] presents = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			presents[num] = i;
		}

		for (int i = 1; i < n; i++) {
			System.out.print(presents[i] + " ");
		}
		System.out.print(presents[n]);

	}

}
