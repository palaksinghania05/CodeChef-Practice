package beginner1;

import java.util.Scanner;

public class TravelPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            String s = sc.next();
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (s.charAt(i) == '0')
                    result += A;
                else
                    result += B;
            }
            System.out.println(result);
            T--;
        }
    }
}
