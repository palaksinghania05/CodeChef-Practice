package beginner1;

import java.util.Scanner;

public class MultipleChoiceExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            String U = sc.next();
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (S.charAt(j) != U.charAt(j) && j < N - 1 && U.charAt(j) != 'N') {
                    j++;
                } else if (U.charAt(j) == 'N') {
                    continue;
                } else if (S.charAt(j) == U.charAt(j)) {
                    count++;
                }
                if (S.charAt(j) != U.charAt(j) && j == N - 1) {
                    break;
                } else if (U.charAt(j) == 'N' && j == N - 1) {
                    break;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
