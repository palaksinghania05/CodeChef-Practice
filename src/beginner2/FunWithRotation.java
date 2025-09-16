package beginner2;

import java.util.Scanner;

public class FunWithRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < M; i++) {
            char ch = sc.next().charAt(0);
            int ele = sc.nextInt();
            if (ch == 'R') {
                System.out.println(A[(result + ele - 1) % N]);
            } else if (ch == 'C') {
                result = (result + ele) % N;
            } else if (ch == 'A') {
                result = (result + N - ele) % N;
            }
        }
    }
}
