import java.util.*;

class q7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter N2: ");
		int n2 = sc.nextInt();
		sc.close();

		n1+=n2;
		n2=n1-n2;
		n1=n1-n2;

		System.out.println("N1: " + n1);
		System.out.println("N2: " + n2);
	}
}