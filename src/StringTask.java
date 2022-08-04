import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

        String s = sc.next();
        s = s.toLowerCase();
        s = s.replaceAll("[aeiouy]", "");
        StringBuilder result = new StringBuilder(s);
        for(int i=0; i<result.length(); i+=2)
        {
        	result.insert(i, '.');
        }
        System.out.println(result);
		
		
	}
	
}
