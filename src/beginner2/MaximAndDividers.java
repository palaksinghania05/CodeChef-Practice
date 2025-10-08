package beginner2;

import java.util.Scanner;

public class MaximAndDividers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= (int) Math.sqrt(N); i++) {
                if (N % i == 0) {
                    String temp1 = String.valueOf(i);
                    String temp2 = String.valueOf(N / i);
                    if (temp1.contains("7") || temp1.contains("4")) {
                        result++;
                    }
                    if (!(temp1.equals(temp2))) {
                        if (temp2.contains("7") || temp2.contains("4")) {
                            result++;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
