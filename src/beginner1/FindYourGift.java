package beginner1;

import java.util.Scanner;

public class FindYourGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int a = 0;
            int b = 0;
            boolean x = false, y = false;
            for (int i = 0; i < N; i++) {
                if (s.charAt(i) == 'L' && !x) {
                    x = true;
                    y = false;
                    a -= 1;
                    b += 0;
                } else if (s.charAt(i) == 'R' && !x) {
                    x = true;
                    y = false;
                    a += 1;
                    b += 0;
                } else if (s.charAt(i) == 'U' && !y) {
                    y = true;
                    x = false;
                    a += 0;
                    b += 1;
                } else if (s.charAt(i) == 'D' && !y) {
                    y = true;
                    x = false;
                    a += 0;
                    b -= 1;
                }
            }
            System.out.println(a + " " + b);
            T--;
        }
    }
}
