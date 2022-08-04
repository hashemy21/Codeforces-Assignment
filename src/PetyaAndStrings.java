import java.util.*;

public class PetyaAndStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
       
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
              
        if(str1.compareTo(str2) ==0){
            System.out.println("0");
        }
        if(str1.compareTo(str2) > 0){
            System.out.println("1");
        }
        if(str1.compareTo(str2) < 0){
            System.out.println("-1");           
        }
	}

}
