package beginner2;

import java.util.Scanner;

public class ChefAndHisCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int temp1 = 0;
            int temp2 = 0;
            int temp3 = 0;
            int temp4 = 0;
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                for (int j = 0; j < K; j++) {
                    if (s.charAt(j) == 'R') {
                        if ((i + j) % 2 == 0)
                            temp1++;
                        else
                            temp4++;
                    } else {
                        if ((i + j) % 2 == 0)
                            temp2++;
                        else
                            temp3++;
                    }
                }
            }
            System.out.println(Math.min(temp1 * 5 + temp3 * 3, temp2 * 3 + temp4 * 5));
        }
    }
}
