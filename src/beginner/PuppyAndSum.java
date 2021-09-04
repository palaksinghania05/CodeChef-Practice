package beginner;

import java.util.Scanner;

public class PuppyAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int d = sc.nextInt();
                int n = sc.nextInt();
                int sum = 0;
                while (d > 0) {
                    sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum = sum + i;
                    }
                    n = sum;
                    d--;
                }
                System.out.println(sum);
            }
        }
    }
}
