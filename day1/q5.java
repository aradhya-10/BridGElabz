import java.util.*;

public class q5{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n<=0) {
			System.out.println("Invalid Input");
			return;			
		}


		System.out.print("Prime Factors:");
		int n1=n;
		for(int i=2; i*i<=n1; i++){
			if(n%i==0){
				System.out.print(" "+i+" "+n/i);
				while(n%i==0)
					n/=i;
			}
		}
	}
}