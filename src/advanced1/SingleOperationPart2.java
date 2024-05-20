package advanced1;

import java.util.Scanner;

public class SingleOperationPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int result = 1;
            for (int i = 1; i < N; i++) {
                if (S.charAt(i) == '0') {
                    result++;
                } else {
                    break;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
