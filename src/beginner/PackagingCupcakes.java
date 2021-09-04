package beginner;

import java.util.Scanner;

public class PackagingCupcakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                int N = sc.nextInt();
                int packages = N / 2;
                System.out.println(packages + 1);
                t--;
            }
        }
    }
}
