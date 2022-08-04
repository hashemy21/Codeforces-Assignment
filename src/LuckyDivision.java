import java.util.*;

public class LuckyDivision {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = "NO";
		int[] arr = { 4, 7, 44, 47, 74, 77, 444, 447, 477, 777, 774, 744 };
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0)
				result = "YES";
		}
		System.out.println(result);

	}

}
