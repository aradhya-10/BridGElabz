import java.util.*;
import java.lang.Math;

public class q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if ((int) (Math.log10(n) + 1) != 4) {
			System.out.println("Not a 4 digit number");
			return;			
		}

		if(n%4==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}