import java.util.*;

public class ChatRoom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Character[] hello = { 'h', 'e', 'l', 'l', 'o' };
		int i = 0;
		char lookingFor = hello[i];
		for (char c : s.toCharArray()) {
			if (c == lookingFor && i == 4) {
				System.out.println("YES");
				return;
			} else if (c == lookingFor) {
				i++;
				lookingFor = hello[i];
			}
		}

		System.out.println("NO");

	}

}
