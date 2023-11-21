import java.util.*;

public class q4{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n<=0) {
			System.out.println("Invalid Input");
			return;			
		}

		double h=0.0;
		for(int i=1; i<=n; i++){
			h+=1.0/i;
		}
		System.out.println("Nth Harmonic Number: "+h);
	}
}