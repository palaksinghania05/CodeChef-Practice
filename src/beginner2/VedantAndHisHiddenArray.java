package beginner2;

import java.util.Scanner;

public class VedantAndHisHiddenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- != 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            if (A % 2 == 1) {
                System.out.println(N % 2 == 0 ? "Even" : "Odd");
            } else {
                System.out.println(N == 1 ? "Even" : "Impossible");
            }
        }
        sc.close();
    }
}
