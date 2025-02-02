package advanced1;

import java.util.Scanner;

public class EidiGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] A = new int[3];
            int[] C = new int[3];
            for (int i = 0; i < 3; i++) {
                A[i] = sc.nextInt();
            }
            for (int j = 0; j < 3; j++) {
                C[j] = sc.nextInt();
            }
            int flag = 1;
            int temp1 = 0, temp2 = 1;
            while (temp1 < 2 && temp2 < 3) {
                if (A[temp1] == A[temp2]) {
                    if (C[temp1] != C[temp2]) {
                        flag = 0;
                    }
                } else if (A[temp1] > A[temp2]) {
                    if (C[temp1] <= C[temp2]) {
                        flag = 0;
                    }
                } else if (A[temp1] < A[temp2]) {
                    if (C[temp1] >= C[temp2]) {
                        flag = 0;
                    }
                }
                temp1++;
                temp2++;
                if (temp1 == 2 && temp2 == 3) {
                    temp1 = 0;
                    temp2 = 2;
                }
            }
            if (flag == 0) {
                System.out.println("NOT FAIR");
            } else {
                System.out.println("FAIR");
            }
            T--;
        }
    }
}
