package advanced1;

import java.util.Scanner;

public class SwappingChefsWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            for (int i = 0; i < N / 2; i++) {
                if (arr[i] > arr[N - 1 - i]) {
                    char temp = arr[i];
                    arr[i] = arr[N - 1 - i];
                    arr[N - 1 - i] = temp;
                }
            }
            int flag = 0;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else
                System.out.println("YES");
            T--;
        }
    }
}
