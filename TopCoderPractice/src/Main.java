import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		for(int i=0; i<tests; i++){
			String a = sc.nextLine();
			String b = sc.nextLine();
			Cmp_ExtremelyLargeNumbers c = new Cmp_ExtremelyLargeNumbers();
			c.cmp(a, b);
		}
		sc.close();
		

	}

}
