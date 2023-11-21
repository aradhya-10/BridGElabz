import java.util.*;

public class qs10 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter N2: ");
		int n2 = sc.nextInt();
		System.out.print("Enter N3: ");
		int n3 = sc.nextInt();
		sc.close();
		
		n1 = n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.println("Largest Number:"+n1);
	}
}