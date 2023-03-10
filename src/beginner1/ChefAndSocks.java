package beginner1;

import java.util.Scanner;

public class ChefAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jacketCost = sc.nextInt();
        int sockCost = sc.nextInt();
        int money = sc.nextInt();
        int remaining = money - jacketCost;
        if ((remaining / sockCost) % 2 == 0) {
            System.out.println("Lucky Chef");
        } else {
            System.out.println("Unlucky Chef");
        }
    }
}
