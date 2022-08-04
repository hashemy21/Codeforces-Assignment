import java.util.*;

public class Twins {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		total = total / 2;
		Arrays.sort(arr);
		int k = 0, k1 = 0;
		for (int i = n - 1; i > 0; i--) {
			k1 += arr[i];
			if (k1 > total)
				break;
			else
				k++;
		}
		System.out.println(k + 1);

	}
}
