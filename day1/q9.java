import java.util.*;

public class q9 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.next().charAt(0);
		n = Character.toLowerCase(n);
		sc.close();
		
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}
}
