package beginner;

import java.util.Scanner;

public class NumberMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            long n = sc.nextLong();
            System.out.println(n);
        }
    }
}
