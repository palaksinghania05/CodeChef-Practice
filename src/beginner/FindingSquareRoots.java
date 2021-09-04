package beginner;

import java.util.Scanner;

public class FindingSquareRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                int n = sc.nextInt();
                System.out.println((int) (Math.floor(Math.sqrt(n))));
                t--;
            }
        }
    }
}
