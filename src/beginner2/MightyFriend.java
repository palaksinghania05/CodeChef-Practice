package beginner2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MightyFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(), K = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            int sumA = 0, sumB = 0;
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                if (i % 2 == 0) {
                    A.add(temp);
                    sumA += temp;
                } else {
                    B.add(temp);
                    sumB += temp;
                }
            }
            if (sumB > sumA) {
                System.out.println("YES");
                continue;
            }
            A.sort(Collections.reverseOrder());
            Collections.sort(B);
            for (int i = 0; i < Math.min(K, Math.min(A.size(), B.size())); i++) {
                sumA -= A.get(i) - B.get(i);
                sumB += A.get(i) - B.get(i);
            }
            System.out.println(sumB > sumA ? "YES" : "NO");
        }
    }
}
