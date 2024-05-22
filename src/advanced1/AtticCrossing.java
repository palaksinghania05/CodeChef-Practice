package advanced1;

import java.util.Scanner;

public class AtticCrossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            int N = S.length();
            int count = 0, temp = 0, max = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '.') {
                    temp++;
                } else {
                    if (temp > 0 && temp > max) {
                        count++;
                        max = temp;
                    }
                    temp = 0;
                }
            }
            if (temp > 0 && temp > max) {
                count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
