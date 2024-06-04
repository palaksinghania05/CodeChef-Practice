package advanced1;

import java.util.Scanner;

public class WhatsInTheName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String[] names = sc.nextLine().trim().split("\\s+");
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < names.length - 1; i++) {
                str.append(names[i].toUpperCase().charAt(0)).append(". ");
            }
            str.append(names[names.length - 1].substring(0, 1).toUpperCase());
            str.append(names[names.length - 1].substring(1).toLowerCase());
            System.out.println(str);
            T--;
        }
    }
}
