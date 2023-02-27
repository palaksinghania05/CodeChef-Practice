package beginner1;

import java.util.Scanner;

public class AdaAndCrayons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1))
                    count++;
            }
            System.out.println((count + 1) / 2);
            T--;
        }
    }
}
