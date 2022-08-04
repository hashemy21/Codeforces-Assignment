import java.util.*;

public class HelpfulMaths {

	public static void main(String[] args) {
	       
	       
        Scanner sc = new Scanner(System.in);
        String result = sc.next();
       
        result = result.replace("+", "");
        char []arr = result.toCharArray();
       
        Arrays.sort(arr);
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i == arr.length-1)
                continue;
            System.out.print("+");           
        }
        System.out.println();
    }
}
