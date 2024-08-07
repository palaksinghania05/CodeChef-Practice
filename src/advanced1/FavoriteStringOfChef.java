package advanced1;

import java.util.Scanner;

public class FavoriteStringOfChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int temp = S.indexOf("chef");
            String str = S.substring(0, temp);
            if (str.contains("code"))
                System.out.println("AC");
            else
                System.out.println("WA");
            T--;
        }
    }
}
