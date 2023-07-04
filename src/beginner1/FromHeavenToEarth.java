package beginner1;

import java.util.Scanner;

public class FromHeavenToEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int V1 = sc.nextInt();
            int V2 = sc.nextInt();
            double root = N * Math.sqrt(2);
            double doubled = 2 * N;
            double stairs = root / V1;
            double elevator = doubled / V2;
            if (stairs < elevator) {
                System.out.println("Stairs");
            } else System.out.println("Elevator");
            T--;
        }
    }
}
