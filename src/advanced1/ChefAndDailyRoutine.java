package advanced1;

import java.util.Scanner;

public class ChefAndDailyRoutine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            int count = 0;
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) != S.charAt(i + 1)) {
                    if (S.charAt(i) == 'E' && S.charAt(i + 1) == 'C') {
                        count++;
                        break;
                    }
                    if (S.charAt(i) == 'S' && S.charAt(i + 1) == 'E') {
                        count++;
                        break;
                    }
                    if (S.charAt(i) == 'S' && S.charAt(i + 1) == 'C') {
                        count++;
                        break;
                    }
                }
            }
            if (count > 0) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
            T--;
        }
    }
}
