package advanced1;

import java.util.Scanner;

public class LongestCommonPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S1 = sc.next();
            String S2 = sc.next();
            int[] arr1 = new int[123];
            int[] arr2 = new int[123];
            int ele;
            int result = 0;
            for (int i = 0; i < S1.length(); i++) {
                ele = (int) S1.charAt(i);
                arr1[ele]++;
            }
            for (int j = 0; j < S2.length(); j++) {
                ele = (int) S2.charAt(j);
                arr2[ele]++;
            }
            for (int i = 0; i < 123; i++) {
                int k = Math.min(arr1[i], arr2[i]);
                result += k;
            }
            System.out.println(result);
            T--;
        }
    }
}
