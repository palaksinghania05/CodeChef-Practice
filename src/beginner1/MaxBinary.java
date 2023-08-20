package beginner1;

import java.util.Scanner;

public class MaxBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String s = sc.next();
            StringBuffer result = new StringBuffer(s);
            for (int i = 0; i < K; i++) {
                if (result.charAt(0) == '0') {
                    result.replace(0, 1, "1");
                } else {
                    result.append("0");
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
