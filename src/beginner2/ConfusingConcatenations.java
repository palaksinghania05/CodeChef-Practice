package beginner2;

import java.util.Scanner;

public class ConfusingConcatenations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            arr[0] = sc.nextInt();
            int max = arr[0];
            int temp = 0;
            for (int i = 1; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > max && temp == 0) {
                    max = arr[i];
                    temp = i;
                }
            }
            if (temp == 0) {
                System.out.println("-1");
            } else {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < temp; i++) {
                    sb1.append(arr[i]).append(" ");
                }
                for (int i = temp; i < N; i++) {
                    sb2.append(arr[i]).append(" ");
                }
                System.out.println(temp);
                System.out.println(sb1);
                System.out.println((N - temp));
                System.out.println(sb2);
            }
        }
    }
}
