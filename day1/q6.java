import java.util.*;

class q6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int q,r;
		q=n/d;
		r=n-q*d;

		System.out.println("Quotient: " + q);
		System.out.println("Remainder: " + r);
	}
}