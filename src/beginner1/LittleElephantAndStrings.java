package beginner1;

import java.util.Scanner;

public class LittleElephantAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String A[] = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
        }
        while (K > 0) {
            String s = sc.next();
            if (s.length() >= 47) {
                System.out.println("Good");
            } else {
                int flag = 0;
                for (int j = 0; j < N; j++) {
                    if (s.contains(String.valueOf(A[j]))) {
                        flag = 1;
                    }
                }
                if (flag == 1) {
                    System.out.println("Good");
                } else {
                    System.out.println("Bad");
                }
            }
            K--;
        }
    }
}
