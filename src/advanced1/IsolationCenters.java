package advanced1;

import java.util.Scanner;

public class IsolationCenters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            sc.nextLine();
            String S = sc.next();
            char[] C = new char[26];
            for (int i = 0; i < N; i++) {
                C[S.charAt(i) - 'a']++;
            }
            while (Q-- > 0) {
                int temp = sc.nextInt();
                int result = 0;
                char[] arr = C.clone();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] - temp > 0) {
                        arr[i] -= (char) temp;
                        result += arr[i];
                    }
                }
                System.out.println(result);
            }
            T--;
        }
    }
}
