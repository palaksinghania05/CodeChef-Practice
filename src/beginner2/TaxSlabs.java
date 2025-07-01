package beginner2;

import java.util.Scanner;

public class TaxSlabs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N <= 250000) {
                System.out.println(N);
            } else if (N <= 500000) {
                double result = 0;
                result = 0.05 * (N - 250000);
                int f1 = (int) (N - result);
                System.out.println(f1);
            } else if (N <= 750000) {
                double slab2 = 0;
                slab2 = 0.05 * (500000 - 250000) + 0.1 * (N - 500000);
                int f2 = (int) (N - slab2);
                System.out.println(f2);
            } else if (N <= 1000000) {
                double slab3 = 0;
                slab3 = 0.05 * (500000 - 250000) + 0.1 * (750000 - 500000) + 0.15 * (N - 750000);
                int f3 = (int) (N - slab3);
                System.out.println(f3);
            } else if (N <= 1250000) {
                double slab4 = 0;
                slab4 = 0.05 * (500000 - 250000) + 0.1 * (750000 - 500000) + 0.15 * (1000000 - 750000) + 0.2 * (N - 1000000);
                int f4 = (int) (N - slab4);
                System.out.println(f4);
            } else if (N <= 1500000) {
                double slab5 = 0;
                slab5 = 0.05 * (500000 - 250000) + 0.1 * (750000 - 500000) + 0.15 * (1000000 - 750000) + 0.2 * (1250000 - 1000000) + 0.25 * (N - 1250000);
                int f5 = (int) (N - slab5);
                System.out.println(f5);
            } else {
                double slab6 = 0;
                slab6 = 0.05 * (500000 - 250000) + 0.1 * (750000 - 500000) + 0.15 * (1000000 - 750000) + 0.2 * (1250000 - 1000000) + 0.25 * (1500000 - 1250000) + 0.3 * (N - 1500000);
                int f6 = (int) (N - slab6);
                System.out.println(f6);
            }
        }
    }
}
