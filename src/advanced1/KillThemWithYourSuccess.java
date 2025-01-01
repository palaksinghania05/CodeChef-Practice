package advanced1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KillThemWithYourSuccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            double[] A = new double[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            double result = 0;
            PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < N; i++) {
                queue.add(A[i]);
            }
            while (queue.size() != 1) {
                double temp1 = queue.poll();
                double temp2 = queue.poll();
                result = (temp1 + temp2) / 2;
                queue.add(result);
            }
            System.out.printf("%.8f\n", result);
            T--;
        }
    }
}
