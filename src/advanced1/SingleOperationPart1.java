package advanced1;

import java.util.Scanner;

public class SingleOperationPart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
