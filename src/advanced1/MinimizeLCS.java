package advanced1;

import java.util.Scanner;

public class MinimizeLCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String A = sc.nextLine();
            String B = sc.nextLine();
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            for (int i = 0; i < N; i++) {
                arr1[A.charAt(i) - 'a']++;
                arr2[B.charAt(i) - 'a']++;
            }
            int result = 0;
            for (int i = 0; i < 26; i++) {
                result = Math.max(result, Math.min(arr2[i], arr1[i]));
            }
            System.out.println(result);
            T--;
        }
    }
}
