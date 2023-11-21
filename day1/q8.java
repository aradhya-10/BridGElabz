import java.util.*;

public class q8 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n%2==1)
			System.out.println("Odd");
		else
			System.out.println("Even");
	}
}