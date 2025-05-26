package beginner1;

import java.util.Scanner;

public class CielAndABProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = A - B;
        if (result % 10 == 9)
            System.out.println(result - 1);
        else
            System.out.println(result + 1);
    }
}
