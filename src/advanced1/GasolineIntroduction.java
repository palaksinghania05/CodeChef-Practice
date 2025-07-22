package advanced1;

import java.util.Scanner;

public class GasolineIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int temp1 = 0;
            int temp2 = 0;
            temp1 = arr[0];
            for (int i = 1; i < N; i++) {
                if (temp1 == 0) {
                    break;
                }
                temp2++;
                temp1--;
                temp1 += arr[i];
            }
            System.out.println(temp2 + temp1);
        }
    }
}
