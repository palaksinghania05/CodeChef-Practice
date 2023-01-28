package beginner1;

import java.util.Scanner;

public class FoodChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int E = sc.nextInt();
            int K = sc.nextInt();
            int level = 1;
            while (E / K > 0) {
                level++;
                E = (int) Math.floor(E / K);
            }
            System.out.println(level);
            T--;
        }
    }
}
