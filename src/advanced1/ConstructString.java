package advanced1;

import java.util.Scanner;

public class ConstructString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String U = sc.next();
            StringBuilder result = new StringBuilder();
            if (N == 1) {
                result.append(U);
            } else {
                int count = 1;
                for (int i = 0; i < N - 1; i++) {
                    if (U.charAt(i) != U.charAt(i + 1)) {
                        result.append(U.charAt(i));
                    } else {
                        while (U.charAt(i) == U.charAt(i + 1)) {
                            count++;
                            i++;
                            if (i >= N - 1) {
                                break;
                            }
                        }
                        result.append(U.charAt(i));
                        if (count % 2 == 0) {
                            result.append(U.charAt(i));
                        }
                        count = 1;
                    }
                }
                if (U.charAt(N - 2) != U.charAt(N - 1)) {
                    result.append(U.charAt(N - 1));
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
