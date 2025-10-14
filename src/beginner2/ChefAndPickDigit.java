package beginner2;

import java.util.Scanner;

public class ChefAndPickDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- != 0) {
            String s = sc.next();
            long n = s.length();
            long[] v = new long[10];
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                v[s.charAt(i) - '0']++;
            }
            for (int i = 65; i <= 90; i++) {
                if (i == 66 || i == 77 || i == 88) {
                    if (v[i / 10] >= 2) {
                        result.append((char) i);
                    }
                } else if (v[i / 10] >= 1 && v[i % 10] >= 1) {
                    result.append((char) i);
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
