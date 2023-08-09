package beginner1;

import java.util.Scanner;

public class ChefAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            int N = s.length();
            int pairCount = 0;
            for (int i = 0; i < N - 1; i++) {
                if ((s.charAt(i) == 'x' && s.charAt(i + 1) == 'y') || s.charAt(i) == 'y' && s.charAt(i + 1) == 'x') {
                    pairCount++;
                    i += 1;
                }
            }
            System.out.println(pairCount);
            T--;
        }
    }
}
