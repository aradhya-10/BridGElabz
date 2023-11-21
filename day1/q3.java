import java.util.*;

public class q3{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n>30 || n<0) {
			System.out.println("Invalid Input");
			return;			
		}

		for(int i=0; i<=n; i++){
			System.out.println("N = "+i+", 2^N = "+(1<<i));
		}
	}
}