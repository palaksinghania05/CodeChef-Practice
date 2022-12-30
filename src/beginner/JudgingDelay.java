/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-12-2022
 */

package beginner;

import java.util.Scanner;

class JudgingDelay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			int count = 0;
			int S[] = new int[N];
			int J[] = new int[N];
			for (int i = 0; i < N; i++) {
				S[i] = sc.nextInt();
				J[i] = sc.nextInt();
				int delay = J[i] - S[i];
				if (delay > 5)
					count++;
			}
			System.out.println(count);
			T--;
		}
	}
}
