import java.util.*;
import java.lang.Math;

class q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		double f, h = 0.0, t = 0.0;
		for (int i = 0; i < n; i++) {
			f = Math.random();
			if (f < 0.5) {
				System.out.println("T");
				t += 1;
			} else {
				System.out.println("H");
				h += 1;
			}

		}

		t = (t * 100) / n;
		h = (h * 100) / n;

		System.out.println("Heads Probability: " + h);
		System.out.println("Tails Probability: " + t);
	}
}